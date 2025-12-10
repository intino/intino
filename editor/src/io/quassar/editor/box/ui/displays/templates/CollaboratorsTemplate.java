package io.quassar.editor.box.ui.displays.templates;

import io.quassar.editor.box.EditorBox;

import java.util.*;
import java.util.function.Consumer;

public class CollaboratorsTemplate extends AbstractCollaboratorsTemplate<EditorBox> {
	private String owner;
	private Set<String> collaboratorSet = new HashSet<>();
	private Consumer<List<String>> changeListener;
	private boolean readonly = false;

	public CollaboratorsTemplate(EditorBox box) {
		super(box);
	}

	public void owner(String owner) {
		this.owner = owner;
	}

	public void collaborators(List<String> collaborators) {
		this.collaboratorSet = new HashSet<>(collaborators);
	}

	public void readonly(boolean value) {
		this.readonly = value;
	}

	public void onChange(Consumer<List<String>> listener) {
		this.changeListener = listener;
	}

	@Override
	public void init() {
		super.init();
		invite.onExecute(e -> invitePeople());
//		peopleField.valueProvider(element -> ((User)element).name());
//		peopleField.peopleList.onAddItem(this::refresh);
	}

	@Override
	public void refresh() {
		super.refresh();
		invite.readonly(readonly);
//		peopleField.select();
//		peopleField.source(new CollaboratorsDatasource(box(), session(), new ArrayList<>(collaboratorSet)));
		peopleField.value(null);
		ownerField.value(owner);
		collaborators.clear();
		collaboratorSet.forEach(u -> fill(u, collaborators.add()));
	}

	private void fill(String user, CollaboratorItemTemplate display) {
		display.user(user);
		display.onRemove(this::removeUser);
		display.refresh();
	}

	private void removeUser(String user) {
		collaboratorSet.remove(user);
		notifyChange();
		refresh();
	}

	private void invitePeople() {
		List<String> people = Arrays.stream(peopleField.value().split(";?\\n")).map(String::trim).filter(s -> !s.isEmpty()).toList();
//		List<String> people = !peopleField.selection().isEmpty() ? List.of(((User)peopleField.selection().getFirst()).name()) : Collections.emptyList();
		collaboratorSet.addAll(people);
		peopleField.value(null);
//		peopleField.select();
		notifyChange();
		refresh();
	}

	private void notifyChange() {
		changeListener.accept(new ArrayList<>(collaboratorSet));
	}

//	private void refresh(AddCollectionItemEvent event) {
//		refresh(event.item(), event.component());
//	}
//
//	private void refresh(User user, UserItem display) {
//		display.fullName.value(user.fullname() != null && !user.name().equals(user.fullname()) ? user.fullname() : user.name());
//		display.email.value(user.fullname() != null && !user.name().equals(user.fullname()) ? user.name() : null);
//	}

}