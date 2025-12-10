import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiCloseApp from "alexandria-ui-elements/src/displays/components/CloseApp";
import UiActionSplit from "alexandria-ui-elements/src/displays/components/ActionSplit";
import UiOpenSite from "alexandria-ui-elements/src/displays/components/OpenSite";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import DisplaysModelNameViewer from "editor-elements/gen/displays/templates/ModelNameViewer";
import DisplaysModelLanguageToolbar from "editor-elements/gen/displays/templates/ModelLanguageToolbar";
import DisplaysCommitModelDialog from "editor-elements/gen/displays/templates/CommitModelDialog";
import DisplaysLanguageExecutionLauncher from "editor-elements/gen/displays/templates/LanguageExecutionLauncher";
import DisplaysModelNameDialog from "editor-elements/gen/displays/templates/ModelNameDialog";
import DisplaysDownloadModelDialog from "editor-elements/gen/displays/templates/DownloadModelDialog";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import ModelHeaderTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import ModelHeaderTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class ModelHeaderTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new ModelHeaderTemplateNotifier(this);
		this.requester = new ModelHeaderTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock format="subHeaderStyle" layout="horizontal center" style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1826738654" visible={false} layout="horizontal center flexible">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1826738654.a947699976" layout="horizontal flexible center">
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1826738654.a947699976.a336125801" title="Goto DSL" target="self" mode="MaterialIconButton" icon="ArrowUpward" size="Small" format="airRight middleAirLeft">
						</UiAction>
						<UiCloseApp context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1826738654.a947699976.a_1862956777" title="" target="self" mode="Link" size="Small" format="airRight middleAirLeft modelExampleLink">
						</UiCloseApp>
						<DisplaysModelNameViewer context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1826738654.a947699976.a_175860044">
						</DisplaysModelNameViewer>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1826738654.a947699976.a1720586807" format="doubleAirLeft" layout="horizontal center">
							<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1826738654.a947699976.a1720586807.a2078806788" title="settings" target="self" mode="Button" size="Small" format="airRight" visible={false}>
							</UiAction>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1826738654.a947699976.a360990094" format="doubleAirLeft" layout="horizontal center">
							<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1826738654.a947699976.a360990094.a_2078356096" title="1. edit" target="self" mode="Button" size="Small" format="airRight" highlighted="Fill">
							</UiAction>
							<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1826738654.a947699976.a360990094.a_873387874" title="2. check" target="self" mode="Button" size="Small" format="airRight" highlighted="Outline" shortcut={{key:"Crtl+F9",altKey:false,ctrlKey:true,shiftKey:false,visible:false}}>
							</UiAction>
							<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1826738654.a947699976.a360990094.a_903016141" title="3. commit" target="self" mode="Button" readonly={true} size="Small" format="airRight" highlighted="Outline" visible={false} shortcut={{key:"Shift+Crtl+F9",altKey:false,ctrlKey:true,shiftKey:true,visible:false}}>
							</UiAction>
							<UiActionSplit context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1826738654.a947699976.a360990094.a368635192" title="draft" target="self" mode="SplitButton" size="Medium" format="airRight minSelectorWidth" visible={false} options={["draft"]} defaultOption="draft">
							</UiActionSplit>
							<UiOpenSite context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1826738654.a947699976.a360990094.a1053583711" title="4. Forge DSL" target="self" mode="Button" readonly={true} size="Small" format="airRight" highlighted="Outline" visible={false}>
							</UiOpenSite>
							<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1826738654.a947699976.a360990094.a_718743154" title="4. Execute" target="self" mode="Button" readonly={true} size="Small" format="airRight" highlighted="Outline" visible={false}>
							</UiAction>
							<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1826738654.a947699976.a360990094.a876634178" title="4. Inspect" target="self" mode="Button" size="Small" format="airRight" visible={false}>
							</UiAction>
							<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1826738654.a947699976.a360990094.a_1710483799" title="clone" target="self" mode="Button" size="Medium" format="airRight" visible={false}>
							</UiAction>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1826738654.a947699976.a360990094.a_459854229" format="airLeft" visible={false} layout="vertical" hidden="IfMobile">
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1826738654.a947699976.a360990094.a_459854229.a_88698721" mode="normal" translate={true} value="A DSL has not been created for this metamodel yet">
								</UiText>
							</UiBlock>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1826738654.a947699976.a360990094.a_680009078" format="airLeft" visible={false} layout="horizontal wrap">
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1826738654.a947699976.a360990094.a_680009078.a601471616" layout="vertical" hidden="IfMobile">
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1826738654.a947699976.a360990094.a_680009078.a601471616.a_1540811050" format="middleAirRight" mode="normal" translate={true} value="This metamodel has been used to create">
									</UiText>
								</UiBlock>
								<UiOpenSite context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1826738654.a947699976.a360990094.a_680009078.a_1984655767" title="" target="self" mode="Link" size="Medium" format="doubleAirRight nowrap">
								</UiOpenSite>
							</UiBlock>
						</UiBlock>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1826738654.a747834910" layout="horizontal center endjustified">
						<DisplaysModelLanguageToolbar context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1826738654.a747834910.a2044298604">
						</DisplaysModelLanguageToolbar>
					</UiBlock>
				</UiBlock>
				<DisplaysCommitModelDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_92256692">
				</DisplaysCommitModelDialog>
				<DisplaysLanguageExecutionLauncher context={this._context.bind(this)} owner={this._owner.bind(this)} id="a323396874">
				</DisplaysLanguageExecutionLauncher>
				<DisplaysModelNameDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1117547118">
				</DisplaysModelNameDialog>
				<DisplaysDownloadModelDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2088359387">
				</DisplaysDownloadModelDialog>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(ModelHeaderTemplate));
DisplayFactory.register("ModelHeaderTemplate", withStyles(styles, { withTheme: true })(withSnackbar(ModelHeaderTemplate)));