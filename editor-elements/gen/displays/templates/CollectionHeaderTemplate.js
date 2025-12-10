import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import CollectionHeaderTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import CollectionHeaderTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class CollectionHeaderTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new CollectionHeaderTemplateNotifier(this);
		this.requester = new CollectionHeaderTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock format="subHeaderStyle" layout="horizontal center" style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_93198058" layout="horizontal flexible">
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_93198058.a_1855166795" format="airLeft bold h5" mode="normal">
					</UiText>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_93198058.a2108383131" visible={false} layout="horizontal">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_93198058.a2108383131.a_125863669" format="greyColor h5 textCentered" mode="normal" translate={true} value="You are not logged in. Please log in to access your models.">
						</UiText>
					</UiBlock>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a848803139" layout="horizontal center endjustified">
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(CollectionHeaderTemplate));
DisplayFactory.register("CollectionHeaderTemplate", withStyles(styles, { withTheme: true })(withSnackbar(CollectionHeaderTemplate)));