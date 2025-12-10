import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiCopyToClipboard from "alexandria-ui-elements/src/displays/components/CopyToClipboard";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiOpenDialog from "alexandria-ui-elements/src/displays/components/OpenDialog";
import UiTextEditable from "alexandria-ui-elements/src/displays/components/TextEditable";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiGrid from "alexandria-ui-elements/src/displays/components/Grid";
import UiDialog from "alexandria-ui-elements/src/displays/components/Dialog";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiNumberEditable from "alexandria-ui-elements/src/displays/components/NumberEditable";
import UiDivider from "alexandria-ui-elements/src/displays/components/Divider";
import UiCloseDialog from "alexandria-ui-elements/src/displays/components/CloseDialog";
import DisplaysLicenseItemTemplate from "editor-elements/gen/displays/templates/LicenseItemTemplate";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import LicensesTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import LicensesTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LicensesTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new LicensesTemplateNotifier(this);
		this.requester = new LicensesTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" width="100.0%" height={this.fixHeight != null ? this.fixHeight("100.0%") : "100.0%"} style={{...this.props.style,...display}}>
				<UiCopyToClipboard context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_438711409" title=" " target="self" mode="Link" size="Medium">
				</UiCopyToClipboard>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a333050699" format="airLeft" layout="horizontal center">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a333050699.a1991837754" layout="horizontal flexible">
						<UiOpenDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a333050699.a1991837754.a_1632977527" title="Add..." target="self" mode="Button" size="Small" highlighted="Outline" visible={false}>
						</UiOpenDialog>
						<UiOpenDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a333050699.a1991837754.a_1865865023" title="Revoke..." target="self" mode="Button" size="Small" format="airLeft" highlighted="Outline" visible={false}>
						</UiOpenDialog>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a333050699.a_2008895444" layout="horizontal endjustified">
						<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a333050699.a_2008895444.a1360832162" format="middleAirBottom middleAirTop" visible={false} mode="normal" placeholder="Search...">
						</UiTextEditable>
					</UiBlock>
				</UiBlock>
				<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1671370244" visible={false} mode="normal" value="There are no licenses in this collection">
				</UiText>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1114599913" layout="vertical flexible" width="100.0%" height="100.0%" autoSize={true}>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1114599913.a_808764228" layout="vertical flexible center" width="100.0%" height="100.0%">
						<UiGrid context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1114599913.a_808764228.a804866395" noItemsMessage="" pageSize={30} itemHeight={100} scrollingMark={false}>
						</UiGrid>
					</UiBlock>
				</UiBlock>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1504932167" title="Add licenses">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1504932167.a_6866770" layout="vertical" width="100.0%" height="calc(100% - 40px)">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1504932167.a_6866770.a_1639421831" format="airBottom" layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1504932167.a_6866770.a_1639421831.a663254827" format="bold" mode="normal">
							</UiText>
							<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1504932167.a_6866770.a_1639421831.a_46861793" title="buy more" target="self" mode="Link" size="Medium" visible={false}>
							</UiAction>
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1504932167.a_6866770.a_1639421831.a_437823005" format="greyColor" visible={false} mode="normal">
							</UiText>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1504932167.a_6866770.a_348350206" format="airBottom" layout="vertical" width="300px" height="-1px">
							<UiNumberEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1504932167.a_6866770.a_348350206.a_1629030415" label="Count licenses to add" format="airBottom h5" style="Number" value={1.0} suffix="licenses" min={1.0} max={-1.0} step={-1.0} decimals={0} expanded={true}>
							</UiNumberEditable>
							<UiNumberEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1504932167.a_6866770.a_348350206.a348764992" label="Duration for licenses" format="airBottom h5" style="Number" value={1.0} suffix="Months" min={1.0} max={-1.0} step={-1.0} decimals={0} expanded={true}>
							</UiNumberEditable>
						</UiBlock>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1504932167.a_91237168">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1504932167.a1695890525" layout="horizontal endjustified">
						<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1504932167.a1695890525.a_397125435" title="Cancel" target="self" mode="Button" size="Small" format="airRight">
						</UiCloseDialog>
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1504932167.a1695890525.a543881235" title="Add" target="self" mode="Button" size="Small" highlighted="Fill">
						</UiAction>
					</UiBlock>
				</UiDialog>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1979710705" title="Revoke license">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1979710705.a_248791397" layout="vertical" width="100.0%" height="calc(100% - 40px)">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1979710705.a_248791397.a_2023294676" format="doubleAirBottom" layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1979710705.a_248791397.a_2023294676.a_1477051378" format="bold" mode="normal" value="To proceed with revocation, please provide the license code you wish to revoke">
							</UiText>
							<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1979710705.a_248791397.a_2023294676.a1822640496" mode="normal" placeholder="Enter license code" focused={true}>
							</UiTextEditable>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1979710705.a_248791397.a_2023294676.a_1341277968" format="airTop" visible={false} layout="vertical">
								<DisplaysLicenseItemTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1979710705.a_248791397.a_2023294676.a_1341277968.a_1744926991">
								</DisplaysLicenseItemTemplate>
							</UiBlock>
						</UiBlock>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1979710705.a1013385607">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1979710705.a_280400866" layout="horizontal endjustified">
						<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1979710705.a_280400866.a_1333048317" title="Cancel" target="self" mode="Button" size="Small" format="airRight">
						</UiCloseDialog>
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1979710705.a_280400866.a_600024187" title="Revoke" target="self" mode="Button" size="Small" highlighted="Fill">
						</UiAction>
					</UiBlock>
				</UiDialog>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LicensesTemplate));
DisplayFactory.register("LicensesTemplate", withStyles(styles, { withTheme: true })(withSnackbar(LicensesTemplate)));