import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import LanguageToolParameterNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import LanguageToolParameterRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LanguageToolParameter extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new LanguageToolParameterNotifier(this);
		this.requester = new LanguageToolParameterRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="horizontal" style={{...this.props.style,...display}}>
				<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a356601392" format="airRight grey" mode="normal">
				</UiText>
				<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1822870932" mode="normal">
				</UiText>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LanguageToolParameter));
DisplayFactory.register("LanguageToolParameter", withStyles(styles, { withTheme: true })(withSnackbar(LanguageToolParameter)));