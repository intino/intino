import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiBlockResizable from "alexandria-ui-elements/src/displays/components/BlockResizable";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiImage from "alexandria-ui-elements/src/displays/components/Image";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiOpenSite from "alexandria-ui-elements/src/displays/components/OpenSite";
import UiMultiple from "alexandria-ui-elements/src/displays/components/Multiple";
import UiSelectorTabs from "alexandria-ui-elements/src/displays/components/SelectorTabs";
import UiBlockConditional from "alexandria-ui-elements/src/displays/components/BlockConditional";
import UiDialog from "alexandria-ui-elements/src/displays/components/Dialog";
import UiDivider from "alexandria-ui-elements/src/displays/components/Divider";
import UiCloseDialog from "alexandria-ui-elements/src/displays/components/CloseDialog";
import DisplaysReleaseSelectorOption from "editor-elements/gen/displays/templates/ReleaseSelectorOption";
import DisplaysLanguageKitTemplate from "editor-elements/gen/displays/templates/LanguageKitTemplate";
import DisplaysLanguageExecutionTemplate from "editor-elements/gen/displays/templates/LanguageExecutionTemplate";
import DisplaysLanguageInfoTemplate from "editor-elements/gen/displays/templates/LanguageInfoTemplate";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import LanguageForgeTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import LanguageForgeTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LanguageForgeTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new LanguageForgeTemplateNotifier(this);
		this.requester = new LanguageForgeTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" width="100.0%" height={this.fixHeight != null ? this.fixHeight("100.0%") : "100.0%"} style={{...this.props.style,...display}}>
				<UiBlockResizable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994" layout="horizontal flexible" width="100.0%" height="100.0%" minSize={30.0}>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_364961304" format="forgePanelBackground minResizablePanelWidth" layout="vertical" width="30.0%" height="100.0%">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_364961304.a_1061848068" format="doubleSpaced" layout="vertical flexible" width="100.0%" height="100.0%" autoSize={true}>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_364961304.a_1061848068.a839481659" layout="vertical flexible" width="100.0%" height="100.0%">
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_364961304.a_1061848068.a839481659.a359969114" format="airBottom" layout="horizontal center">
									<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_364961304.a_1061848068.a839481659.a359969114.a_569782534" layout="horizontal center flexible">
										<UiImage context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_364961304.a_1061848068.a839481659.a359969114.a_569782534.a_1855120824" format="forgeLogoStyle" width="50px" height="-1px" colorInvertedWithDarkMode={true}>
										</UiImage>
										<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_364961304.a_1061848068.a839481659.a359969114.a_569782534.a_1662222944" format="airRight h2" mode="normal">
										</UiText>
									</UiBlock>
									<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_364961304.a_1061848068.a839481659.a359969114.a_210750151" layout="horizontal endjustified">
										<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_364961304.a_1061848068.a839481659.a359969114.a_210750151.a_1172191562" title="remove" target="self" mode="MaterialIconButton" icon="Delete" signed={{mode:"SimpleText",text:"To confirm deletion, please type the full name of the DSL. Deleting this DSL will permanently remove all models created with it. This action cannot be undone.",reason:""}} size="Small" visible={false}>
										</UiAction>
									</UiBlock>
								</UiBlock>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_364961304.a_1061848068.a839481659.a_913956647" layout="vertical flexible">
									<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_364961304.a_1061848068.a839481659.a_913956647.a_353527188" title="properties" target="self" mode="Link" size="Medium">
									</UiAction>
									<UiOpenSite context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_364961304.a_1061848068.a839481659.a_913956647.a403501114" title="metamodel" target="self" mode="Link" size="Medium">
									</UiOpenSite>
								</UiBlock>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_364961304.a_1061848068.a839481659.a_451719572" format="doubleAirTop middleAirBottom middleAirLeft" layout="horizontal center">
									<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_364961304.a_1061848068.a839481659.a_451719572.a1734563030" layout="vertical flexible">
										<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_364961304.a_1061848068.a839481659.a_451719572.a1734563030.a1330883474" format="bold h5" mode="normal" translate={true} value="Releases">
										</UiText>
									</UiBlock>
									<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_364961304.a_1061848068.a839481659.a_451719572.a_759017938" layout="horizontal endjustified">
										<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_364961304.a_1061848068.a839481659.a_451719572.a_759017938.a175233080" title="refresh" target="self" mode="MaterialIconButton" icon="Refresh" size="Small">
										</UiAction>
									</UiBlock>
								</UiBlock>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_364961304.a_1061848068.a839481659.a_1833081817" format="airBottom" layout="vertical" autoSize={true}>
									<UiMultiple context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_364961304.a_1061848068.a839481659.a_1833081817.a_569045447" format="fullHeight" multiple={{instances:"versionSelector",arrangement:"Vertical",noItemsMessage:"No versions",spacing:0,editable:false,wrap:true,collapsed:false,count:{min:0,max:-1}}}>
									</UiMultiple>
								</UiBlock>
							</UiBlock>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_364961304.a_1061848068.a748827912" visible={false} layout="vertical endjustified">
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_364961304.a_1061848068.a748827912.a1913424563" format="relative" layout="vertical">
									<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_364961304.a_1061848068.a748827912.a1913424563.a415394264" title="" target="self" mode="Link" size="Medium" format="fullSpaceLink">
									</UiAction>
									<UiImage context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_364961304.a_1061848068.a748827912.a1913424563.a_10343619" width="80px" height="-1px" colorInvertedWithDarkMode={true}>
									</UiImage>
								</UiBlock>
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_364961304.a_1061848068.a748827912.a_142479457" format="metaForgeCredits" mode="normal">
								</UiText>
							</UiBlock>
						</UiBlock>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_1660718161" layout="vertical flexible" width="70.0%" height="100.0%">
						<UiSelectorTabs context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_1660718161.a_1004633814" format="tabsStyle" multipleSelection={false}>
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_1660718161.a_1004633814.a_1586320831" name="kit" mode="normal" value="Modeling">
							</UiText>
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_1660718161.a_1004633814.a_932144573" name="execution" mode="normal" value="Execution">
							</UiText>
						</UiSelectorTabs>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_1660718161.a1999309724" layout="vertical flexible">
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_1660718161.a1999309724.a_591482087" layout="vertical" width="100.0%" height="100.0%" autoSize={true}>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_1660718161.a1999309724.a_591482087.a286672870" layout="vertical" width="800px" height="-1px">
									<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_1660718161.a1999309724.a_591482087.a286672870.a_205957772" layout="vertical flexible">
										<DisplaysLanguageKitTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_1660718161.a1999309724.a_591482087.a286672870.a_205957772.a770230520">
										</DisplaysLanguageKitTemplate>
									</UiBlockConditional>
									<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_1660718161.a1999309724.a_591482087.a286672870.a_639993678" layout="vertical flexible">
										<DisplaysLanguageExecutionTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a328695994.a_1660718161.a1999309724.a_591482087.a286672870.a_639993678.a779170488">
										</DisplaysLanguageExecutionTemplate>
									</UiBlockConditional>
								</UiBlock>
							</UiBlock>
						</UiBlock>
					</UiBlock>
				</UiBlockResizable>
				<DisplaysReleaseSelectorOption context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_348795819" visible={false}>
				</DisplaysReleaseSelectorOption>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1154679445" title="DSL Properties" width="60.0%" height="80.0%">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1154679445.a743594247" layout="vertical" width="100.0%" height="calc(100% - 40px)">
						<DisplaysLanguageInfoTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1154679445.a743594247.a39684772">
						</DisplaysLanguageInfoTemplate>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1154679445.a393369826">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1154679445.a1484980083" layout="horizontal endjustified">
						<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1154679445.a1484980083.a_1441702247" title="Close" target="self" mode="Button" size="Small" format="airRight" highlighted="Fill">
						</UiCloseDialog>
					</UiBlock>
				</UiDialog>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LanguageForgeTemplate));
DisplayFactory.register("LanguageForgeTemplate", withStyles(styles, { withTheme: true })(withSnackbar(LanguageForgeTemplate)));