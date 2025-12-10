import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiSelectorComboBox from "alexandria-ui-elements/src/displays/components/SelectorComboBox";
import UiOpenPopover from "alexandria-ui-elements/src/displays/components/OpenPopover";
import UiBlockPopover from "alexandria-ui-elements/src/displays/components/BlockPopover";
import UiTextEditable from "alexandria-ui-elements/src/displays/components/TextEditable";
import UiMaterialIcon from "alexandria-ui-elements/src/displays/components/MaterialIcon";
import UiActionSwitch from "alexandria-ui-elements/src/displays/components/ActionSwitch";
import DisplaysCreateCollectionDialog from "editor-elements/gen/displays/templates/CreateCollectionDialog";
import DisplaysLanguageLogoDialog from "editor-elements/gen/displays/templates/LanguageLogoDialog";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import LanguageEditorNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import LanguageEditorRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LanguageEditor extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new LanguageEditorNotifier(this);
		this.requester = new LanguageEditorRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" width="100.0%" height={this.fixHeight != null ? this.fixHeight("100.0%") : "100.0%"} style={{...this.props.style,...display}}>
				<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_99289269" title=" " target="self" mode="Link" affirmed="The DSL properties is about to be changed. This operation will affect all generated models." size="Medium">
				</UiAction>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402" layout="horizontal center wrap">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a186266541" layout="horizontal wrap">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a186266541.a_1675737782" format="airTop doubleAirRight" layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a186266541.a_1675737782.a419736289" format="airRight h5" mode="normal" translate={true} value="Collection">
							</UiText>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a186266541.a_1675737782.a1075806858" layout="horizontal center">
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a186266541.a_1675737782.a1075806858.a1736498284" layout="vertical" width="300px" height="-1px">
									<UiSelectorComboBox context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a186266541.a_1675737782.a1075806858.a1736498284.a1406207122" format="dslFieldInput" multipleSelection={false} placeholder="Select collection" maxMenuHeight={300}>
									</UiSelectorComboBox>
								</UiBlock>
								<UiOpenPopover context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a186266541.a_1675737782.a1075806858.a229198921" title="Help" target="self" mode="MaterialIconButton" icon="Help" size="Medium" triggerEvent="MouseOver">
								</UiOpenPopover>
								<UiBlockPopover context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a186266541.a_1675737782.a1075806858.a_2109369264" format="doubleSpaced" layout="vertical" width="300px" height="-1px" position="BottomCenter">
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a186266541.a_1675737782.a1075806858.a_2109369264.a_662557633" mode="normal" value="The collection acts as a namespace for your DSLs. It prevents naming conflicts between users and helps organize DSLs by ownership.">
									</UiText>
								</UiBlockPopover>
							</UiBlock>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a186266541.a_1675737782.a1080742485" format="smallAirTop" layout="vertical">
								<DisplaysCreateCollectionDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a186266541.a_1675737782.a1080742485.a_2044047948">
								</DisplaysCreateCollectionDialog>
							</UiBlock>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a186266541.a_534749011" format="airTop doubleAirRight" layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a186266541.a_534749011.a_964214914" format="h5 middleAirBottom" mode="normal" translate={true} value="Name">
							</UiText>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a186266541.a_534749011.a_1007506332" layout="horizontal">
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a186266541.a_534749011.a_1007506332.a252612130" format="relative" layout="vertical">
									<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a186266541.a_534749011.a_1007506332.a252612130.a_233036616" format="dslFieldInput" mode="lowercase" readonly={true}>
									</UiTextEditable>
									<UiMaterialIcon context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a186266541.a_534749011.a_1007506332.a252612130.a_747222839" format="rightIconField veryLargeIconSize" color="green" visible={false} icon="Check">
									</UiMaterialIcon>
									<UiMaterialIcon context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a186266541.a_534749011.a_1007506332.a252612130.a_939204220" format="rightIconField veryLargeIconSize" color="red" visible={false} icon="Clear">
									</UiMaterialIcon>
								</UiBlock>
								<UiOpenPopover context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a186266541.a_534749011.a_1007506332.a_1944392820" title="Help" target="self" mode="MaterialIconButton" icon="Help" size="Medium" triggerEvent="MouseOver">
								</UiOpenPopover>
								<UiBlockPopover context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a186266541.a_534749011.a_1007506332.a_1356891615" format="doubleSpaced" layout="vertical" width="300px" height="-1px" position="BottomCenter">
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a186266541.a_534749011.a_1007506332.a_1356891615.a482273711" mode="normal" value="The name identifies your DSL within the selected domain. It must be unique inside that domain.">
									</UiText>
								</UiBlockPopover>
							</UiBlock>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a186266541.a776197697" format="airTop doubleAirRight" layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a186266541.a776197697.a1844952744" format="h5 middleAirBottom" mode="normal" translate={true} value="Private">
							</UiText>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a186266541.a776197697.a_20974169" layout="horizontal">
								<UiActionSwitch context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a186266541.a776197697.a_20974169.a_665213051" title="" target="self" mode="Link" size="Medium">
								</UiActionSwitch>
								<UiOpenPopover context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a186266541.a776197697.a_20974169.a1080554824" title="Help" target="self" mode="MaterialIconButton" icon="Help" size="Medium" triggerEvent="MouseOver">
								</UiOpenPopover>
								<UiBlockPopover context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a186266541.a776197697.a_20974169.a1147530864" format="doubleSpaced" layout="vertical" width="300px" height="-1px" position="BottomCenter">
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a186266541.a776197697.a_20974169.a1147530864.a_268824912" mode="normal" value="Only users with access to selected collection can use this DSL.">
									</UiText>
								</UiBlockPopover>
							</UiBlock>
						</UiBlock>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a1975129211" format="airTop doubleAirRight" layout="vertical">
						<DisplaysLanguageLogoDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1696959402.a1975129211.a196216597">
						</DisplaysLanguageLogoDialog>
					</UiBlock>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1055025334" format="airTop doubleAirBottom" layout="vertical">
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1055025334.a_637482348" format="redColor" mode="normal">
					</UiText>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LanguageEditor));
DisplayFactory.register("LanguageEditor", withStyles(styles, { withTheme: true })(withSnackbar(LanguageEditor)));