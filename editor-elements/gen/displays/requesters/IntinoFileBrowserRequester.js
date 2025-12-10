import Requester from "./Requester";

export default class IntinoFileBrowserRequester extends Requester {
	constructor(element) {
		super(element);
	};
	open = (value) => {
		if (this.addToHistory(value)) return;
		this.pushService.send({ app: this.element.context, op: "open", s: "intinofilebrowser", d: this.element.shortId(), o: this.element.props.owner(), c: this.element.props.context(), v: encodeURIComponent(value)}, this.element.ownerUnit());
	};
	rename = (value) => {
		if (this.addToHistory(value)) return;
		this.pushService.send({ app: this.element.context, op: "rename", s: "intinofilebrowser", d: this.element.shortId(), o: this.element.props.owner(), c: this.element.props.context(), v: encodeURIComponent(JSON.stringify(value))}, this.element.ownerUnit());
	};
	move = (value) => {
		if (this.addToHistory(value)) return;
		this.pushService.send({ app: this.element.context, op: "move", s: "intinofilebrowser", d: this.element.shortId(), o: this.element.props.owner(), c: this.element.props.context(), v: encodeURIComponent(JSON.stringify(value))}, this.element.ownerUnit());
	};
	executeOperation = (value) => {
		if (this.addToHistory(value)) return;
		this.pushService.send({ app: this.element.context, op: "executeOperation", s: "intinofilebrowser", d: this.element.shortId(), o: this.element.props.owner(), c: this.element.props.context(), v: encodeURIComponent(JSON.stringify(value))}, this.element.ownerUnit());
	};
	didMount = () => {
		this.pushService.send({ op: "didMount", s: "intinofilebrowser", d: this.element.shortId(), o: this.element.props.owner(), c: this.element.props.context()}, this.element.ownerUnit());
	};
}