import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiSelectorComboBox from "alexandria-ui-elements/src/displays/components/SelectorComboBox";
import UiOpenSite from "alexandria-ui-elements/src/displays/components/OpenSite";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiBlockConditional from "alexandria-ui-elements/src/displays/components/BlockConditional";
import UiTextCode from "alexandria-ui-elements/src/displays/components/TextCode";
import UiCopyToClipboard from "alexandria-ui-elements/src/displays/components/CopyToClipboard";
import UiHtmlViewer from "alexandria-ui-elements/src/displays/components/HtmlViewer";
import DisplaysModelsDialog from "editor-elements/gen/displays/templates/ModelsDialog";
import DisplaysModelsTemplate from "editor-elements/gen/displays/templates/ModelsTemplate";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import LanguageExplorerNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import LanguageExplorerRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LanguageExplorer extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new LanguageExplorerNotifier(this);
		this.requester = new LanguageExplorerRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock format="minWidth" layout="vertical flexible" width="100.0%" height={this.fixHeight != null ? this.fixHeight("100.0%") : "100.0%"} style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a881177172" format="greyLightBackground headerPanel" layout="horizontal center wrap">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a881177172.a_1698645225" format="airLeft minTitleEditorWidth" layout="horizontal center flexible">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a881177172.a_1698645225.a797520779" format="airLeft" visible={false} layout="vertical flexible">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a881177172.a_1698645225.a797520779.a_464935772" format="h5 minHeaderWidth" mode="normal">
							</UiText>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a881177172.a_1698645225.a_1663141012" format="airLeft airRight" visible={false} layout="horizontal flexible">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a881177172.a_1698645225.a_1663141012.a_943606089" format="h5 minHeaderWidth smallAirRight" mode="normal">
							</UiText>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a881177172.a_1698645225.a_1663141012.a486232474" layout="horizontal endjustified" width="120px" height="-1px">
								<UiSelectorComboBox context={this._context.bind(this)} owner={this._owner.bind(this)} id="a881177172.a_1698645225.a_1663141012.a486232474.a1945197094" format="h5" multipleSelection={false} maxMenuHeight={300} view="TextView">
								</UiSelectorComboBox>
							</UiBlock>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a881177172.a_1698645225.a452480678" layout="horizontal endjustified">
							<DisplaysModelsDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a881177172.a_1698645225.a452480678.a_1340704239" visible={false}>
							</DisplaysModelsDialog>
							<UiOpenSite context={this._context.bind(this)} owner={this._owner.bind(this)} id="a881177172.a_1698645225.a452480678.a_1206509343" title="" target="blank" mode="IconButton" size="Medium" visible={false}>
							</UiOpenSite>
						</UiBlock>
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a881177172.a_1698645225.a1324384871" title="close panel" target="self" mode="MaterialIconButton" icon="ChevronRight" size="Small" format="doubleAirRight">
						</UiAction>
					</UiBlock>
				</UiBlock>
				<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1939755721" layout="vertical flexible" width="100.0%" height="100.0%">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1939755721.a141338082" format="doubleBottomSpaced doubleLeftSpaced doubleRightSpaced doubleTopSpaced" layout="vertical flexible" width="100.0%" height="100.0%" autoSize={true}>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1939755721.a141338082.a_1267273914" format="doubleAirBottom" layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1939755721.a141338082.a_1267273914.a684932041" format="bold h6" mode="normal" value="title">
							</UiText>
							<UiTextCode context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1939755721.a141338082.a_1267273914.a_237838012" format="noHtmlStyle" mode="normal" language="Html" value="">
							</UiTextCode>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1939755721.a141338082.a101089892" format="doubleAirBottom" layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1939755721.a141338082.a101089892.a1472766582" format="bold h6" mode="normal" value="what is it">
							</UiText>
							<UiTextCode context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1939755721.a141338082.a101089892.a_111641904" format="noHtmlStyle" mode="normal" language="Html" value="">
							</UiTextCode>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1939755721.a141338082.a_461103848" format="doubleAirBottom" layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1939755721.a141338082.a_461103848.a1172020715" format="bold h6" mode="normal" value="how to cite">
							</UiText>
							<UiTextCode context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1939755721.a141338082.a_461103848.a_424132970" format="noHtmlStyle" mode="normal" language="Html" value="">
							</UiTextCode>
							<UiCopyToClipboard context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1939755721.a141338082.a_461103848.a1020209072" title="Copy cite" target="self" mode="Link" size="Medium" format="middleAirTop" visible={false}>
							</UiCopyToClipboard>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1939755721.a141338082.a1793963127" format="doubleAirBottom" layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1939755721.a141338082.a1793963127.a1957665791" format="bold h6" mode="normal" value="copyright and license">
							</UiText>
							<UiTextCode context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1939755721.a141338082.a1793963127.a1898255918" format="noHtmlStyle" mode="normal" language="Html" value="">
							</UiTextCode>
						</UiBlock>
					</UiBlock>
				</UiBlockConditional>
				<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1973980233" layout="vertical flexible" width="100.0%" height="100.0%">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1973980233.a188002922" layout="vertical" width="100.0%" height="100.0%" autoSize={true}>
						<UiHtmlViewer context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1973980233.a188002922.a69235068">
						</UiHtmlViewer>
					</UiBlock>
				</UiBlockConditional>
				<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1906357413" layout="vertical flexible" width="100.0%" height="100.0%">
					<DisplaysModelsTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1906357413.a37396246">
					</DisplaysModelsTemplate>
				</UiBlockConditional>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LanguageExplorer));
DisplayFactory.register("LanguageExplorer", withStyles(styles, { withTheme: true })(withSnackbar(LanguageExplorer)));