import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import CollaboratorItemTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import CollaboratorItemTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class CollaboratorItemTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new CollaboratorItemTemplateNotifier(this);
		this.requester = new CollaboratorItemTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1997166487" format="item" layout="vertical" isHoverContainer="true">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1997166487.a700444431" layout="horizontal center">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1997166487.a700444431.a1878491609" format="doubleAirRight" mode="normal">
						</UiText>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1997166487.a700444431.a_441376595" format="bringToFront doubleAirLeft" layout="horizontal center" hidden="IfNotHover">
							<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1997166487.a700444431.a_441376595.a_1969025563" title="remove access" target="self" mode="Link" size="Medium" format="blueColor upperCase">
							</UiAction>
						</UiBlock>
					</UiBlock>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(CollaboratorItemTemplate));
DisplayFactory.register("CollaboratorItemTemplate", withStyles(styles, { withTheme: true })(withSnackbar(CollaboratorItemTemplate)));