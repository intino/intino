import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import ReleaseSelectorOptionNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import ReleaseSelectorOptionRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class ReleaseSelectorOption extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new ReleaseSelectorOptionNotifier(this);
		this.requester = new ReleaseSelectorOptionRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="horizontal" style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1844029225" format="relative" layout="vertical flexible" isHoverContainer="true">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1844029225.a1384464365" layout="vertical flexible">
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1844029225.a1384464365.a_684125858" title="" target="self" mode="Link" size="Medium" format="versionSelectorLink">
						</UiAction>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1844029225.a_1154797774" format="releaseRemoveLinkBlock" layout="vertical" hidden="IfNotHover">
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1844029225.a_1154797774.a_748893091" title="remove" target="self" mode="Link" signed={{mode:"SimpleText",text:"To confirm deletion, please type the version of the release.",reason:""}} size="Medium" format="releaseRemoveLink">
						</UiAction>
					</UiBlock>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(ReleaseSelectorOption));
DisplayFactory.register("ReleaseSelectorOption", withStyles(styles, { withTheme: true })(withSnackbar(ReleaseSelectorOption)));