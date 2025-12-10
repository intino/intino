import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiItem from "alexandria-ui-elements/src/displays/components/Item";
import CollaboratorSelectorItemNotifier from "alexandria-ui-elements/gen/displays/notifiers/ItemNotifier";
import CollaboratorSelectorItemRequester from "alexandria-ui-elements/gen/displays/requesters/ItemRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class CollaboratorSelectorItem extends UiItem {

	constructor(props) {
		super(props);
		this.notifier = new CollaboratorSelectorItemNotifier(this);
		this.requester = new CollaboratorSelectorItemRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<div style={{width:"100%",height:"100%",...this.props.style,...this.style(),...display}} className={className}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_887790069" layout="vertical">
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_887790069.a2087500865" mode="normal">
					</UiText>
				</UiBlock>
			</div>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(CollaboratorSelectorItem));
DisplayFactory.register("CollaboratorSelectorItem", withStyles(styles, { withTheme: true })(withSnackbar(CollaboratorSelectorItem)));