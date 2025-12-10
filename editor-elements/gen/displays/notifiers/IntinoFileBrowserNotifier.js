import Notifier from "./Notifier";

export default class IntinoFileBrowserNotifier extends Notifier {
	constructor(element) {
		super(element);
		this.setup();
	};

	setup() {
		if (this.element == null || this.pushLinked) return;
		super.setup();
		this.when("refresh").toSelf().execute((parameters) => this.element.refresh(parameters.v));
		this.when("select").toSelf().execute((parameters) => this.element.select(parameters.v));
		this.when("openContextMenu").toSelf().execute((parameters) => this.element.openContextMenu(parameters.v));
		this.pushLinked = true;
	};
}