import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiTextEditable from "alexandria-ui-elements/src/displays/components/TextEditable";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiMultiple from "alexandria-ui-elements/src/displays/components/Multiple";
import DisplaysCollaboratorItemTemplate from "editor-elements/gen/displays/templates/CollaboratorItemTemplate";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import CollaboratorsTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import CollaboratorsTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class CollaboratorsTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new CollaboratorsTemplateNotifier(this);
		this.requester = new CollaboratorsTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical flexible" style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1979539147" layout="vertical">
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1979539147.a_1551695859" format="h5 middleAirBottom" mode="normal" translate={true} value="Add people">
					</UiText>
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1979539147.a1678744767" format="message middleAirBottom" mode="normal" translate={true} value="Add a list of emails separated by either semicolon or newline">
					</UiText>
					<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1979539147.a_1085528514" mode="normal" editionMode="Raw" rows={8}>
					</UiTextEditable>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1979539147.a_970379295" layout="horizontal">
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1979539147.a_970379295.a_891681320" title="Invite" target="self" mode="Button" readonly={true} size="Medium" format="middleAirTop" highlighted="Fill">
						</UiAction>
					</UiBlock>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a629320035" format="doubleAirTop" layout="vertical">
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a629320035.a_1703508592" format="h5 middleAirBottom" mode="normal" translate={true} value="Owner">
					</UiText>
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a629320035.a_1261552843" mode="normal">
					</UiText>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2131569786" format="doubleAirBottom doubleAirTop" layout="vertical">
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2131569786.a_1827944992" format="h5 middleAirBottom" mode="normal" translate={true} value="Collaborators">
					</UiText>
					<UiMultiple context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2131569786.a1536279384" multiple={{instances:"collaborators",arrangement:"Vertical",noItemsMessage:"No collaborators have been defined for this model yet.",spacing:0,editable:false,wrap:true,collapsed:false,count:{min:0,max:-1}}}>
					</UiMultiple>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(CollaboratorsTemplate));
DisplayFactory.register("CollaboratorsTemplate", withStyles(styles, { withTheme: true })(withSnackbar(CollaboratorsTemplate)));