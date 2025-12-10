import Notifier from "./Notifier";

export default class GoogleLoginDisplayNotifier extends Notifier {
	constructor(element) {
		super(element);
		this.setup();
	};

	setup() {
		if (this.element == null || this.pushLinked) return;
		super.setup();
		this.when("refresh").toSelf().execute((parameters) => this.element.refresh(parameters.v));
		this.when("logout").toSelf().execute(() => this.element.logout());
		this.pushLinked = true;
	};
}