import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTextEditable from "alexandria-ui-elements/src/displays/components/TextEditable";
import UiDialog from "alexandria-ui-elements/src/displays/components/Dialog";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiDivider from "alexandria-ui-elements/src/displays/components/Divider";
import UiCloseDialog from "alexandria-ui-elements/src/displays/components/CloseDialog";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import AddLicenseEditorNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import AddLicenseEditorRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class AddLicenseEditor extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new AddLicenseEditorNotifier(this);
		this.requester = new AddLicenseEditorRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" style={{...this.props.style,...display}}>
				<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1541607860" mode="normal" placeholder="Paste license here">
				</UiTextEditable>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_657314625" title="Invalid license">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_657314625.a926666012" format="overflowAuto relative" layout="vertical" width="100.0%" height="calc(100% - 40px)">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_657314625.a926666012.a228084715" format="airBottom" mode="normal" value="Failure! The license code is invalid or has already been used">
						</UiText>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_657314625.a_2004013762">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_657314625.a_1351570847" layout="horizontal endjustified">
						<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_657314625.a_1351570847.a_439027308" title="Close" target="self" mode="Button" size="Small" highlighted="Fill">
						</UiCloseDialog>
					</UiBlock>
				</UiDialog>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(AddLicenseEditor));
DisplayFactory.register("AddLicenseEditor", withStyles(styles, { withTheme: true })(withSnackbar(AddLicenseEditor)));