import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiMultiple from "alexandria-ui-elements/src/displays/components/Multiple";
import DisplaysConsoleEntryTemplate from "editor-elements/gen/displays/templates/ConsoleEntryTemplate";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import ConsoleTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import ConsoleTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class ConsoleTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new ConsoleTemplateNotifier(this);
		this.requester = new ConsoleTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock format="consoleStyle" layout="vertical flexible" style={{...this.props.style,...display}}>
				<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_859332803" title="Close" target="self" mode="MaterialIconButton" icon="Clear" size="Small" format="closeIcon">
				</UiAction>
				<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2075064212" format="airLeft h6 middleAirTop" mode="normal" translate={true} value="Build output">
				</UiText>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a658027216" format="airLeft airRight airTop middleAirBottom" layout="vertical flexible">
					<UiMultiple context={this._context.bind(this)} owner={this._owner.bind(this)} id="a658027216.a341155460" multiple={{instances:"entries",arrangement:"Vertical",noItemsMessage:"No messages",spacing:0,editable:false,wrap:true,collapsed:false,count:{min:0,max:-1}}}>
					</UiMultiple>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(ConsoleTemplate));
DisplayFactory.register("ConsoleTemplate", withStyles(styles, { withTheme: true })(withSnackbar(ConsoleTemplate)));