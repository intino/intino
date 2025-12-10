import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiDisplayStamp from "alexandria-ui-elements/src/displays/components/DisplayStamp";
import UiOpenSite from "alexandria-ui-elements/src/displays/components/OpenSite";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiOpenDialog from "alexandria-ui-elements/src/displays/components/OpenDialog";
import UiMultiple from "alexandria-ui-elements/src/displays/components/Multiple";
import UiDialog from "alexandria-ui-elements/src/displays/components/Dialog";
import UiDivider from "alexandria-ui-elements/src/displays/components/Divider";
import UiCloseDialog from "alexandria-ui-elements/src/displays/components/CloseDialog";
import DisplaysDependencyTemplate from "editor-elements/gen/displays/templates/DependencyTemplate";
import DisplaysHelpEditor from "editor-elements/src/displays/HelpEditor";
import DisplaysModelsDialog from "editor-elements/gen/displays/templates/ModelsDialog";
import DisplaysModelsTemplate from "editor-elements/gen/displays/templates/ModelsTemplate";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import LanguageKitTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import LanguageKitTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LanguageKitTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new LanguageKitTemplateNotifier(this);
		this.requester = new LanguageKitTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock format="doubleSpaced" layout="vertical flexible" style={{...this.props.style,...display}}>
				<UiOpenSite context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1755234695" title="" target="self" mode="Link" size="Medium">
				</UiOpenSite>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1211317111" visible={false} layout="vertical flexible">
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1211317111.a_599288396" mode="normal" value="Select version on right panel to open kit">
					</UiText>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1889830293" visible={false} layout="vertical flexible centercenter">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1889830293.a1106924647" layout="vertical centercenter" width="40.0%" height="100.0%">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1889830293.a1106924647.a1585328668" format="h5 textCentered" mode="normal" value="You haven’t committed the metamodel yet. A commit is required to create a DSL release. Please go to the metamodel and commit your changes.">
						</UiText>
						<UiOpenSite context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1889830293.a1106924647.a_497900289" title="Goto metamodel" target="self" mode="Button" size="Medium" format="doubleAirTop" highlighted="Fill">
						</UiOpenSite>
					</UiBlock>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a117902278" visible={false} layout="vertical flexible centercenter">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a117902278.a1472040968" layout="vertical centercenter" width="40.0%" height="100.0%">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a117902278.a1472040968.a2001631986" format="h5 textCentered" mode="normal" value="This version of the DSL has not been defined yet. To define its kit, you must first create the version.">
						</UiText>
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a117902278.a1472040968.a_2013909257" title="Create version" target="self" mode="Button" size="Medium" format="doubleAirTop" highlighted="Fill">
						</UiAction>
					</UiBlock>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485" visible={false} layout="vertical flexible">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a51167448" format="doubleAirBottom" layout="vertical">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a51167448.a1733079656" format="bold bottomBordered fullWidth h5" mode="normal" translate={true} value="In Quassar">
						</UiText>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a51167448.a_2018937972" format="airTop" layout="vertical">
							<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a51167448.a_2018937972.a_6541920" title="Explore" target="self" mode="Link" size="Medium" format="airBottom h5">
							</UiAction>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a51167448.a_2018937972.a_1192380489" format="doubleAirBottom" layout="vertical">
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a51167448.a_2018937972.a_1192380489.a_1014654499" format="bold h5" mode="normal" translate={true} value="Define the base template">
								</UiText>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a51167448.a_2018937972.a_1192380489.a_627044082" format="autoHeight" layout="vertical" width="80.0%" height="100.0%">
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a51167448.a_2018937972.a_1192380489.a_627044082.a1774604811" format="middleAirBottom" mode="normal" translate={true} value="You can define the base template that will be used to create models with this version of the DSL. Every new model will start from this template, giving you full control over its initial structure.">
									</UiText>
								</UiBlock>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a51167448.a_2018937972.a_1192380489.a1015713293" visible={false} layout="horizontal">
									<UiOpenSite context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a51167448.a_2018937972.a_1192380489.a1015713293.a_1170277242" title="Define" target="blank" mode="Button" size="Medium" format="blockKitAction">
									</UiOpenSite>
								</UiBlock>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a51167448.a_2018937972.a_1192380489.a_1894536910" visible={false} layout="horizontal">
									<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a51167448.a_2018937972.a_1192380489.a_1894536910.a_1557721021" title="Define" target="self" mode="Button" size="Medium" format="blockKitAction">
									</UiAction>
								</UiBlock>
							</UiBlock>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a51167448.a_2018937972.a_1092618200" format="autoHeight doubleAirBottom" layout="vertical">
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a51167448.a_2018937972.a_1092618200.a1453816284" format="bold h5" mode="normal" translate={true} value="Edit the help">
								</UiText>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a51167448.a_2018937972.a_1092618200.a1811578483" format="autoHeight" layout="vertical" width="80.0%" height="100.0%">
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a51167448.a_2018937972.a_1092618200.a1811578483.a_1448177703" format="middleAirBottom" mode="normal" translate={true} value="You can edit the help content that will be shown for this version of the DSL. This way, your users will always see up-to-date and relevant guidance based on the current features.">
									</UiText>
								</UiBlock>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a51167448.a_2018937972.a_1092618200.a1286372393" layout="horizontal">
									<UiOpenDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a51167448.a_2018937972.a_1092618200.a1286372393.a_1681642804" title="Edit" target="self" mode="Button" size="Medium" format="blockKitAction">
									</UiOpenDialog>
								</UiBlock>
							</UiBlock>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a51167448.a_2018937972.a_2111589976" format="doubleAirBottom" layout="vertical">
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a51167448.a_2018937972.a_2111589976.a270897025" format="bold h5" mode="normal" translate={true} value="Provide examples">
								</UiText>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a51167448.a_2018937972.a_2111589976.a_980652364" format="autoHeight" layout="vertical" width="80.0%" height="100.0%">
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a51167448.a_2018937972.a_2111589976.a_980652364.a1059600284" format="middleAirBottom" mode="normal" translate={true} value="You can optionally provide example models created with this versión of the DSL. These examples serve as practical references to help users understand how to use the DSL effectively. They can include common use cases, full configurations, or edge cases to illustrate specific features.">
									</UiText>
								</UiBlock>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a51167448.a_2018937972.a_2111589976.a_1250415232" layout="horizontal">
									<UiOpenDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a51167448.a_2018937972.a_2111589976.a_1250415232.a_1286989040" title="Add" target="self" mode="Button" size="Medium" format="blockKitAction">
									</UiOpenDialog>
								</UiBlock>
							</UiBlock>
						</UiBlock>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a_792098468" format="doubleAirBottom" layout="vertical">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a_792098468.a1875900304" format="bold bottomBordered fullWidth h5" mode="normal" translate={true} value="In your own environment">
						</UiText>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a_792098468.a1223404536" format="airTop" layout="vertical">
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a_792098468.a1223404536.a2104440600" format="doubleAirBottom" layout="vertical">
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a_792098468.a1223404536.a2104440600.a749752229" format="bold h5" mode="normal" translate={true} value="Run and Customize your own Language Server">
								</UiText>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a_792098468.a1223404536.a2104440600.a_1448454192" format="autoHeight" layout="vertical" width="80.0%" height="100.0%">
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a_792098468.a1223404536.a2104440600.a_1448454192.a_1672168643" format="middleAirBottom" mode="normal" translate={true} value="Use the provided Maven dependency to deploy your own language server. Run it as-is, or extend it with your own validations, rules, and behaviors.">
									</UiText>
								</UiBlock>
								<UiMultiple context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_968648485.a_792098468.a1223404536.a2104440600.a_932674625" multiple={{instances:"dependencies",arrangement:"Horizontal",noItemsMessage:"There are no language servers available",spacing:16,editable:false,wrap:true,collapsed:false,count:{min:0,max:-1}}}>
								</UiMultiple>
							</UiBlock>
						</UiBlock>
					</UiBlock>
				</UiBlock>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2031548335" title="Help" fullscreen={true}>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2031548335.a_1220357087" layout="vertical" width="100.0%" height="100.0%">
						<UiDisplayStamp context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2031548335.a_1220357087.a_1706511003" format="fullHeight">
						</UiDisplayStamp>
					</UiBlock>
				</UiDialog>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a492571575" title="" width="80.0%" height="80.0%">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a492571575.a_170852861" layout="vertical" width="100.0%" height="calc(100% - 40px)">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a492571575.a_170852861.a1285525917" format="middleAirBottom" layout="vertical">
							<DisplaysModelsDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a492571575.a_170852861.a1285525917.a_861481687">
							</DisplaysModelsDialog>
						</UiBlock>
						<DisplaysModelsTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a492571575.a_170852861.a_145966692">
						</DisplaysModelsTemplate>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a492571575.a_1520538961">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a492571575.a427514068" layout="horizontal endjustified">
						<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a492571575.a427514068.a1569293197" title="Close" target="self" mode="Button" size="Small" format="airRight" highlighted="Fill">
						</UiCloseDialog>
					</UiBlock>
				</UiDialog>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LanguageKitTemplate));
DisplayFactory.register("LanguageKitTemplate", withStyles(styles, { withTheme: true })(withSnackbar(LanguageKitTemplate)));