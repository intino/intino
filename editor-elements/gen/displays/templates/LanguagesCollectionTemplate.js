import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiTextEditable from "alexandria-ui-elements/src/displays/components/TextEditable";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiMagazine from "alexandria-ui-elements/src/displays/components/Magazine";
import DisplaysLanguageCollectionItem from "editor-elements/gen/displays/items/LanguageCollectionItem";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import LanguagesCollectionTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import LanguagesCollectionTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LanguagesCollectionTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new LanguagesCollectionTemplateNotifier(this);
		this.requester = new LanguagesCollectionTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" width="100.0%" height={this.fixHeight != null ? this.fixHeight("100.0%") : "100.0%"} style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_317834146" layout="horizontal center">
					<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_317834146.a1498909117" format="middleAirBottom middleAirTop" visible={false} mode="normal" placeholder="Search...">
					</UiTextEditable>
				</UiBlock>
				<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1985992909" visible={false} mode="normal" value="There are no DSLs assigned to this collection">
				</UiText>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1836078464" layout="vertical flexible" width="100.0%" height="100.0%" autoSize={true}>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1836078464.a925979379" layout="vertical flexible center" width="100.0%" height="100.0%">
						<UiMagazine context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1836078464.a925979379.a_765910644" noItemsMessage="" pageSize={20} itemHeight={10} scrollingMark={true}>
						</UiMagazine>
					</UiBlock>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LanguagesCollectionTemplate));
DisplayFactory.register("LanguagesCollectionTemplate", withStyles(styles, { withTheme: true })(withSnackbar(LanguagesCollectionTemplate)));