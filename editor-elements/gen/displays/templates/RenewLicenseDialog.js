import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiDialog from "alexandria-ui-elements/src/displays/components/Dialog";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiDivider from "alexandria-ui-elements/src/displays/components/Divider";
import UiCloseDialog from "alexandria-ui-elements/src/displays/components/CloseDialog";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import RenewLicenseDialogNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import RenewLicenseDialogRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class RenewLicenseDialog extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new RenewLicenseDialogNotifier(this);
		this.requester = new RenewLicenseDialogRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" style={{...this.props.style,...display}}>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1985304564" title="renew license">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1985304564.a1475436255" format="overflowAuto relative" layout="vertical" width="100.0%" height="calc(100% - 40px)">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1985304564.a1475436255.a_281862508" format="doubleAirBottom" layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1985304564.a1475436255.a_281862508.a1966507781" mode="normal">
							</UiText>
						</UiBlock>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1985304564.a_396218676">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1985304564.a1466717633" layout="horizontal endjustified">
						<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1985304564.a1466717633.a_2032822775" title="Cancel" target="self" mode="Button" size="Small" format="airRight">
						</UiCloseDialog>
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1985304564.a1466717633.a_1567426847" title="Rewew" target="self" mode="Button" affirmed="Confirm license renewal to continue" readonly={true} size="Small" highlighted="Fill">
						</UiAction>
					</UiBlock>
				</UiDialog>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(RenewLicenseDialog));
DisplayFactory.register("RenewLicenseDialog", withStyles(styles, { withTheme: true })(withSnackbar(RenewLicenseDialog)));