import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiDialog from "alexandria-ui-elements/src/displays/components/Dialog";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiDivider from "alexandria-ui-elements/src/displays/components/Divider";
import UiCloseDialog from "alexandria-ui-elements/src/displays/components/CloseDialog";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import AddCollaboratorDialogNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import AddCollaboratorDialogRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class AddCollaboratorDialog extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new AddCollaboratorDialogNotifier(this);
		this.requester = new AddCollaboratorDialogRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" style={{...this.props.style,...display}}>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2009788407" title="Properties" width="450px" height="300px">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2009788407.a2139693513" format="overflowAuto" layout="vertical" width="100.0%" height="calc(100% - 40px)">
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2009788407.a_2030343946">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2009788407.a_1646064748" layout="horizontal endjustified">
						<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2009788407.a_1646064748.a_614496234" title="Cancel" target="self" mode="Button" size="Small" format="airRight">
						</UiCloseDialog>
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2009788407.a_1646064748.a1531840888" title="Add" target="self" mode="Button" size="Small" highlighted="Fill">
						</UiAction>
					</UiBlock>
				</UiDialog>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(AddCollaboratorDialog));
DisplayFactory.register("AddCollaboratorDialog", withStyles(styles, { withTheme: true })(withSnackbar(AddCollaboratorDialog)));