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
import ModelNameViewerNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import ModelNameViewerRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class ModelNameViewer extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new ModelNameViewerNotifier(this);
		this.requester = new ModelNameViewerRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="horizontal center" style={{...this.props.style,...display}}>
				<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1385223880" layout="vertical">
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1385223880.a280892136" format="modelViewTitle upperCase" mode="normal">
					</UiText>
				</UiBlockConditional>
				<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a960856190" layout="horizontal center">
					<UiOpenPopover context={this._context.bind(this)} owner={this._owner.bind(this)} id="a960856190.a_812379048" title="" target="self" mode="Link" size="Medium" format="airRight modelViewTitle upperCase" triggerEvent="MouseClick">
					</UiOpenPopover>
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a960856190.a895276551" format="airRight modelViewTitleSeparator upperCase" mode="normal" value=":">
					</UiText>
					<UiOpenPopover context={this._context.bind(this)} owner={this._owner.bind(this)} id="a960856190.a_669370035" title="" target="self" mode="Link" size="Medium" format="modelViewTitle upperCase" triggerEvent="MouseClick">
					</UiOpenPopover>
				</UiBlockConditional>
				<UiBlockPopover context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1650971628" format="popoverStyle" layout="vertical" position="BottomCenter">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1650971628.a639110100" format="bottomBordered middleSpaced" layout="vertical">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1650971628.a639110100.a_324255207" format="bold h5" mode="uppercase">
						</UiText>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1650971628.a_1506200558" format="middleLeftSpaced middleRightSpaced smallAirTop" layout="vertical">
						<DisplaysProjectViewer context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1650971628.a_1506200558.a988377374">
						</DisplaysProjectViewer>
					</UiBlock>
				</UiBlockPopover>
				<UiBlockPopover context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1018744713" format="popoverStyle" layout="vertical" position="BottomCenter">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1018744713.a_308444104" format="bottomBordered middleSpaced" layout="vertical">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1018744713.a_308444104.a_2057404802" format="bold h5" mode="uppercase">
						</UiText>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1018744713.a_815609810" format="middleLeftSpaced middleRightSpaced smallAirTop" layout="vertical">
						<DisplaysProjectModuleViewer context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1018744713.a_815609810.a1848385551">
						</DisplaysProjectModuleViewer>
					</UiBlock>
				</UiBlockPopover>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(ModelNameViewer));
DisplayFactory.register("ModelNameViewer", withStyles(styles, { withTheme: true })(withSnackbar(ModelNameViewer)));