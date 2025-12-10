import Requester from "./Requester";

export default class GoogleLoginDisplayRequester extends Requester {
	constructor(element) {
		super(element);
	};
	success = (value) => {
		if (this.addToHistory(value)) return;
		this.pushService.send({ app: this.element.context, op: "success", s: "googlelogindisplay", d: this.element.shortId(), o: this.element.props.owner(), c: this.element.props.context(), v: encodeURIComponent(value)}, this.element.ownerUnit());
	};
	check = (value) => {
		if (this.addToHistory(value)) return;
		this.pushService.send({ app: this.element.context, op: "check", s: "googlelogindisplay", d: this.element.shortId(), o: this.element.props.owner(), c: this.element.props.context(), v: encodeURIComponent(value)}, this.element.ownerUnit());
	};
	failure = () => {
		if (this.addToHistory()) return;
		this.pushService.send({ app: this.element.context, op: "failure", s: "googlelogindisplay", d: this.element.shortId(), o: this.element.props.owner(), c: this.element.props.context()}, this.element.ownerUnit());
	};
	didMount = () => {
		this.pushService.send({ op: "didMount", s: "googlelogindisplay", d: this.element.shortId(), o: this.element.props.owner(), c: this.element.props.context()}, this.element.ownerUnit());
	};
}