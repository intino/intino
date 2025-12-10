import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiMultiple from "alexandria-ui-elements/src/displays/components/Multiple";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import DisplaysLanguageToolParameter from "editor-elements/gen/displays/templates/LanguageToolParameter";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import LanguageToolTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import LanguageToolTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LanguageToolTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new LanguageToolTemplateNotifier(this);
		this.requester = new LanguageToolTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" style={{...this.props.style,...display}}>
				<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1872945281" format="bold" mode="normal">
				</UiText>
				<UiMultiple context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1507567776" multiple={{instances:"parameters",arrangement:"Vertical",noItemsMessage:"No parameters",spacing:0,editable:false,wrap:true,collapsed:false,count:{min:0,max:-1}}}>
				</UiMultiple>
				<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_867971052" title="[remove]" target="self" mode="Link" affirmed="Confirm that you want to delete the tool" size="Medium">
				</UiAction>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LanguageToolTemplate));
DisplayFactory.register("LanguageToolTemplate", withStyles(styles, { withTheme: true })(withSnackbar(LanguageToolTemplate)));