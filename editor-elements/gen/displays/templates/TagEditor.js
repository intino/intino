import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import TagEditorNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import TagEditorRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class TagEditor extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new TagEditorNotifier(this);
		this.requester = new TagEditorRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock format="tag" layout="horizontal center" style={{...this.props.style,...display}}>
				<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1183066584" format="smallAirRight" mode="normal">
				</UiText>
				<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_49030750" title="Delete" target="self" mode="MaterialIconButton" icon="Clear" size="Small" format="smallIconSize">
				</UiAction>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(TagEditor));
DisplayFactory.register("TagEditor", withStyles(styles, { withTheme: true })(withSnackbar(TagEditor)));