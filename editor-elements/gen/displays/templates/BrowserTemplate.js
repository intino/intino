import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiDisplayStamp from "alexandria-ui-elements/src/displays/components/DisplayStamp";
import DisplaysIntinoFileBrowser from "editor-elements/src/displays/IntinoFileBrowser";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import BrowserTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import BrowserTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class BrowserTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new BrowserTemplateNotifier(this);
		this.requester = new BrowserTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical flexible" width="100.0%" height={this.fixHeight != null ? this.fixHeight("100.0%") : "100.0%"} style={{...this.props.style,...display}}>
				<UiDisplayStamp context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1192549040" format="displayHeaderPanel smallAirRight">
				</UiDisplayStamp>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(BrowserTemplate));
DisplayFactory.register("BrowserTemplate", withStyles(styles, { withTheme: true })(withSnackbar(BrowserTemplate)));