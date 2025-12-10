import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiOpenSite from "alexandria-ui-elements/src/displays/components/OpenSite";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import LanguageReleaseHelpNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import LanguageReleaseHelpRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LanguageReleaseHelp extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new LanguageReleaseHelpNotifier(this);
		this.requester = new LanguageReleaseHelpRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" style={{...this.props.style,...display}}>
				<UiOpenSite context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1617040996" title="" target="blank" mode="Link" size="Medium">
				</UiOpenSite>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LanguageReleaseHelp));
DisplayFactory.register("LanguageReleaseHelp", withStyles(styles, { withTheme: true })(withSnackbar(LanguageReleaseHelp)));