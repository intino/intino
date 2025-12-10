import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import DisplaysLicenseExpiredBanner from "editor-elements/gen/displays/templates/LicenseExpiredBanner";
import DisplaysModelEditor from "editor-elements/gen/displays/templates/ModelEditor";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import ModelTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import ModelTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class ModelTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new ModelTemplateNotifier(this);
		this.requester = new ModelTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" width="100.0%" height={this.fixHeight != null ? this.fixHeight("100.0%") : "100.0%"} style={{...this.props.style,...display}}>
				<DisplaysLicenseExpiredBanner context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1849001845">
				</DisplaysLicenseExpiredBanner>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1335271860" format="banner" visible={false} layout="horizontal">
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1335271860.a1566100440" format="airRight" mode="normal" value="The DSL associated with this model has changed. Please reload this model to check if it remains compatible.">
					</UiText>
					<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1335271860.a_1501252884" title="Reload" target="self" mode="Button" size="Medium">
					</UiAction>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_515118813" visible={false} layout="vertical flexible centercenter">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_515118813.a618755464" format="messageBlock" layout="vertical flexible" width="60.0%" height="100.0%" spacing="16">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_515118813.a618755464.a1664569517" layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_515118813.a618755464.a1664569517.a1566487542" format="airTop greyHardColor h2 textCentered" mode="normal" translate={true} value="Not found">
							</UiText>
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_515118813.a618755464.a1664569517.a1321167083" format="greyColor h5 textCentered" mode="normal" translate={true} value="Sorry, we can't find the model you are visiting">
							</UiText>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_515118813.a618755464.a1664569517.a_402508727" layout="horizontal">
								<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_515118813.a618755464.a1664569517.a_402508727.a_1929908488" title="home" target="self" mode="Button" size="Medium" format="airTop" highlighted="Outline">
								</UiAction>
							</UiBlock>
						</UiBlock>
					</UiBlock>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_217905361" layout="vertical flexible" width="100.0%" height="100.0%">
					<DisplaysModelEditor context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_217905361.a_989373210">
					</DisplaysModelEditor>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(ModelTemplate));
DisplayFactory.register("ModelTemplate", withStyles(styles, { withTheme: true })(withSnackbar(ModelTemplate)));