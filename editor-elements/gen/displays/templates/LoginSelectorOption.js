import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import LoginSelectorOptionNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import LoginSelectorOptionRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LoginSelectorOption extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new LoginSelectorOptionNotifier(this);
		this.requester = new LoginSelectorOptionRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="horizontal flexible center" style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1792013304" layout="vertical flexible">
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1792013304.a_432655719" mode="normal">
					</UiText>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a691825727" layout="horizontal endjustified">
					<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a691825727.a_924678895" title="Remove" target="self" mode="MaterialIconButton" icon="Clear" size="Small">
					</UiAction>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LoginSelectorOption));
DisplayFactory.register("LoginSelectorOption", withStyles(styles, { withTheme: true })(withSnackbar(LoginSelectorOption)));