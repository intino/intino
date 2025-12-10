import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiDialog from "alexandria-ui-elements/src/displays/components/Dialog";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiSelectorRadioBox from "alexandria-ui-elements/src/displays/components/SelectorRadioBox";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiBlockConditional from "alexandria-ui-elements/src/displays/components/BlockConditional";
import UiTextEditable from "alexandria-ui-elements/src/displays/components/TextEditable";
import UiSelectorComboBox from "alexandria-ui-elements/src/displays/components/SelectorComboBox";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiDivider from "alexandria-ui-elements/src/displays/components/Divider";
import UiCloseDialog from "alexandria-ui-elements/src/displays/components/CloseDialog";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import ModelTitleDialogNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import ModelTitleDialogRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class ModelTitleDialog extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new ModelTitleDialogNotifier(this);
		this.requester = new ModelTitleDialogRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="horizontal" style={{...this.props.style,...display}}>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1233503119" title="Edit name" width="800px" height="600px">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1233503119.a137068361" layout="vertical" width="100.0%" height="calc(100% - 40px)">
						<UiSelectorRadioBox context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1233503119.a137068361.a2082232672" multipleSelection={false} layout="Vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1233503119.a137068361.a2082232672.a152790342" name="simpleOption" mode="normal" value="Simple name">
							</UiText>
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1233503119.a137068361.a2082232672.a_1274777774" name="qualifiedOption" mode="normal" value="Qualified name">
							</UiText>
						</UiSelectorRadioBox>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1233503119.a137068361.a1430075711" format="doubleAirTop" layout="vertical">
							<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1233503119.a137068361.a1430075711.a430881817" layout="vertical">
								<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1233503119.a137068361.a1430075711.a430881817.a_1188919960" mode="uppercase">
								</UiTextEditable>
							</UiBlockConditional>
							<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1233503119.a137068361.a1430075711.a_1684344353" layout="vertical">
								<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1233503119.a137068361.a1430075711.a_1684344353.a_66266914" format="airBottom" mode="normal" placeholder="Fill project and module" readonly={true}>
								</UiTextEditable>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1233503119.a137068361.a1430075711.a_1684344353.a226847833" layout="horizontal center">
									<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1233503119.a137068361.a1430075711.a_1684344353.a226847833.a_942378874" format="middleAirRight" layout="vertical" width="calc(50% - 5px)" height="100.0%">
										<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1233503119.a137068361.a1430075711.a_1684344353.a226847833.a_942378874.a_121333962" mode="normal" value="Project">
										</UiText>
										<UiSelectorComboBox context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1233503119.a137068361.a1430075711.a_1684344353.a226847833.a_942378874.a_1971565755" multipleSelection={false} placeholder="Select project" maxMenuHeight={300}>
										</UiSelectorComboBox>
										<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1233503119.a137068361.a1430075711.a_1684344353.a226847833.a_942378874.a1115701381" title="Add project" target="self" mode="Link" size="Medium" format="smallAirTop">
										</UiAction>
									</UiBlock>
									<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1233503119.a137068361.a1430075711.a_1684344353.a226847833.a1116048346" format="middleAirLeft" layout="vertical" width="calc(50% - 5px)" height="100.0%">
										<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1233503119.a137068361.a1430075711.a_1684344353.a226847833.a1116048346.a_1258390791" mode="normal" value="Module">
										</UiText>
										<UiSelectorComboBox context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1233503119.a137068361.a1430075711.a_1684344353.a226847833.a1116048346.a_456183782" multipleSelection={false} placeholder="Select module" maxMenuHeight={300}>
										</UiSelectorComboBox>
										<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1233503119.a137068361.a1430075711.a_1684344353.a226847833.a1116048346.a452732024" title="Add module" target="self" mode="Link" size="Medium" format="smallAirTop">
										</UiAction>
									</UiBlock>
								</UiBlock>
							</UiBlockConditional>
						</UiBlock>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1233503119.a778567133">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1233503119.a2034059100" layout="horizontal endjustified">
						<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1233503119.a2034059100.a_2005818357" title="Cancel" target="self" mode="Button" size="Small" format="airRight">
						</UiCloseDialog>
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1233503119.a2034059100.a927063504" title="Save" target="self" mode="Button" size="Small" highlighted="Fill">
						</UiAction>
					</UiBlock>
				</UiDialog>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1331189376" title="Add" width="300px" height="170px">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1331189376.a971062660" layout="vertical" width="100.0%" height="calc(100% - 40px)">
						<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1331189376.a971062660.a999910023" mode="uppercase">
						</UiTextEditable>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1331189376.a1808680881">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1331189376.a_1391009323" layout="horizontal endjustified">
						<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1331189376.a_1391009323.a1201180159" title="Cancel" target="self" mode="Button" size="Small" format="airRight">
						</UiCloseDialog>
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1331189376.a_1391009323.a618192886" title="Add" target="self" mode="Button" size="Small" highlighted="Fill">
						</UiAction>
					</UiBlock>
				</UiDialog>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(ModelTitleDialog));
DisplayFactory.register("ModelTitleDialog", withStyles(styles, { withTheme: true })(withSnackbar(ModelTitleDialog)));