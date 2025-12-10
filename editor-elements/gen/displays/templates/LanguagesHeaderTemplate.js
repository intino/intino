import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import LanguagesHeaderTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import LanguagesHeaderTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LanguagesHeaderTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new LanguagesHeaderTemplateNotifier(this);
		this.requester = new LanguagesHeaderTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock format="subHeaderStyle" layout="horizontal center" style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2130275280" layout="horizontal flexible">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2130275280.a1429423661" layout="horizontal" width="100.0%" height="100.0%">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2130275280.a1429423661.a_1070772714" format="bold doubleAirRight" visible={false} mode="normal" value="public languages">
						</UiText>
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2130275280.a1429423661.a_1071007517" title="public languages" target="self" mode="Link" size="Medium" format="doubleAirRight" visible={false}>
						</UiAction>
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2130275280.a1429423661.a_2108343501" format="bold" visible={false} mode="normal" value="my languages">
						</UiText>
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2130275280.a1429423661.a_2108578304" title="my languages" target="self" mode="Link" size="Medium" visible={false}>
						</UiAction>
					</UiBlock>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a670892230" layout="horizontal endjustified">
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LanguagesHeaderTemplate));
DisplayFactory.register("LanguagesHeaderTemplate", withStyles(styles, { withTheme: true })(withSnackbar(LanguagesHeaderTemplate)));