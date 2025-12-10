import Notifier from "./Notifier";

export default class IntinoDslEditorNotifier extends Notifier {
	constructor(element) {
		super(element);
		this.setup();
	};

	setup() {
		if (this.element == null || this.pushLinked) return;
		super.setup();
		this.when("setup").toSelf().execute((parameters) => this.element.setup(parameters.v));
		this.when("refreshReadonly").toSelf().execute((parameters) => this.element.refreshReadonly(parameters.v));
		this.when("refreshFile").toSelf().execute((parameters) => this.element.refreshFile(parameters.v));
		this.when("receiveContent").toSelf().execute(() => this.element.receiveContent());
		this.pushLinked = true;
	};
}