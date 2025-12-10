import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiBlockConditional from "alexandria-ui-elements/src/displays/components/BlockConditional";
import UiImage from "alexandria-ui-elements/src/displays/components/Image";
import UiHtmlViewer from "alexandria-ui-elements/src/displays/components/HtmlViewer";
import UiBlockResizable from "alexandria-ui-elements/src/displays/components/BlockResizable";
import DisplaysLicenseExpiredBanner from "editor-elements/gen/displays/templates/LicenseExpiredBanner";
import DisplaysLanguageHeaderTemplate from "editor-elements/gen/displays/templates/LanguageHeaderTemplate";
import DisplaysModelsDialog from "editor-elements/gen/displays/templates/ModelsDialog";
import DisplaysModelsTemplate from "editor-elements/gen/displays/templates/ModelsTemplate";
import DisplaysLanguageExplorer from "editor-elements/gen/displays/templates/LanguageExplorer";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import LanguageTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import LanguageTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LanguageTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new LanguageTemplateNotifier(this);
		this.requester = new LanguageTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" width="100.0%" height={this.fixHeight != null ? this.fixHeight("calc(100% - 2px)") : "calc(100% - 2px)"} style={{...this.props.style,...display}}>
				<DisplaysLicenseExpiredBanner context={this._context.bind(this)} owner={this._owner.bind(this)} id="a499079454">
				</DisplaysLicenseExpiredBanner>
				<DisplaysLanguageHeaderTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_344179640" visible={false}>
				</DisplaysLanguageHeaderTemplate>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205" format="whiteBackground" layout="vertical flexible" width="100.0%" height="100.0%">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a911170620" visible={false} layout="vertical flexible centercenter">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a911170620.a_175355286" format="messageBlock" layout="vertical flexible" width="60.0%" height="100.0%" spacing="16">
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a911170620.a_175355286.a_1773276937" layout="vertical">
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a911170620.a_175355286.a_1773276937.a1341868657" format="airTop greyHardColor h2 textCentered" mode="normal" translate={true} value="Not found">
								</UiText>
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a911170620.a_175355286.a_1773276937.a1800376760" format="greyColor h5 textCentered" mode="normal" translate={true} value="Sorry, we can't find the DSL you are visiting">
								</UiText>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a911170620.a_175355286.a_1773276937.a_195732646" layout="horizontal">
									<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a911170620.a_175355286.a_1773276937.a_195732646.a_1732041647" title="home" target="self" mode="Button" size="Medium" format="airTop" highlighted="Outline">
									</UiAction>
								</UiBlock>
							</UiBlock>
						</UiBlock>
					</UiBlock>
					<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a_1653479510" format="whiteBackground" layout="vertical flexible" width="100.0%" height="100.0%" autoSize={true}>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a_1653479510.a883633967" layout="vertical flexible center" width="1024px" height="-1px">
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a_1653479510.a883633967.a_320593134" format="whiteBackground" layout="vertical flexible" width="100.0%" height="100.0%">
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a_1653479510.a883633967.a_320593134.a_1572405240" format="bottomLightBordered middleBottomSpaced middleTopSpaced" layout="horizontal center">
									<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a_1653479510.a883633967.a_320593134.a_1572405240.a863368183" layout="horizontal flexible">
										<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a_1653479510.a883633967.a_320593134.a_1572405240.a863368183.a_1222361280" format="h2" mode="normal">
										</UiText>
									</UiBlock>
									<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a_1653479510.a883633967.a_320593134.a_1572405240.a_1421887113" format="doubleAirRight" layout="horizontal endjustified">
										<UiImage context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a_1653479510.a883633967.a_320593134.a_1572405240.a_1421887113.a1603974785" format="airRight" width="-1px" height="50px" mobileReduceFactor={75} colorInvertedWithDarkMode={true}>
										</UiImage>
									</UiBlock>
								</UiBlock>
								<UiHtmlViewer context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a_1653479510.a883633967.a_320593134.a_1337233881">
								</UiHtmlViewer>
							</UiBlock>
						</UiBlock>
					</UiBlockConditional>
					<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a1093073970" layout="vertical flexible" width="100.0%" height="100.0%">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a1093073970.a_1607183611" format="absolute airTop doubleAirLeft" visible={false} layout="horizontal">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a1093073970.a_1607183611.a24552892" format="greyColor h5 textCentered" mode="normal" translate={true} value="You are not logged in. Please log in to access your models.">
							</UiText>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a1093073970.a_822140838" layout="horizontal flexible">
							<UiBlockResizable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a1093073970.a_822140838.a_1310080320" format="whiteBackground" layout="horizontal flexible" width="100.0%" height="100.0%" minSize={0.0}>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a1093073970.a_822140838.a_1310080320.a1971674436" format="bottomSpaced doubleLeftSpaced doubleRightSpaced topSpaced" layout="vertical flexible" width="55.0%" height="100.0%">
									<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a1093073970.a_822140838.a_1310080320.a1971674436.a_152921974" format="middleAirBottom" layout="vertical">
										<DisplaysModelsDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a1093073970.a_822140838.a_1310080320.a1971674436.a_152921974.a_1915615387">
										</DisplaysModelsDialog>
									</UiBlock>
									<DisplaysModelsTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a1093073970.a_822140838.a_1310080320.a1971674436.a1997295870">
									</DisplaysModelsTemplate>
								</UiBlock>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a1093073970.a_822140838.a_1310080320.a1099653167" layout="vertical flexible" width="45.0%" height="100.0%">
									<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a1093073970.a_822140838.a_1310080320.a1099653167.a_152149809" layout="vertical flexible" width="100.0%" height="100.0%" autoSize={true}>
										<DisplaysLanguageExplorer context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a1093073970.a_822140838.a_1310080320.a1099653167.a_152149809.a445927719">
										</DisplaysLanguageExplorer>
									</UiBlock>
								</UiBlock>
							</UiBlockResizable>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a1093073970.a_822140838.a672117658" format="bordered relative" visible={false} layout="vertical" width="70px" height="-1px">
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a1093073970.a_822140838.a672117658.a_1418543496" format="rightPanelBorder" layout="vertical">
								</UiBlock>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a1093073970.a_822140838.a672117658.a_778481184" format="greyLightBackground headerPanel" layout="horizontal center">
									<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a1093073970.a_822140838.a672117658.a_778481184.a3813340" format="airLeft airRight" layout="horizontal center endjustified flexible">
										<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a1093073970.a_822140838.a672117658.a_778481184.a3813340.a390130326" title="open panel" target="self" mode="MaterialIconButton" icon="ChevronLeft" size="Small" format="airRight">
										</UiAction>
									</UiBlock>
								</UiBlock>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a1093073970.a_822140838.a672117658.a314802301" format="relative" layout="vertical flexible" width="100.0%" height="100.0%">
									<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a1093073970.a_822140838.a672117658.a314802301.a_175297420" layout="vertical flexible" autoSize={true}>
										<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1599842205.a1093073970.a_822140838.a672117658.a314802301.a_175297420.a21277485" title=" " target="self" mode="Link" size="Medium" format="collapsedBlockLink">
										</UiAction>
									</UiBlock>
								</UiBlock>
							</UiBlock>
						</UiBlock>
					</UiBlockConditional>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LanguageTemplate));
DisplayFactory.register("LanguageTemplate", withStyles(styles, { withTheme: true })(withSnackbar(LanguageTemplate)));