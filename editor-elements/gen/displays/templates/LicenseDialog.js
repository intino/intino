import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiDialog from "alexandria-ui-elements/src/displays/components/Dialog";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiDivider from "alexandria-ui-elements/src/displays/components/Divider";
import UiCloseDialog from "alexandria-ui-elements/src/displays/components/CloseDialog";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import DisplaysRenewLicenseDialog from "editor-elements/gen/displays/templates/RenewLicenseDialog";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import LicenseDialogNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import LicenseDialogRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LicenseDialog extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new LicenseDialogNotifier(this);
		this.requester = new LicenseDialogRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" style={{...this.props.style,...display}}>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1639347261" title="License required">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1639347261.a170404860" format="overflowAuto relative" layout="vertical" width="100.0%" height="calc(100% - 40px)">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1639347261.a170404860.a1805948948" format="doubleAirBottom" layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1639347261.a170404860.a1805948948.a_1574376615" mode="normal">
							</UiText>
						</UiBlock>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1639347261.a325546462">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1639347261.a871662662" layout="horizontal endjustified">
						<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1639347261.a871662662.a_832093055" title="Close" target="self" mode="Button" size="Small" format="airRight">
						</UiCloseDialog>
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1639347261.a871662662.a1377649952" title="Renew" target="self" mode="Button" size="Small" highlighted="Fill" visible={false}>
						</UiAction>
					</UiBlock>
				</UiDialog>
				<DisplaysRenewLicenseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a258256992">
				</DisplaysRenewLicenseDialog>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LicenseDialog));
DisplayFactory.register("LicenseDialog", withStyles(styles, { withTheme: true })(withSnackbar(LicenseDialog)));