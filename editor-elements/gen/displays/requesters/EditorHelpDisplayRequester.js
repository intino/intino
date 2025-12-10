import Requester from "./Requester";

export default class EditorHelpDisplayRequester extends Requester {
	constructor(element) {
		super(element);
	};
	didMount = () => {
		this.pushService.send({ op: "didMount", s: "editorhelpdisplay", d: this.element.shortId(), o: this.element.props.owner(), c: this.element.props.context()}, this.element.ownerUnit());
	};
}