package io.intino.ls.codeinsight.completion;

import io.intino.tara.language.grammar.TaraGrammar;
import io.intino.tara.model.Element;
import io.intino.tara.model.ElementContainer;
import io.intino.tara.model.Mogram;
import io.intino.tara.processors.model.Model;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.eclipse.lsp4j.Position;

import java.util.List;
import java.util.Objects;

public class TreeUtils {
	public static <T> T contextByType(ParserRuleContext element, Class<T> contextClass) {
		ParserRuleContext parent = element.getParent();
		while (parent != null) {
			if (contextClass.isInstance(parent)) return (T) parent;
			parent = parent.getParent();
		}
		return null;
	}

	public static Element elementOnPosition(Mogram container, ParserRuleContext ctx, Position position) {
		if (container == null) return null;
		for (Element element : container.elements())
			if (element.textRange().startLine() == position.getLine()) return element;
		TaraGrammar.SignaturePropertyContext sigProperty = (TaraGrammar.SignaturePropertyContext) TreeUtils.contextByType(ctx, TaraGrammar.SignaturePropertyContext.class);
		if (sigProperty != null) return container.parameters().stream().filter(pd -> {
			if (sigProperty.IDENTIFIER() != null && pd.name().equals(sigProperty.IDENTIFIER().getText()))
				return true;
			return false;
		}).findFirst().orElse(null);
		TaraGrammar.PropertyDescriptiveContext description = (TaraGrammar.PropertyDescriptiveContext) TreeUtils.contextByType(ctx, TaraGrammar.PropertyDescriptiveContext.class);
		if (description != null) return container.parameters().stream().filter(pd -> {
			if (description.IDENTIFIER() != null && pd.name().equals(description.IDENTIFIER().getText()))
				return true;
			return false;
		}).findFirst().orElse(null);
		return null;
	}

	public static boolean isIn(ParserRuleContext element, Class<? extends ParserRuleContext> contextClass) {
		return contextByType(element, contextClass) != null;
	}

	public static Mogram getMogramContainerOn(Model model, Position position) {
		if (model == null) return null;
		return model.mograms().stream()
				.map(element -> findInElement((ElementContainer) element, position))
				.filter(Objects::nonNull)
				.findFirst()
				.orElse(null);
	}

	public static Mogram getMogramContainer(Model model, ParserRuleContext context) {
		return getMogramContainerOn(model, new Position(context.getStart().getLine(), context.getStart().getCharPositionInLine()));
	}

	public static io.intino.tara.model.PropertyDescription findPropertyDescription(List<io.intino.tara.model.PropertyDescription> parameters, String facet, String name, int position) {
		for (io.intino.tara.model.PropertyDescription parameter : parameters)
			if (!parameter.name().isEmpty() && parameter.name().equals(name)) return parameter;
		return byPosition(parameters, facet, position);
	}

	private static io.intino.tara.model.PropertyDescription byPosition(List<io.intino.tara.model.PropertyDescription> parameters, String facet, int position) {
		for (io.intino.tara.model.PropertyDescription parameter : parameters) {
			if (parameter.name().isEmpty() && parameter.facet().equals(facet) && parameter.position() == position)
				return parameter;
		}
		return null;
	}

	public static ParserRuleContext getMogramContainerRuleOf(ParserRuleContext context) {
		ParserRuleContext parent = context.getParent();
		while (parent != null) {
			if (parent instanceof TaraGrammar.MogramContext) return parent;
			parent = parent.getParent();
		}
		return null;
	}

	public static ParseTree getPreviousSibling(ParserRuleContext ctx) {
		ParserRuleContext parent = ctx.getParent();
		if (parent == null) {
			return null; // No hay padre, no hay hermanos
		}

		List<ParseTree> children = parent.children;
		if (children == null || children.size() < 2) {
			return null; // No hay suficientes hijos para tener un hermano anterior
		}

		for (int i = 1; i < children.size(); i++) {
			if (children.get(i) == ctx) {
				return children.get(i - 1); // Hermano anterior
			}
		}

		return null; // No encontrado
	}

	private static Mogram findInElement(ElementContainer element, Position position) {
		Element.TextRange range = element.textRange();
		if (!contains(range, position)) return null;
		if (element.mograms().isEmpty()) return (Mogram) element;
		Mogram innerMogram = element.mograms().stream()
				.map(mogram -> findInElement(mogram, position))
				.filter(Objects::nonNull)
				.findFirst()
				.orElse(null);
		if (innerMogram == null) return (Mogram) element;
		else return innerMogram;
	}

	public static boolean contains(Element.TextRange range, Position position) {
		return isBeforeOrEqual(new Position(range.startLine(), range.startColumn()), position) && isBeforeOrEqual(position, new Position(range.endLine(), range.endColumn()));
	}

	private static boolean isBefore(Position p1, Position p2) {
		return p1.getLine() < p2.getLine() || (p1.getLine() == p2.getLine() && p1.getCharacter() < p2.getCharacter());
	}

	private static boolean isBeforeOrEqual(Position p1, Position p2) {
		return p1.getLine() < p2.getLine() || (p1.getLine() == p2.getLine() && p1.getCharacter() <= p2.getCharacter());
	}

	private static boolean isAfter(Position p1, Position p2) {
		return isBefore(p2, p1);
	}

	public static Token findToken(TokenStream tokens, int line, int column) {
		for (int i = 0; i < tokens.size(); i++) {
			Token token = tokens.get(i);
			if (token.getLine() == line) {
				int tokenStart = token.getCharPositionInLine();
				int tokenEnd = tokenStart + token.getText().length();
				if (column >= tokenStart && column < tokenEnd) {
					return token;
				}
			}
		}
		return null;
	}

	public static ParserRuleContext findRuleContainingToken(ParserRuleContext ctx, Token token) {
		Token startToken = ctx.getStart();
		Token stopToken = ctx.getStop();
		if (token.getTokenIndex() >= startToken.getTokenIndex() && token.getTokenIndex() <= stopToken.getTokenIndex()) {
			for (int i = 0; i < ctx.getChildCount(); i++) {
				ParseTree child = ctx.getChild(i);
				if (child instanceof ParserRuleContext) {
					ParserRuleContext result = findRuleContainingToken((ParserRuleContext) child, token);
					if (result != null) return result;
				}
			}
			return ctx;
		}
		return null;
	}
}
