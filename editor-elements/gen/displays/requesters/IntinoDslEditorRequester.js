import Requester from "./Requester";

export default class IntinoDslEditorRequester extends Requester {
	constructor(element) {
		super(element);
	};
	fileModified = () => {
		if (this.addToHistory()) return;
		this.pushService.send({ app: this.element.context, op: "fileModified", s: "intinodsleditor", d: this.element.shortId(), o: this.element.props.owner(), c: this.element.props.context()}, this.element.ownerUnit());
	};
	fileContent = (value) => {
		if (this.addToHistory(value)) return;
		this.pushService.send({ app: this.element.context, op: "fileContent", s: "intinodsleditor", d: this.element.shortId(), o: this.element.props.owner(), c: this.element.props.context(), v: encodeURIComponent(JSON.stringify(value))}, this.element.ownerUnit());
	};
	executeCommand = (value) => {
		if (this.addToHistory(value)) return;
		this.pushService.send({ app: this.element.context, op: "executeCommand", s: "intinodsleditor", d: this.element.shortId(), o: this.element.props.owner(), c: this.element.props.context(), v: encodeURIComponent(value)}, this.element.ownerUnit());
	};
	fileSelected = (value) => {
		if (this.addToHistory(value)) return;
		this.pushService.send({ app: this.element.context, op: "fileSelected", s: "intinodsleditor", d: this.element.shortId(), o: this.element.props.owner(), c: this.element.props.context(), v: encodeURIComponent(value)}, this.element.ownerUnit());
	};
	didMount = () => {
		this.pushService.send({ op: "didMount", s: "intinodsleditor", d: this.element.shortId(), o: this.element.props.owner(), c: this.element.props.context()}, this.element.ownerUnit());
	};
}