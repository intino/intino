import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import DisplaysLanguageEditor from "editor-elements/gen/displays/templates/LanguageEditor";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import CreateLanguageEditorNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import CreateLanguageEditorRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class CreateLanguageEditor extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new CreateLanguageEditorNotifier(this);
		this.requester = new CreateLanguageEditorRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1083498850" format="bordered doubleSpaced whiteBackground" layout="vertical">
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1083498850.a_142095738" format="h4" mode="normal">
					</UiText>
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1083498850.a_2104817548" format="description doubleAirBottom" mode="normal" value="You are about to create a new DSL associated with %s. To ensure uniqueness and proper organization, please provide the following details.">
					</UiText>
					<DisplaysLanguageEditor context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1083498850.a_2059687548">
					</DisplaysLanguageEditor>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a989372735" format="airTop" layout="horizontal endjustified">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a989372735.a_959429392" layout="horizontal endjustified">
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a989372735.a_959429392.a1920232211" title="Create" target="self" mode="Button" readonly={true} size="Medium" highlighted="Fill">
						</UiAction>
					</UiBlock>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(CreateLanguageEditor));
DisplayFactory.register("CreateLanguageEditor", withStyles(styles, { withTheme: true })(withSnackbar(CreateLanguageEditor)));