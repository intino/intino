import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiDialog from "alexandria-ui-elements/src/displays/components/Dialog";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiSelectorTabs from "alexandria-ui-elements/src/displays/components/SelectorTabs";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiBlockConditional from "alexandria-ui-elements/src/displays/components/BlockConditional";
import UiTextEditable from "alexandria-ui-elements/src/displays/components/TextEditable";
import UiActionSwitch from "alexandria-ui-elements/src/displays/components/ActionSwitch";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiDivider from "alexandria-ui-elements/src/displays/components/Divider";
import UiCloseDialog from "alexandria-ui-elements/src/displays/components/CloseDialog";
import DisplaysCollaboratorsTemplate from "editor-elements/gen/displays/templates/CollaboratorsTemplate";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import ModelSettingsDialogNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import ModelSettingsDialogRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class ModelSettingsDialog extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new ModelSettingsDialogNotifier(this);
		this.requester = new ModelSettingsDialogRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="horizontal" style={{...this.props.style,...display}}>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558" title="Info" width="50.0%" height="70.0%">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558.a_309576479" format="overflowAuto" layout="vertical" width="100.0%" height="calc(100% - 40px)">
						<UiSelectorTabs context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558.a_309576479.a_2041801821" format="tabsStyle" multipleSelection={false}>
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558.a_309576479.a_2041801821.a863632353" name="generalOption" mode="normal" value="General">
							</UiText>
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558.a_309576479.a_2041801821.a_2138889882" name="collaboratorsOption" mode="normal" value="Collaborators">
							</UiText>
						</UiSelectorTabs>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558.a_309576479.a_1266116654" layout="vertical center" width="100.0%" height="100.0%">
							<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558.a_309576479.a_1266116654.a_1987012434" format="doubleTopSpaced" layout="vertical flexible" width="95.0%" height="100.0%">
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558.a_309576479.a_1266116654.a_1987012434.a_319467481" format="doubleAirTop" layout="vertical">
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558.a_309576479.a_1266116654.a_1987012434.a_319467481.a145055394" format="h5 middleAirBottom" mode="normal" translate={true} value="Title">
									</UiText>
									<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558.a_309576479.a_1266116654.a_1987012434.a_319467481.a480440384" mode="normal">
									</UiTextEditable>
								</UiBlock>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558.a_309576479.a_1266116654.a_1987012434.a590369313" format="doubleAirTop" layout="vertical">
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558.a_309576479.a_1266116654.a_1987012434.a590369313.a_364223074" format="h5 middleAirBottom" mode="normal" translate={true} value="Description">
									</UiText>
									<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558.a_309576479.a_1266116654.a_1987012434.a590369313.a923838132" mode="normal" editionMode="Raw" rows={4}>
									</UiTextEditable>
								</UiBlock>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558.a_309576479.a_1266116654.a_1987012434.a329486822" format="doubleAirTop" layout="vertical">
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558.a_309576479.a_1266116654.a_1987012434.a329486822.a2111399563" format="h5 middleAirBottom" mode="normal" translate={true} value="Model access">
									</UiText>
									<UiActionSwitch context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558.a_309576479.a_1266116654.a_1987012434.a329486822.a1794183916" title="Model is private" target="self" mode="Link" size="Medium">
									</UiActionSwitch>
								</UiBlock>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558.a_309576479.a_1266116654.a_1987012434.a_862765031" format="doubleAirTop" layout="vertical">
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558.a_309576479.a_1266116654.a_1987012434.a_862765031.a187923311" format="h5" mode="normal" translate={true} value="Remove model">
									</UiText>
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558.a_309576479.a_1266116654.a_1987012434.a_862765031.a_1138125685" format="airBottom greyColor" mode="normal" translate={true} value="Removed models cannot be restored!">
									</UiText>
									<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558.a_309576479.a_1266116654.a_1987012434.a_862765031.a1625456443" layout="horizontal">
										<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558.a_309576479.a_1266116654.a_1987012434.a_862765031.a1625456443.a_2126067087" title="Remove model..." target="self" mode="Button" affirmed="Are you sure to remove model?" readonly={true} size="Medium" format="airRight redBackground whiteColor" highlighted="Fill">
										</UiAction>
									</UiBlock>
								</UiBlock>
							</UiBlockConditional>
							<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558.a_309576479.a_1266116654.a_78942007" format="doubleTopSpaced" layout="vertical flexible" width="95.0%" height="100.0%">
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558.a_309576479.a_1266116654.a_78942007.a_853693655" format="h5 middleAirBottom" mode="normal" translate={true} value="Users that will have access">
								</UiText>
								<DisplaysCollaboratorsTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558.a_309576479.a_1266116654.a_78942007.a_1456824884">
								</DisplaysCollaboratorsTemplate>
							</UiBlockConditional>
						</UiBlock>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558.a_356059425">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558.a1125313198" layout="horizontal">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558.a1125313198.a203652194" layout="horizontal startjustified flexible">
							<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558.a1125313198.a203652194.a1142735174" title="Close" target="self" mode="Button" size="Small" format="airRight">
							</UiCloseDialog>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558.a1125313198.a_1125426022" layout="horizontal endjustified">
							<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1782132558.a1125313198.a_1125426022.a_279371044" title="Apply" target="self" mode="Button" size="Small" highlighted="Fill">
							</UiAction>
						</UiBlock>
					</UiBlock>
				</UiDialog>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(ModelSettingsDialog));
DisplayFactory.register("ModelSettingsDialog", withStyles(styles, { withTheme: true })(withSnackbar(ModelSettingsDialog)));