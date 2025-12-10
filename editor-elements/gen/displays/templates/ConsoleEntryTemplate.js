import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiMaterialIcon from "alexandria-ui-elements/src/displays/components/MaterialIcon";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import ConsoleEntryTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import ConsoleEntryTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class ConsoleEntryTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new ConsoleEntryTemplateNotifier(this);
		this.requester = new ConsoleEntryTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock format="middleAirBottom" layout="horizontal center" style={{...this.props.style,...display}}>
				<UiMaterialIcon context={this._context.bind(this)} owner={this._owner.bind(this)} id="a487808082" format="airRight blueColor smallIconSize" visible={false} icon="Info">
				</UiMaterialIcon>
				<UiMaterialIcon context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2027150262" format="airRight orangeColor smallIconSize" visible={false} icon="Warning">
				</UiMaterialIcon>
				<UiMaterialIcon context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1355526646" format="airRight redColor smallIconSize" visible={false} icon="Error">
				</UiMaterialIcon>
				<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2047082759" title="" target="self" mode="Link" size="Medium" format="airRight">
				</UiAction>
				<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2083721792" format="airRight" mode="normal">
				</UiText>
				<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2086504178" mode="normal">
				</UiText>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(ConsoleEntryTemplate));
DisplayFactory.register("ConsoleEntryTemplate", withStyles(styles, { withTheme: true })(withSnackbar(ConsoleEntryTemplate)));