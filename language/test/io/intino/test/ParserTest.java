package io.intino.test;

import io.intino.tara.Source.StringSource;
import io.intino.tara.language.grammar.SyntaxException;
import io.intino.tara.model.*;
import io.intino.tara.model.rules.Size;
import io.intino.tara.model.rules.custom.Named;
import io.intino.tara.model.rules.property.IntegerRule;
import io.intino.tara.model.rules.property.NativeObjectRule;
import io.intino.tara.model.rules.property.WordRule;
import io.intino.tara.processors.model.HasMogram;
import io.intino.tara.processors.model.Model;
import io.intino.tara.processors.model.ReferenceProperty;
import io.intino.tara.processors.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static io.intino.tara.model.Annotation.Private;
import static io.intino.tara.model.Annotation.Reactive;
import static io.intino.tara.model.Primitive.*;
import static org.junit.Assert.*;

public class ParserTest {
	@Test
	public void meta1Test() throws SyntaxException {
		Model model = parse(M2Examples.minimumExample());
		List<Mogram> components = model.components();
		assertFalse(components.isEmpty());
		assertEquals("A", components.get(0).name());
		assertEquals("C", components.get(1).name());
		assertEquals("Dc", components.get(1).components().get(0).name());
		assertEquals("E", components.get(1).components().get(1).name());
		assertEquals("MetaConcept", components.get(1).components().get(0).types().get(0));
		assertEquals("Concept", components.get(1).components().get(1).types().get(0));
	}

	@Test
	public void meta2Test() throws SyntaxException {
		Model model = parse(M2Examples.propertiesExample());
		List<Mogram> components = model.components();
		assertFalse(components.isEmpty());
		assertEquals("Car", components.get(0).name());
		assertEquals(1, model.rulesOf(components.get(0)).size());
		assertTrue(model.rulesOf(components.get(0)).get(0) instanceof Size);
		assertEquals("Concept", components.get(0).types().get(0));
		assertEquals("name", property(components.get(0).properties(), "name").name());
		assertEquals(STRING, property(components.get(0).properties(), "name").type());
		assertEquals("years", property(components.get(0).properties(), "years").name());
		assertEquals(INTEGER, property(components.get(0).properties(), "years").type());
		assertEquals("cost", property(components.get(0).properties(), "cost").name());
		assertEquals(DOUBLE, property(components.get(0).properties(), "cost").type());
		assertEquals("plateDate", property(components.get(0).properties(), "plateDate").name());
		assertEquals(INSTANT, property(components.get(0).properties(), "plateDate").type());
		assertEquals("plateDate2", property(components.get(0).properties(), "plateDate2").name());
		assertEquals(DATE, property(components.get(0).properties(), "plateDate2").type());
	}

	private Property property(List<Property> properties, String prop) {
		return properties.stream().filter(p -> p.name().equals(prop)).findFirst().orElse(null);
	}

	@Test
	public void meta3Test() throws SyntaxException {
		Model model = parse(M2Examples.rulesExample());
		List<Mogram> components = model.components();
		assertFalse(components.isEmpty());
		Mogram broker = components.get(0);
		assertEquals("Broker", broker.name());
		assertEquals(1, model.rulesOf(broker).size());
		Size size = (Size) model.rulesOf(broker).get(0);
		assertTrue(size.isSingle());
		assertFalse(size.isRequired());

		Property implementation = property(broker.properties(), "implementation");
		assertEquals("implementation", implementation.name());
		assertEquals(OBJECT, implementation.type());
		assertTrue(implementation.rules().stream().anyMatch(r -> r instanceof NativeObjectRule));
		NativeObjectRule rule = (NativeObjectRule) implementation.rules().stream().filter(r -> r instanceof NativeObjectRule).findFirst().get();
		assertEquals(rule.declaredType(), "BrokerImplementation");

		Mogram destination = components.get(0).components().get(0);
		assertEquals("CompositeDestination", destination.name());
		Property type = property(destination.properties(), "type");
		assertEquals("type", type.name());
		assertEquals(WORD, type.type());
		assertTrue(type.rules().stream().anyMatch(r -> r instanceof WordRule));
		WordRule wordRule = (WordRule) type.rules().stream().filter(r -> r instanceof WordRule).findFirst().get();
		Assert.assertArrayEquals(new String[]{"Topic", "Queue"}, wordRule.words().toArray(new String[0]));
		Property forwardTo = property(destination.properties(), "forwardTo");
		assertEquals("forwardTo", forwardTo.name());
		assertEquals(STRING, forwardTo.type());
		assertTrue(forwardTo.isMultiple());
	}

