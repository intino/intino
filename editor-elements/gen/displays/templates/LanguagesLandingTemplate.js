import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiTextEditable from "alexandria-ui-elements/src/displays/components/TextEditable";
import UiList from "alexandria-ui-elements/src/displays/components/List";
import DisplaysLanguageLandingItem from "editor-elements/gen/displays/items/LanguageLandingItem";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import LanguagesLandingTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import LanguagesLandingTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LanguagesLandingTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new LanguagesLandingTemplateNotifier(this);
		this.requester = new LanguagesLandingTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" width="100.0%" height={this.fixHeight != null ? this.fixHeight("100.0%") : "100.0%"} style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_40134722" layout="horizontal center">
					<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_40134722.a_1198134915" format="airBottom airTop doubleAirLeft doubleAirRight" visible={false} mode="normal" placeholder="Search...">
					</UiTextEditable>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_110233151" layout="vertical flexible" width="100.0%" height="100.0%" autoSize={true}>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_110233151.a865834322" layout="vertical flexible center" width="100.0%" height="100.0%">
						<UiList context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_110233151.a865834322.a337879824" noItemsMessage="" pageSize={5} itemHeight={100} scrollingMark={true} navigable="Bottom">
						</UiList>
					</UiBlock>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LanguagesLandingTemplate));
DisplayFactory.register("LanguagesLandingTemplate", withStyles(styles, { withTheme: true })(withSnackbar(LanguagesLandingTemplate)));