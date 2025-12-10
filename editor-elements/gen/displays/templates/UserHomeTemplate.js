import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiMultiple from "alexandria-ui-elements/src/displays/components/Multiple";
import DisplaysLicenseItemTemplate from "editor-elements/gen/displays/templates/LicenseItemTemplate";
import DisplaysAddLicenseEditor from "editor-elements/gen/displays/templates/AddLicenseEditor";
import DisplaysCollectionItemTemplate from "editor-elements/gen/displays/templates/CollectionItemTemplate";
import DisplaysRenewLicenseDialog from "editor-elements/gen/displays/templates/RenewLicenseDialog";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import UserHomeTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import UserHomeTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class UserHomeTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new UserHomeTemplateNotifier(this);
		this.requester = new UserHomeTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_813503583" format="doubleAirBottom" layout="vertical">
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_813503583.a_1321628900" format="h5 smallAirBottom" mode="normal" translate={true} value="My licenses">
					</UiText>
					<UiMultiple context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_813503583.a2049611701" multiple={{instances:"licenses",arrangement:"Vertical",noItemsMessage:"You currently have no licenses",spacing:0,editable:false,wrap:true,collapsed:false,count:{min:0,max:-1}}}>
					</UiMultiple>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_813503583.a558137733" layout="vertical">
						<DisplaysAddLicenseEditor context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_813503583.a558137733.a743835532">
						</DisplaysAddLicenseEditor>
					</UiBlock>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_723869888" format="doubleAirBottom" visible={false} layout="vertical">
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_723869888.a_1626085459" format="h5" mode="normal" translate={true} value="My collections">
					</UiText>
					<UiMultiple context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_723869888.a_1458420970" multiple={{instances:"collections",arrangement:"Vertical",noItemsMessage:"You are not currently managing any collections",spacing:0,editable:false,wrap:true,collapsed:false,count:{min:0,max:-1}}}>
					</UiMultiple>
				</UiBlock>
				<DisplaysRenewLicenseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_861131560">
				</DisplaysRenewLicenseDialog>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(UserHomeTemplate));
DisplayFactory.register("UserHomeTemplate", withStyles(styles, { withTheme: true })(withSnackbar(UserHomeTemplate)));