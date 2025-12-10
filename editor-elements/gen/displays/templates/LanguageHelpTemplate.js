import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiTextEditableCode from "alexandria-ui-elements/src/displays/components/TextEditableCode";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import LanguageHelpTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import LanguageHelpTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LanguageHelpTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new LanguageHelpTemplateNotifier(this);
		this.requester = new LanguageHelpTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="horizontal flexible" style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1669462562" visible={false} layout="vertical flexible">
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1669462562.a_509747283" mode="normal" value="Select version on right panel to open help">
					</UiText>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1250445997" visible={false} layout="vertical flexible centercenter">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1250445997.a_323080704" layout="vertical centercenter" width="40.0%" height="100.0%">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1250445997.a_323080704.a1967114013" format="h5 textCentered" mode="normal" value="This version of the language has not been defined yet. To define its help, you must first create the version.">
						</UiText>
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1250445997.a_323080704.a2023939615" title="Create version" target="self" mode="Button" size="Medium" format="doubleAirTop" highlighted="Fill">
						</UiAction>
					</UiBlock>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a863239298" visible={false} layout="vertical flexible">
					<UiTextEditableCode context={this._context.bind(this)} owner={this._owner.bind(this)} id="a863239298.a1862008508" format="fullHeight fullWidth" mode="normal" language="Html" value="">
					</UiTextEditableCode>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LanguageHelpTemplate));
DisplayFactory.register("LanguageHelpTemplate", withStyles(styles, { withTheme: true })(withSnackbar(LanguageHelpTemplate)));