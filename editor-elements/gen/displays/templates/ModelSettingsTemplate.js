import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import DisplaysModelSettingsEditor from "editor-elements/gen/displays/templates/ModelSettingsEditor";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import ModelSettingsTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import ModelSettingsTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class ModelSettingsTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new ModelSettingsTemplateNotifier(this);
		this.requester = new ModelSettingsTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical flexible" width="100.0%" height={this.fixHeight != null ? this.fixHeight("100.0%") : "100.0%"} style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1052825178" format="greyLightBackground headerPanel leftSpaced rightSpaced" layout="horizontal">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1052825178.a_116034654" layout="horizontal flexible">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1052825178.a_116034654.a309922834" format="h6" mode="normal" translate={true} value="Settings">
						</UiText>
					</UiBlock>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1827542417" layout="vertical flexible">
					<DisplaysModelSettingsEditor context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1827542417.a_1693529402">
					</DisplaysModelSettingsEditor>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(ModelSettingsTemplate));
DisplayFactory.register("ModelSettingsTemplate", withStyles(styles, { withTheme: true })(withSnackbar(ModelSettingsTemplate)));