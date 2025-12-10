import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiBlockConditional from "alexandria-ui-elements/src/displays/components/BlockConditional";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiOpenPopover from "alexandria-ui-elements/src/displays/components/OpenPopover";
import UiBlockPopover from "alexandria-ui-elements/src/displays/components/BlockPopover";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import DisplaysProjectViewer from "editor-elements/gen/displays/templates/ProjectViewer";
import DisplaysProjectModuleViewer from "editor-elements/gen/displays/templates/ProjectModuleViewer";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import ModelTitleViewerNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import ModelTitleViewerRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class ModelTitleViewer extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new ModelTitleViewerNotifier(this);
		this.requester = new ModelTitleViewerRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="horizontal center" style={{...this.props.style,...display}}>
				<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_756721466" layout="vertical">
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_756721466.a172339615" format="modelViewTitle upperCase" mode="normal">
					</UiText>
				</UiBlockConditional>
				<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a366836242" layout="horizontal center">
					<UiOpenPopover context={this._context.bind(this)} owner={this._owner.bind(this)} id="a366836242.a1823685100" title="" target="self" mode="Link" size="Medium" format="airRight modelViewTitle upperCase" triggerEvent="MouseClick">
					</UiOpenPopover>
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a366836242.a1506349723" format="airRight modelViewTitleSeparator upperCase" mode="normal" value=":">
					</UiText>
					<UiOpenPopover context={this._context.bind(this)} owner={this._owner.bind(this)} id="a366836242.a108400953" title="" target="self" mode="Link" size="Medium" format="modelViewTitle upperCase" triggerEvent="MouseClick">
					</UiOpenPopover>
				</UiBlockConditional>
				<UiBlockPopover context={this._context.bind(this)} owner={this._owner.bind(this)} id="a295006419" format="popoverStyle" layout="vertical" position="BottomCenter">
					<DisplaysProjectViewer context={this._context.bind(this)} owner={this._owner.bind(this)} id="a295006419.a_1063794657">
					</DisplaysProjectViewer>
				</UiBlockPopover>
				<UiBlockPopover context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_964658750" format="popoverStyle" layout="vertical" position="BottomCenter">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_964658750.a595489329" format="middleAirBottom middleAirTop" layout="vertical">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_964658750.a595489329.a196747685" format="h5" mode="normal">
						</UiText>
					</UiBlock>
					<DisplaysProjectModuleViewer context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_964658750.a_1697734917">
					</DisplaysProjectModuleViewer>
				</UiBlockPopover>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(ModelTitleViewer));
DisplayFactory.register("ModelTitleViewer", withStyles(styles, { withTheme: true })(withSnackbar(ModelTitleViewer)));