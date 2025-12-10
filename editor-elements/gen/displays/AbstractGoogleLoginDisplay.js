import React from "react";
import UiDisplay from "alexandria-ui-elements/src/displays/Display";
import Notifier from "./notifiers/Notifier";
import Requester from "./requesters/Requester";

export default class AbstractGoogleLoginDisplay extends UiDisplay {

	constructor(props) {
		super(props);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<React.Fragment>
			</React.Fragment>
		);
	}
}