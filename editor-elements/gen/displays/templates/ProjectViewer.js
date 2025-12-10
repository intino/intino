import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiMultiple from "alexandria-ui-elements/src/displays/components/Multiple";
import UiTextEditable from "alexandria-ui-elements/src/displays/components/TextEditable";
import DisplaysProjectModuleLinkViewer from "editor-elements/gen/displays/templates/ProjectModuleLinkViewer";
import DisplaysProjectModuleViewer from "editor-elements/gen/displays/templates/ProjectModuleViewer";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import ProjectViewerNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import ProjectViewerRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class ProjectViewer extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new ProjectViewerNotifier(this);
		this.requester = new ProjectViewerRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_831182765" layout="vertical flexible">
					<UiMultiple context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_831182765.a421038872" multiple={{instances:"modules",arrangement:"Vertical",noItemsMessage:"no modules",spacing:0,editable:false,wrap:true,collapsed:false,count:{min:0,max:-1}}}>
					</UiMultiple>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_831182765.a_874729961" visible={false} layout="vertical">
						<DisplaysProjectModuleViewer context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_831182765.a_874729961.a1548033309">
						</DisplaysProjectModuleViewer>
					</UiBlock>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_860411950" format="middleAirBottom" layout="vertical">
					<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_860411950.a1663156837" mode="uppercase" placeholder="NEW MODULE">
					</UiTextEditable>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(ProjectViewer));
DisplayFactory.register("ProjectViewer", withStyles(styles, { withTheme: true })(withSnackbar(ProjectViewer)));