import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import ProjectModuleEntryViewerNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import ProjectModuleEntryViewerRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class ProjectModuleEntryViewer extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new ProjectModuleEntryViewerNotifier(this);
		this.requester = new ProjectModuleEntryViewerRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock format="smallAirBottom" layout="horizontal center" style={{...this.props.style,...display}}>
				<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1042030477" format="bubble" mode="normal" value=" ">
				</UiText>
				<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a567378897" title="" target="self" mode="Link" size="Medium" format="h6" visible={false}>
				</UiAction>
				<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a567613700" format="bold h6" visible={false} mode="normal">
				</UiText>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(ProjectModuleEntryViewer));
DisplayFactory.register("ProjectModuleEntryViewer", withStyles(styles, { withTheme: true })(withSnackbar(ProjectModuleEntryViewer)));