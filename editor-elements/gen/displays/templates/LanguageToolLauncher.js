import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiOpenSite from "alexandria-ui-elements/src/displays/components/OpenSite";
import UiDialog from "alexandria-ui-elements/src/displays/components/Dialog";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiSelectorListBox from "alexandria-ui-elements/src/displays/components/SelectorListBox";
import UiDivider from "alexandria-ui-elements/src/displays/components/Divider";
import UiCloseDialog from "alexandria-ui-elements/src/displays/components/CloseDialog";
import UiTextCode from "alexandria-ui-elements/src/displays/components/TextCode";
import UiCopyToClipboard from "alexandria-ui-elements/src/displays/components/CopyToClipboard";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import LanguageToolLauncherNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import LanguageToolLauncherRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LanguageToolLauncher extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new LanguageToolLauncherNotifier(this);
		this.requester = new LanguageToolLauncherRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="horizontal" style={{...this.props.style,...display}}>
				<UiOpenSite context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1821636500" title="" target="blank" mode="Link" size="Medium">
				</UiOpenSite>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a412009432" title="Select tool">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a412009432.a734514913" format="overflowAuto" layout="vertical" width="100.0%" height="calc(100% - 40px)">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a412009432.a734514913.a1553486416" format="middleAirBottom" mode="normal" value="Select a tool for this model">
						</UiText>
						<UiSelectorListBox context={this._context.bind(this)} owner={this._owner.bind(this)} id="a412009432.a734514913.a1477725123" multipleSelection={false}>
						</UiSelectorListBox>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a412009432.a_165579007">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a412009432.a_967496755" layout="horizontal endjustified">
						<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a412009432.a_967496755.a_467319126" title="Close" target="self" mode="Button" size="Small">
						</UiCloseDialog>
					</UiBlock>
				</UiDialog>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2050284056" title="Forge">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2050284056.a_721095903" format="overflowAuto" layout="vertical" width="100.0%" height="calc(100% - 40px)">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2050284056.a_721095903.a_691995902" format="middleAirBottom" mode="normal" value="With this model you need to follow this steps">
						</UiText>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2050284056.a_721095903.a_393914760" format="airBottom" layout="horizontal">
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2050284056.a_721095903.a_393914760.a_1563386420" layout="vertical flexible">
								<UiTextCode context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2050284056.a_721095903.a_393914760.a_1563386420.a95695798" format="airRight" mode="normal" language="Html" value="">
								</UiTextCode>
							</UiBlock>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2050284056.a_721095903.a_393914760.a840860601" layout="horizontal endjustified">
								<UiCopyToClipboard context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2050284056.a_721095903.a_393914760.a840860601.a1878333866" title="Copy" target="self" mode="MaterialIconButton" icon="FileCopy" size="Small">
								</UiCopyToClipboard>
							</UiBlock>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2050284056.a_721095903.a1626246515" format="airBottom" layout="horizontal">
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2050284056.a_721095903.a1626246515.a1917362638" layout="vertical flexible">
								<UiTextCode context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2050284056.a_721095903.a1626246515.a1917362638.a_464769026" format="airRight" mode="normal" language="Html" value="">
								</UiTextCode>
							</UiBlock>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2050284056.a_721095903.a1626246515.a1088252045" layout="horizontal endjustified">
								<UiCopyToClipboard context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2050284056.a_721095903.a1626246515.a1088252045.a_199845494" title="Copy" target="self" mode="MaterialIconButton" icon="FileCopy" size="Small">
								</UiCopyToClipboard>
							</UiBlock>
						</UiBlock>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2050284056.a_2054040782">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2050284056.a_470241177" layout="horizontal endjustified">
						<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2050284056.a_470241177.a_1100698215" title="Close" target="self" mode="Button" size="Small">
						</UiCloseDialog>
					</UiBlock>
				</UiDialog>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a131858238" title="Forge">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a131858238.a_1400385633" format="overflowAuto" layout="vertical" width="100.0%" height="calc(100% - 40px)">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a131858238.a_1400385633.a_1287775856" format="middleAirBottom" mode="normal" value="With this model you need to follow this steps">
						</UiText>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a131858238.a_1400385633.a647176732" format="airBottom" layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a131858238.a_1400385633.a647176732.a_1052145393" mode="normal" value="Install instructions">
							</UiText>
							<UiTextCode context={this._context.bind(this)} owner={this._owner.bind(this)} id="a131858238.a_1400385633.a647176732.a242737132" mode="normal" language="Html" value="">
							</UiTextCode>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a131858238.a_1400385633.a_121275889" format="airBottom" layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a131858238.a_1400385633.a_121275889.a_716134621" mode="normal" value="Execution instructions">
							</UiText>
							<UiTextCode context={this._context.bind(this)} owner={this._owner.bind(this)} id="a131858238.a_1400385633.a_121275889.a_951480531" mode="normal" language="Html" value="">
							</UiTextCode>
						</UiBlock>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a131858238.a155590463">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a131858238.a1093377604" layout="horizontal endjustified">
						<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a131858238.a1093377604.a1044300535" title="Close" target="self" mode="Button" size="Small">
						</UiCloseDialog>
					</UiBlock>
				</UiDialog>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LanguageToolLauncher));
DisplayFactory.register("LanguageToolLauncher", withStyles(styles, { withTheme: true })(withSnackbar(LanguageToolLauncher)));