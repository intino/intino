import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiBlockConditional from "alexandria-ui-elements/src/displays/components/BlockConditional";
import DisplaysCreateLanguageEditor from "editor-elements/gen/displays/templates/CreateLanguageEditor";
import DisplaysLanguageForgeTemplate from "editor-elements/gen/displays/templates/LanguageForgeTemplate";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import ForgeTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import ForgeTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class ForgeTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new ForgeTemplateNotifier(this);
		this.requester = new ForgeTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" width="100.0%" height={this.fixHeight != null ? this.fixHeight("100.0%") : "100.0%"} style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2069927649" visible={false} layout="vertical flexible centercenter">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2069927649.a1551294702" format="messageBlock" layout="vertical flexible" width="60.0%" height="100.0%" spacing="16">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2069927649.a1551294702.a510426830" layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2069927649.a1551294702.a510426830.a478570029" format="airTop greyHardColor h2 textCentered" mode="normal" translate={true} value="Not found">
							</UiText>
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2069927649.a1551294702.a510426830.a1249075020" format="greyColor h5 textCentered" mode="normal" translate={true} value="Sorry, we can't find the forge you are looking for">
							</UiText>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2069927649.a1551294702.a510426830.a_1490426240" layout="horizontal">
								<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2069927649.a1551294702.a510426830.a_1490426240.a1277141295" title="home" target="self" mode="Button" size="Medium" format="airTop" highlighted="Outline">
								</UiAction>
							</UiBlock>
						</UiBlock>
					</UiBlock>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1797084751" layout="vertical flexible" width="100.0%" height="100.0%">
					<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1797084751.a994383083" layout="vertical flexible centercenter">
						<DisplaysCreateLanguageEditor context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1797084751.a994383083.a_1495359909">
						</DisplaysCreateLanguageEditor>
					</UiBlockConditional>
					<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1797084751.a307874311" layout="vertical flexible">
						<DisplaysLanguageForgeTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1797084751.a307874311.a_780035309">
						</DisplaysLanguageForgeTemplate>
					</UiBlockConditional>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(ForgeTemplate));
DisplayFactory.register("ForgeTemplate", withStyles(styles, { withTheme: true })(withSnackbar(ForgeTemplate)));