import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiCloseApp from "alexandria-ui-elements/src/displays/components/CloseApp";
import UiSelectorTabs from "alexandria-ui-elements/src/displays/components/SelectorTabs";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiBlockConditional from "alexandria-ui-elements/src/displays/components/BlockConditional";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiTextEditable from "alexandria-ui-elements/src/displays/components/TextEditable";
import UiSelectorComboBox from "alexandria-ui-elements/src/displays/components/SelectorComboBox";
import UiActionSwitch from "alexandria-ui-elements/src/displays/components/ActionSwitch";
import DisplaysModelNameDialog from "editor-elements/gen/displays/templates/ModelNameDialog";
import DisplaysCollaboratorsTemplate from "editor-elements/gen/displays/templates/CollaboratorsTemplate";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import ModelSettingsEditorNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import ModelSettingsEditorRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class ModelSettingsEditor extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new ModelSettingsEditorNotifier(this);
		this.requester = new ModelSettingsEditorRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" style={{...this.props.style,...display}}>
				<UiCloseApp context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1405844347" title="" target="self" mode="Link" size="Medium">
				</UiCloseApp>
				<UiSelectorTabs context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_564796692" format="tabsStyle" multipleSelection={false}>
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_564796692.a_1658955926" name="generalOption" mode="normal" value="General">
					</UiText>
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_564796692.a1164767791" name="collaboratorsOption" mode="normal" value="Share">
					</UiText>
				</UiSelectorTabs>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657" format="doubleAirLeft" layout="vertical" width="60.0%" height="100.0%">
					<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657.a1583249337" format="doubleTopSpaced" layout="vertical flexible" width="95.0%" height="100.0%">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657.a1583249337.a_1950625686" layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657.a1583249337.a_1950625686.a37310974" format="h5 middleAirBottom" mode="normal" translate={true} value="Name">
							</UiText>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657.a1583249337.a_1950625686.a1308074079" layout="horizontal center">
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657.a1583249337.a_1950625686.a1308074079.a_369215405" format="airRight" mode="uppercase">
								</UiText>
								<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657.a1583249337.a_1950625686.a1308074079.a_414431806" title="Edit" target="self" mode="Button" size="Small">
								</UiAction>
								<DisplaysModelNameDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657.a1583249337.a_1950625686.a1308074079.a_1803829632">
								</DisplaysModelNameDialog>
							</UiBlock>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657.a1583249337.a_635239842" format="doubleAirTop" layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657.a1583249337.a_635239842.a1529676900" format="h5 middleAirBottom" mode="normal" translate={true} value="Description">
							</UiText>
							<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657.a1583249337.a_635239842.a995099282" mode="normal" editionMode="Raw" rows={4}>
							</UiTextEditable>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657.a1583249337.a_191588325" format="doubleAirTop" layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657.a1583249337.a_191588325.a42368375" format="h5 middleAirBottom" mode="normal" translate={true} value="DSL version">
							</UiText>
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657.a1583249337.a_191588325.a_2134982571" format="bold middleAirBottom" mode="normal">
							</UiText>
							<UiSelectorComboBox context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657.a1583249337.a_191588325.a1636123817" multipleSelection={false} maxMenuHeight={300}>
							</UiSelectorComboBox>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657.a1583249337.a_1214107671" format="doubleAirTop" visible={false} layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657.a1583249337.a_1214107671.a490564474" format="h5 middleAirBottom" mode="normal" translate={true} value="Model access">
							</UiText>
							<UiActionSwitch context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657.a1583249337.a_1214107671.a1652974726" title="Model is private" target="self" mode="Link" size="Medium">
							</UiActionSwitch>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657.a1583249337.a_2002763107" format="doubleAirTop" layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657.a1583249337.a_2002763107.a2074996221" format="h5" mode="normal" translate={true} value="Remove model">
							</UiText>
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657.a1583249337.a_2002763107.a748947225" format="airBottom greyColor" mode="normal" translate={true} value="Removed models cannot be restored!">
							</UiText>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657.a1583249337.a_2002763107.a177566048" layout="horizontal">
								<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657.a1583249337.a_2002763107.a177566048.a824011987" title="Remove model..." target="self" mode="Button" affirmed="Are you sure to remove model?" readonly={true} size="Medium" highlighted="Fill">
								</UiAction>
							</UiBlock>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657.a1583249337.a1273761691" format="doubleAirTop" visible={false} layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657.a1583249337.a1273761691.a421511056" format="h5" mode="normal" translate={true} value="Clone model">
							</UiText>
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657.a1583249337.a1273761691.a798724156" format="airBottom greyColor" mode="normal" translate={true} value="Copy both model files and resource files to a new model">
							</UiText>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657.a1583249337.a1273761691.a_1459172665" layout="horizontal">
								<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657.a1583249337.a1273761691.a_1459172665.a_327201606" title="Clone model..." target="self" mode="Button" affirmed="Cloning the model will create a copy and open it. Do you want to proceed?" size="Medium" highlighted="Fill">
								</UiAction>
							</UiBlock>
						</UiBlock>
					</UiBlockConditional>
					<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657.a366648212" format="doubleTopSpaced" layout="vertical flexible" width="95.0%" height="100.0%">
						<DisplaysCollaboratorsTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1581016657.a366648212.a1220292897">
						</DisplaysCollaboratorsTemplate>
					</UiBlockConditional>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(ModelSettingsEditor));
DisplayFactory.register("ModelSettingsEditor", withStyles(styles, { withTheme: true })(withSnackbar(ModelSettingsEditor)));