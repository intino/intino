import Requester from "./Requester";

export default class HelpEditorRequester extends Requester {
	constructor(element) {
		super(element);
	};
	update = (value) => {
		if (this.addToHistory(value)) return;
		this.pushService.send({ app: this.element.context, op: "update", s: "helpeditor", d: this.element.shortId(), o: this.element.props.owner(), c: this.element.props.context(), v: encodeURIComponent(value)}, this.element.ownerUnit());
	};
	didMount = () => {
		this.pushService.send({ op: "didMount", s: "helpeditor", d: this.element.shortId(), o: this.element.props.owner(), c: this.element.props.context()}, this.element.ownerUnit());
	};
}