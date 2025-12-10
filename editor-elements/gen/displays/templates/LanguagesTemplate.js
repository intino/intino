import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiTextEditable from "alexandria-ui-elements/src/displays/components/TextEditable";
import UiList from "alexandria-ui-elements/src/displays/components/List";
import DisplaysLanguageItem from "editor-elements/gen/displays/items/LanguageItem";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import LanguagesTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import LanguagesTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LanguagesTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new LanguagesTemplateNotifier(this);
		this.requester = new LanguagesTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" width="100.0%" height={this.fixHeight != null ? this.fixHeight("100.0%") : "100.0%"} style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a764657471" layout="horizontal center">
					<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a764657471.a399788349" format="airBottom airTop doubleAirLeft doubleAirRight" visible={false} mode="normal" placeholder="Search...">
					</UiTextEditable>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1408965054" layout="vertical flexible" width="100.0%" height="100.0%" autoSize={true}>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1408965054.a728154737" layout="vertical flexible center" width="100.0%" height="100.0%">
						<UiList context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1408965054.a728154737.a_1380414580" noItemsMessage="" pageSize={20} itemHeight={100} scrollingMark={true}>
						</UiList>
					</UiBlock>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LanguagesTemplate));
DisplayFactory.register("LanguagesTemplate", withStyles(styles, { withTheme: true })(withSnackbar(LanguagesTemplate)));