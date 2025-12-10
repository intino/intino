import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import ProjectModuleLinkViewerNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import ProjectModuleLinkViewerRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class ProjectModuleLinkViewer extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new ProjectModuleLinkViewerNotifier(this);
		this.requester = new ProjectModuleLinkViewerRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock format="middleAirBottom" layout="horizontal center" style={{...this.props.style,...display}}>
				<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2098373319" format="bubble" mode="normal" value=" ">
				</UiText>
				<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a681852595" title="" target="self" mode="Link" size="Medium" format="h5" visible={false}>
				</UiAction>
				<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a682087398" format="h5" visible={false} mode="normal">
				</UiText>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(ProjectModuleLinkViewer));
DisplayFactory.register("ProjectModuleLinkViewer", withStyles(styles, { withTheme: true })(withSnackbar(ProjectModuleLinkViewer)));