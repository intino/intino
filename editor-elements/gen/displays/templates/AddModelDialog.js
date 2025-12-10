import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiDialog from "alexandria-ui-elements/src/displays/components/Dialog";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiTextEditable from "alexandria-ui-elements/src/displays/components/TextEditable";
import UiDivider from "alexandria-ui-elements/src/displays/components/Divider";
import UiCloseDialog from "alexandria-ui-elements/src/displays/components/CloseDialog";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import AddModelDialogNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import AddModelDialogRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class AddModelDialog extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new AddModelDialogNotifier(this);
		this.requester = new AddModelDialogRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" style={{...this.props.style,...display}}>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_627225864" title="Add model" width="450px" height="450px">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_627225864.a_1896992717" layout="vertical" width="100.0%" height="calc(100% - 40px)">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_627225864.a_1896992717.a_657950247" layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_627225864.a_1896992717.a_657950247.a1348821414" format="h5 middleAirBottom" mode="normal" translate={true} value="Name">
							</UiText>
							<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_627225864.a_1896992717.a_657950247.a_1968943779" mode="normal" focused={true} helperText="Only alphanumeric characters are allowed">
							</UiTextEditable>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_627225864.a_1896992717.a_358530848" format="doubleAirTop" layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_627225864.a_1896992717.a_358530848.a642375194" format="h5 middleAirBottom" mode="normal" translate={true} value="Title">
							</UiText>
							<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_627225864.a_1896992717.a_358530848.a1204383729" mode="normal">
							</UiTextEditable>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_627225864.a_1896992717.a1285403871" format="doubleAirTop" layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_627225864.a_1896992717.a1285403871.a_681314480" format="h5 middleAirBottom" mode="normal" translate={true} value="Description">
							</UiText>
							<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_627225864.a_1896992717.a1285403871.a178858154" mode="normal" editionMode="Raw" rows={4}>
							</UiTextEditable>
						</UiBlock>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_627225864.a429037788">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_627225864.a213973566" layout="horizontal endjustified">
						<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_627225864.a213973566.a1317511637" title="Cancel" target="self" mode="Button" size="Small" format="airRight">
						</UiCloseDialog>
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_627225864.a213973566.a_191718742" title="Add" target="self" mode="Button" size="Small" highlighted="Fill">
						</UiAction>
					</UiBlock>
				</UiDialog>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(AddModelDialog));
DisplayFactory.register("AddModelDialog", withStyles(styles, { withTheme: true })(withSnackbar(AddModelDialog)));