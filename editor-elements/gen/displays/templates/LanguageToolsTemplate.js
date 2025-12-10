import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiMultiple from "alexandria-ui-elements/src/displays/components/Multiple";
import UiOpenDialog from "alexandria-ui-elements/src/displays/components/OpenDialog";
import UiDialog from "alexandria-ui-elements/src/displays/components/Dialog";
import UiWizard from "alexandria-ui-elements/src/displays/components/Wizard";
import UiStep from "alexandria-ui-elements/src/displays/components/Step";
import UiTextEditable from "alexandria-ui-elements/src/displays/components/TextEditable";
import UiSelectorListBox from "alexandria-ui-elements/src/displays/components/SelectorListBox";
import UiDivider from "alexandria-ui-elements/src/displays/components/Divider";
import UiWizardNavigator from "alexandria-ui-elements/src/displays/components/WizardNavigator";
import DisplaysLanguageToolTemplate from "editor-elements/gen/displays/templates/LanguageToolTemplate";
import DisplaysLanguageToolEditor from "editor-elements/gen/displays/templates/LanguageToolEditor";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import LanguageToolsTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import LanguageToolsTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LanguageToolsTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new LanguageToolsTemplateNotifier(this);
		this.requester = new LanguageToolsTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock format="doubleSpaced" layout="vertical flexible" style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1072886894" visible={false} layout="vertical flexible">
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1072886894.a580450781" mode="normal" value="Select version on right panel to open tools">
					</UiText>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1593136737" visible={false} layout="vertical flexible centercenter">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1593136737.a1911647641" layout="vertical centercenter" width="40.0%" height="100.0%">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1593136737.a1911647641.a1144132430" format="h5 textCentered" mode="normal" value="This version of the language has not been defined yet. To define its tools, you must first create the version.">
						</UiText>
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1593136737.a1911647641.a742269597" title="Create version" target="self" mode="Button" size="Medium" format="doubleAirTop" highlighted="Fill">
						</UiAction>
					</UiBlock>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_648652490" visible={false} layout="vertical flexible">
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_648652490.a_1765688561" format="airBottom" mode="normal" translate={true} value="Specify how a model, written with this DSL, is converted into a concrete artifact.">
					</UiText>
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_648652490.a_858983091" format="airBottom h5" mode="normal" translate={true} value="Available tools">
					</UiText>
					<UiMultiple context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_648652490.a_592231022" multiple={{instances:"tools",arrangement:"Vertical",noItemsMessage:"No tools defined",spacing:16,editable:false,wrap:true,collapsed:false,count:{min:0,max:-1}}}>
					</UiMultiple>
					<UiOpenDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_648652490.a1906232127" title="[add]" target="self" mode="Link" size="Medium" format="airTop">
					</UiOpenDialog>
				</UiBlock>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a665134249" title="Add tool" width="60.0%" height="60.0%">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a665134249.a_122337565" layout="vertical" width="100.0%" height="calc(100% - 45px)">
						<UiWizard context={this._context.bind(this)} owner={this._owner.bind(this)} id="a665134249.a_122337565.a_484702649" format="fullWidth" style="ContentOnly"    orientation="horizontal" position="top">
							<UiStep context={this._context.bind(this)} owner={this._owner.bind(this)} id="a665134249.a_122337565.a_484702649.a_671012115">
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a665134249.a_122337565.a_484702649.a_671012115.a_531582543" format="setupStepHeader" layout="vertical">
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a665134249.a_122337565.a_484702649.a_671012115.a_531582543.a1660534580" format="setupStepTitle" mode="normal" translate={true} value="Tool name">
									</UiText>
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a665134249.a_122337565.a_484702649.a_671012115.a_531582543.a5450892" format="setupStepSubtitle" mode="normal" translate={true} value="Set the name for the tool">
									</UiText>
								</UiBlock>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a665134249.a_122337565.a_484702649.a_671012115.a512458218" format="setupStepContent" layout="vertical">
									<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a665134249.a_122337565.a_484702649.a_671012115.a512458218.a_46308906" format="airBottom" mode="normal" placeholder="Enter the tool name" focused={true}>
									</UiTextEditable>
								</UiBlock>
							</UiStep>
							<UiStep context={this._context.bind(this)} owner={this._owner.bind(this)} id="a665134249.a_122337565.a_484702649.a_671012114" label="">
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a665134249.a_122337565.a_484702649.a_671012114.a_1669044650" format="setupStepHeader" layout="vertical">
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a665134249.a_122337565.a_484702649.a_671012114.a_1669044650.a94390755" format="setupStepTitle" mode="normal" translate={true} value="Tool type">
									</UiText>
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a665134249.a_122337565.a_484702649.a_671012114.a_1669044650.a_1466649516" format="setupStepSubtitle" mode="normal" translate={true} value="Indicate the type of tool that will be created to deploy the model built by the user">
									</UiText>
								</UiBlock>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a665134249.a_122337565.a_484702649.a_671012114.a_758678863" format="setupStepContent" layout="vertical">
									<UiSelectorListBox context={this._context.bind(this)} owner={this._owner.bind(this)} id="a665134249.a_122337565.a_484702649.a_671012114.a_758678863.a_1228590740" multipleSelection={false}>
										<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a665134249.a_122337565.a_484702649.a_671012114.a_758678863.a_1228590740.a_240812489" name="dockerImageFactoryOption" mode="normal" value="Docker image factory">
										</UiText>
										<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a665134249.a_122337565.a_484702649.a_671012114.a_758678863.a_1228590740.a_532521442" name="deploySiteFactoryOption" mode="normal" value="Deploy site factory">
										</UiText>
										<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a665134249.a_122337565.a_484702649.a_671012114.a_758678863.a_1228590740.a_724615243" name="buildInstructionsOption" mode="normal" value="Build instructions">
										</UiText>
									</UiSelectorListBox>
								</UiBlock>
							</UiStep>
							<UiStep context={this._context.bind(this)} owner={this._owner.bind(this)} id="a665134249.a_122337565.a_484702649.a_671012113">
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a665134249.a_122337565.a_484702649.a_671012113.a_916793805" format="setupStepHeader" layout="vertical">
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a665134249.a_122337565.a_484702649.a_671012113.a_916793805.a192184247" format="setupStepTitle" mode="normal" translate={true} value="Setup tool">
									</UiText>
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a665134249.a_122337565.a_484702649.a_671012113.a_916793805.a_1626976225" format="setupStepSubtitle" mode="normal" translate={true} value="Configure the selected tool type">
									</UiText>
								</UiBlock>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a665134249.a_122337565.a_484702649.a_671012113.a_155637930" format="setupStepContent" layout="vertical">
									<DisplaysLanguageToolEditor context={this._context.bind(this)} owner={this._owner.bind(this)} id="a665134249.a_122337565.a_484702649.a_671012113.a_155637930.a_429537150">
									</DisplaysLanguageToolEditor>
								</UiBlock>
							</UiStep>
						</UiWizard>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a665134249.a_883506903">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a665134249.a_1508486488" layout="horizontal endjustified">
						<UiWizardNavigator context={this._context.bind(this)} owner={this._owner.bind(this)} id="a665134249.a_1508486488.a_130523469">
						</UiWizardNavigator>
					</UiBlock>
				</UiDialog>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LanguageToolsTemplate));
DisplayFactory.register("LanguageToolsTemplate", withStyles(styles, { withTheme: true })(withSnackbar(LanguageToolsTemplate)));