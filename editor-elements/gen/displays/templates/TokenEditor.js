import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import TokenEditorNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import TokenEditorRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class TokenEditor extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new TokenEditorNotifier(this);
		this.requester = new TokenEditorRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="horizontal center" style={{...this.props.style,...display}}>
				<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a471893393" format="bold h5 smallAirRight" mode="normal">
				</UiText>
				<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a308532707" title="Delete" target="self" mode="MaterialIconButton" icon="Clear" size="Small" format="smallIconSize">
				</UiAction>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(TokenEditor));
DisplayFactory.register("TokenEditor", withStyles(styles, { withTheme: true })(withSnackbar(TokenEditor)));