	@Test
	public void meta4Test() throws SyntaxException {
		Model model = parse(M2Examples.badReferencesExample());
		List<Mogram> components = model.components();
		assertFalse(components.isEmpty());
		Mogram datamart = components.get(0);
		assertEquals(2, model.rulesOf(datamart).size());
		Size size = (Size) model.rulesOf(datamart).get(0);
		assertFalse(size.isSingle());
		assertFalse(size.isRequired());

		assertTrue(model.rulesOf(datamart).get(1) instanceof Named);

		Property scale = datamart.properties().get(0);
		assertEquals(WORD, scale.type());
		assertFalse(scale.isMultiple());
		assertEquals(1, scale.values().size());
		assertTrue(scale.values().get(0) instanceof Primitive.Reference);
		assertEquals("None", ((Primitive.Reference) scale.values().get(0)).get().reference());

		Property maxCount = datamart.properties().get(1);
		assertEquals(1, maxCount.values().size());
		assertEquals(-1, maxCount.values().get(0));
		assertEquals(2, maxCount.rules().size());
		Property last = datamart.properties().get(2);
		assertTrue(last.isReference());
		assertEquals(1, last.values().size());
		assertTrue(last instanceof ReferenceProperty);
		assertEquals("Snapshot", ((ReferenceProperty) last).target().reference());

		assertTrue(((Primitive.Reference) last.values().get(0)).isEmpty());

		assertEquals(2, datamart.referenceComponents().size());
		HasMogram entityRef = (HasMogram) datamart.referenceComponents().get(0);
		assertEquals(1, entityRef.annotations().size());
		assertEquals(Private, entityRef.annotations().get(0));
		assertEquals("Entity", entityRef.target().reference());
		assertEquals(1, datamart.rulesOf(entityRef).size());

		HasMogram reel = (HasMogram) datamart.referenceComponents().get(1);
		assertEquals(0, reel.annotations().size());
		assertEquals("Reel", reel.target().reference());
		assertEquals(2, datamart.rulesOf(reel).size());
		assertTrue(datamart.rulesOf(reel).get(1) instanceof Named);
	}

	@Test
	public void meta5Test() throws SyntaxException {
		Model model = parse(M2Examples.facetsExample());
		List<Mogram> components = model.components();
		assertEquals(1, components.size());
		Mogram timeline = components.get(0);
		assertEquals(2, model.rulesOf(timeline).size());
		Size size = (Size) model.rulesOf(timeline).get(0);
		assertFalse(size.isSingle());
		assertFalse(size.isRequired());
		assertEquals(1, timeline.facets().size());
		Mogram facet = timeline.facets().get(0);
		assertEquals("Concept", facet.types().get(0));
		assertEquals(1, facet.properties().size());
		assertEquals(1, facet.components().size());
		assertEquals(2, facet.rulesOf(facet.components().get(0)).size());
		assertNotNull(facet.facetPrescription());
		Mogram cooked = model.mograms().get(1);
		assertNotNull(cooked.facetPrescription());
		assertEquals("Timeline", cooked.facetPrescription().reference());
	}

	@Test
	public void meta6Test() throws SyntaxException {
		Model model = parse(M2Examples.facetsOverridenExample());
		List<Mogram> components = model.components();
		assertEquals(1, components.size());
		Mogram data = components.get(0);
		assertEquals(0, data.components().size());
		assertEquals(1, model.rulesOf(data).size());
		assertEquals(2, data.annotations().size());
		assertEquals(4, data.facets().size());
		Mogram listFacet = data.facets().get(0);
		assertEquals("Concept", listFacet.types().get(0));
		assertEquals(0, listFacet.properties().size());
		assertEquals(0, listFacet.components().size());
		assertNotNull(listFacet.facetPrescription());

		Mogram typeFacet = data.facets().get(1);
		assertTrue(typeFacet.annotations().contains(Annotation.Generalization));
		assertEquals("Concept", typeFacet.types().get(0));
		assertEquals(4, typeFacet.properties().size());
		assertEquals(0, typeFacet.components().size());
		assertNotNull(typeFacet.facetPrescription());
		assertEquals("primitive", typeFacet.properties().get(1).name());
		assertNull(typeFacet.properties().get(1).overriden());
		assertEquals(List.of(Reactive, Private), typeFacet.properties().get(1).annotations());

		assertEquals("size", typeFacet.properties().get(2).name());
		Rule<?> rule = typeFacet.properties().get(2).rules().get(2);
		assertTrue(rule instanceof IntegerRule);
		assertEquals("bits", ((IntegerRule) rule).metric());
		assertEquals("bits", typeFacet.properties().get(2).metric());
		assertEquals("maxSize", typeFacet.properties().get(3).name());
		assertEquals(1, typeFacet.properties().get(3).annotations().size());
		assertEquals(Private, typeFacet.properties().get(3).annotations().get(0));

		Mogram realFacet = data.facets().get(2);
		assertEquals(typeFacet, realFacet.parent().get());
		assertEquals("Concept", realFacet.types().get(0));
		assertEquals(4, realFacet.properties().size());
		assertEquals(0, realFacet.components().size());
		assertNotNull(realFacet.facetPrescription());

		Mogram doubleFacet = data.facets().get(3);
		assertEquals(realFacet, doubleFacet.parent().get());
		assertEquals("Concept", doubleFacet.types().get(0));
		assertEquals(2, doubleFacet.properties().size());
		assertEquals(0, doubleFacet.components().size());
		assertNotNull(doubleFacet.facetPrescription());
	}

	@Test
	public void meta7Test() {
		try {
			Model model = parse(M2Examples.badSignatureExample());
			Assert.fail();
		} catch (SyntaxException ignored) {
		}
	}

	@Test
	public void meta8Test() {
		try {
			Model model = parse(M2Examples.multilineExample());
			Mogram mogram = model.mograms().get(0);
			Assert.assertNotNull(mogram.properties().get(0).values().get(0));
		} catch (SyntaxException e) {
			System.err.println(e.getMessage());
		}
	}

	private static Model parse(String example) throws SyntaxException {
		Parser parser = new Parser(new StringSource("file:///Metamodel.tara", example));
		return parser.convert(parser.parse(true));
	}
}