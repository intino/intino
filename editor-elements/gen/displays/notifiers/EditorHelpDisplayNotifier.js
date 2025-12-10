import Notifier from "./Notifier";

export default class EditorHelpDisplayNotifier extends Notifier {
	constructor(element) {
		super(element);
		this.setup();
	};

	setup() {
		if (this.element == null || this.pushLinked) return;
		super.setup();
		this.when("refresh").toSelf().execute(() => this.element.refresh());
		this.pushLinked = true;
	};
}