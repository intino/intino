import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import DisplaysLanguageEditor from "editor-elements/gen/displays/templates/LanguageEditor";
import DisplaysLanguagePropertiesTemplate from "editor-elements/gen/displays/templates/LanguagePropertiesTemplate";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import LanguageInfoTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import LanguageInfoTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LanguageInfoTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new LanguageInfoTemplateNotifier(this);
		this.requester = new LanguageInfoTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical flexible" style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_259754080" layout="vertical center" autoSize={true}>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_259754080.a1846327708" format="doubleTopSpaced" layout="vertical flexible" width="95.0%" height="100.0%">
						<DisplaysLanguageEditor context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_259754080.a1846327708.a1655446579">
						</DisplaysLanguageEditor>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_259754080.a1846327708.a2003163030" format="doubleAirBottom" layout="vertical">
							<DisplaysLanguagePropertiesTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_259754080.a1846327708.a2003163030.a446704627">
							</DisplaysLanguagePropertiesTemplate>
						</UiBlock>
					</UiBlock>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LanguageInfoTemplate));
DisplayFactory.register("LanguageInfoTemplate", withStyles(styles, { withTheme: true })(withSnackbar(LanguageInfoTemplate)));