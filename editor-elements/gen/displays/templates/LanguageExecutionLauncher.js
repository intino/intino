import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiOpenSite from "alexandria-ui-elements/src/displays/components/OpenSite";
import UiDialog from "alexandria-ui-elements/src/displays/components/Dialog";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiTextEditable from "alexandria-ui-elements/src/displays/components/TextEditable";
import UiCopyToClipboard from "alexandria-ui-elements/src/displays/components/CopyToClipboard";
import UiDivider from "alexandria-ui-elements/src/displays/components/Divider";
import UiCloseDialog from "alexandria-ui-elements/src/displays/components/CloseDialog";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import LanguageExecutionLauncherNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import LanguageExecutionLauncherRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LanguageExecutionLauncher extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new LanguageExecutionLauncherNotifier(this);
		this.requester = new LanguageExecutionLauncherRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="horizontal" style={{...this.props.style,...display}}>
				<UiOpenSite context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1587874651" title=" " target="blank" mode="Link" size="Medium">
				</UiOpenSite>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2117068853" title="Execution instructions" width="800px" height="600px">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2117068853.a_1573953626" format="overflowAuto" layout="vertical" width="100.0%" height="calc(100% - 40px)">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2117068853.a_1573953626.a_339051501" format="middleAirBottom" mode="normal" value="To run this model locally, make sure your environment is set up correctly. Below you’ll find installation notes. Once everything is ready, you can copy and run the command shown to execute the model.">
						</UiText>
						<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2117068853.a_1573953626.a_475217779" format="airTop" mode="normal" editionMode="Raw" rows={20} readonly={true}>
						</UiTextEditable>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2117068853.a_1573953626.a_1122279182" layout="horizontal">
							<UiCopyToClipboard context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2117068853.a_1573953626.a_1122279182.a_2007109534" title="Copy" target="self" mode="Link" size="Medium" format="middleAirTop upperCase">
							</UiCopyToClipboard>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2117068853.a_1573953626.a2050342275" layout="horizontal">
							<UiOpenSite context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2117068853.a_1573953626.a2050342275.a1341112390" title="Installation notes" target="blank" mode="Link" size="Medium" format="middleAirTop upperCase" visible={false}>
							</UiOpenSite>
						</UiBlock>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2117068853.a2012771608">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2117068853.a162050201" layout="horizontal endjustified">
						<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2117068853.a162050201.a_615197123" title="Close" target="self" mode="Button" size="Small">
						</UiCloseDialog>
					</UiBlock>
				</UiDialog>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LanguageExecutionLauncher));
DisplayFactory.register("LanguageExecutionLauncher", withStyles(styles, { withTheme: true })(withSnackbar(LanguageExecutionLauncher)));