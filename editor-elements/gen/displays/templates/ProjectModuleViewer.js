import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiMultiple from "alexandria-ui-elements/src/displays/components/Multiple";
import DisplaysProjectModuleEntryViewer from "editor-elements/gen/displays/templates/ProjectModuleEntryViewer";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import ProjectModuleViewerNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import ProjectModuleViewerRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class ProjectModuleViewer extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new ProjectModuleViewerNotifier(this);
		this.requester = new ProjectModuleViewerRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock format="airBottom" layout="vertical" style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_825484004" visible={false} layout="horizontal center">
					<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_825484004.a1114534442" title="Back" target="self" mode="MaterialIconButton" icon="ChevronLeft" size="Small" visible={false}>
					</UiAction>
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_825484004.a1037807130" format="h5" mode="normal">
					</UiText>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a526219300" layout="vertical">
					<UiMultiple context={this._context.bind(this)} owner={this._owner.bind(this)} id="a526219300.a_1917370507" multiple={{instances:"entries",arrangement:"Vertical",noItemsMessage:"no models",spacing:0,editable:false,wrap:true,collapsed:false,count:{min:0,max:-1}}}>
					</UiMultiple>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(ProjectModuleViewer));
DisplayFactory.register("ProjectModuleViewer", withStyles(styles, { withTheme: true })(withSnackbar(ProjectModuleViewer)));