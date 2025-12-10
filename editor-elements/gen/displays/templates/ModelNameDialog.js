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
import ModelNameDialogNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import ModelNameDialogRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class ModelNameDialog extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new ModelNameDialogNotifier(this);
		this.requester = new ModelNameDialogRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="horizontal" style={{...this.props.style,...display}}>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1590221238" title="Edit name" width="800px" height="600px">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1590221238.a_298167218" layout="vertical" width="100.0%" height="calc(100% - 40px)">
						<UiSelectorRadioBox context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1590221238.a_298167218.a_227343287" multipleSelection={false} layout="Vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1590221238.a_298167218.a_227343287.a_381321987" name="simpleOption" mode="normal" value="Simple name">
							</UiText>
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1590221238.a_298167218.a_227343287.a_161339333" name="qualifiedOption" mode="normal" value="Qualified name">
							</UiText>
						</UiSelectorRadioBox>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1590221238.a_298167218.a_610295341" format="doubleAirTop" layout="vertical">
							<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1590221238.a_298167218.a_610295341.a414806240" layout="vertical">
								<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1590221238.a_298167218.a_610295341.a414806240.a_1959729008" mode="uppercase">
								</UiTextEditable>
							</UiBlockConditional>
							<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1590221238.a_298167218.a_610295341.a_1303496746" layout="vertical">
								<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1590221238.a_298167218.a_610295341.a_1303496746.a_655550724" format="airBottom" mode="normal" placeholder="Fill project and module" readonly={true}>
								</UiTextEditable>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1590221238.a_298167218.a_610295341.a_1303496746.a_849692064" layout="horizontal center">
									<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1590221238.a_298167218.a_610295341.a_1303496746.a_849692064.a1665738826" format="middleAirRight" layout="vertical" width="calc(50% - 5px)" height="100.0%">
										<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1590221238.a_298167218.a_610295341.a_1303496746.a_849692064.a1665738826.a_1145579790" mode="normal" value="Project">
										</UiText>
										<UiSelectorComboBox context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1590221238.a_298167218.a_610295341.a_1303496746.a_849692064.a1665738826.a_618838297" multipleSelection={false} placeholder="Select project" maxMenuHeight={300}>
										</UiSelectorComboBox>
										<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1590221238.a_298167218.a_610295341.a_1303496746.a_849692064.a1665738826.a1574979747" title="Add project" target="self" mode="Link" size="Medium" format="smallAirTop">
										</UiAction>
									</UiBlock>
									<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1590221238.a_298167218.a_610295341.a_1303496746.a_849692064.a_570801250" format="middleAirLeft" layout="vertical" width="calc(50% - 5px)" height="100.0%">
										<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1590221238.a_298167218.a_610295341.a_1303496746.a_849692064.a_570801250.a1349726909" mode="normal" value="Module">
										</UiText>
										<UiSelectorComboBox context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1590221238.a_298167218.a_610295341.a_1303496746.a_849692064.a_570801250.a3094584" multipleSelection={false} placeholder="Select module" maxMenuHeight={300}>
										</UiSelectorComboBox>
										<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1590221238.a_298167218.a_610295341.a_1303496746.a_849692064.a_570801250.a_779378534" title="Add module" target="self" mode="Link" size="Medium" format="smallAirTop">
										</UiAction>
									</UiBlock>
								</UiBlock>
							</UiBlockConditional>
						</UiBlock>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1590221238.a_2142686643">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1590221238.a75688343" layout="horizontal endjustified">
						<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1590221238.a75688343.a602299343" title="Cancel" target="self" mode="Button" size="Small" format="airRight">
						</UiCloseDialog>
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1590221238.a75688343.a53072750" title="Save" target="self" mode="Button" size="Small" highlighted="Fill">
						</UiAction>
					</UiBlock>
				</UiDialog>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1723385095" title="Add" width="300px" height="170px">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1723385095.a1395427323" layout="vertical" width="100.0%" height="calc(100% - 40px)">
						<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1723385095.a1395427323.a1093755173" mode="uppercase">
						</UiTextEditable>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1723385095.a206249011">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1723385095.a1301526103" layout="horizontal endjustified">
						<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1723385095.a1301526103.a_1532341999" title="Cancel" target="self" mode="Button" size="Small" format="airRight">
						</UiCloseDialog>
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1723385095.a1301526103.a_2108712211" title="Add" target="self" mode="Button" size="Small" highlighted="Fill">
						</UiAction>
					</UiBlock>
				</UiDialog>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(ModelNameDialog));
DisplayFactory.register("ModelNameDialog", withStyles(styles, { withTheme: true })(withSnackbar(ModelNameDialog)));