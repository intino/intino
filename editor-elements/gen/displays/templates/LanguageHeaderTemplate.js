import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import DisplaysLanguageToolbar from "editor-elements/gen/displays/templates/LanguageToolbar";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import LanguageHeaderTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import LanguageHeaderTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LanguageHeaderTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new LanguageHeaderTemplateNotifier(this);
		this.requester = new LanguageHeaderTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock format="subHeaderStyle" layout="horizontal center" style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1380233206" layout="horizontal flexible">
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1380233206.a2100539264" format="airLeft bold h5" visible={false} mode="normal">
					</UiText>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1559625853" layout="horizontal center endjustified">
					<DisplaysLanguageToolbar context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1559625853.a_603468846">
					</DisplaysLanguageToolbar>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LanguageHeaderTemplate));
DisplayFactory.register("LanguageHeaderTemplate", withStyles(styles, { withTheme: true })(withSnackbar(LanguageHeaderTemplate)));