import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiImage from "alexandria-ui-elements/src/displays/components/Image";
import UiOpenDialog from "alexandria-ui-elements/src/displays/components/OpenDialog";
import UiDialog from "alexandria-ui-elements/src/displays/components/Dialog";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiImageEditable from "alexandria-ui-elements/src/displays/components/ImageEditable";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiDivider from "alexandria-ui-elements/src/displays/components/Divider";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import LanguageLogoDialogNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import LanguageLogoDialogRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LanguageLogoDialog extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new LanguageLogoDialogNotifier(this);
		this.requester = new LanguageLogoDialogRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="horizontal center" style={{...this.props.style,...display}}>
				<UiImage context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1595288096" format="airRight forgeLogoStyle" width="-1px" height="50px" colorInvertedWithDarkMode={true}>
				</UiImage>
				<UiOpenDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2145210607" title="change" target="self" mode="Link" readonly={true} size="Medium">
				</UiOpenDialog>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_3288003" title="Change logo" width="800px" height="500px">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_3288003.a_239413983" format="overflowAuto" layout="vertical" width="100.0%" height="calc(100% - 40px)">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_3288003.a_239413983.a843814184" format="airBottom airLeft" layout="horizontal centercenter">
							<UiImage context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_3288003.a_239413983.a843814184.a_277712048" format="airRight forgeLogoStyle" width="-1px" height="50px" colorInvertedWithDarkMode={true}>
							</UiImage>
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_3288003.a_239413983.a843814184.a1373896832" mode="normal">
							</UiText>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_3288003.a_239413983.a1715294507" format="doubleAirTop" layout="horizontal">
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_3288003.a_239413983.a1715294507.a1411580691" format="rightBordered" layout="vertical centercenter" width="50.0%" height="100.0%">
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_3288003.a_239413983.a1715294507.a1411580691.a_1942023846" layout="vertical" width="-1px" height="165px">
									<UiImageEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_3288003.a_239413983.a1715294507.a1411580691.a_1942023846.a1138935811" format="forgeLogoStyle" width="-1px" height="150px" colorInvertedWithDarkMode={true}>
									</UiImageEditable>
								</UiBlock>
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_3288003.a_239413983.a1715294507.a1411580691.a_1225385288" mode="normal" translate={true} value="Upload an image in PNG format">
								</UiText>
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_3288003.a_239413983.a1715294507.a1411580691.a_1492590464" mode="normal" translate={true} value="Transparent background">
								</UiText>
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_3288003.a_239413983.a1715294507.a1411580691.a_441883014" mode="normal" translate={true} value="Black foreground elements only">
								</UiText>
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_3288003.a_239413983.a1715294507.a1411580691.a_68361060" mode="normal" translate={true} value="Recommended size: 100x100 pixels">
								</UiText>
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_3288003.a_239413983.a1715294507.a1411580691.a_138088489" mode="normal" translate={true} value="Square and centered for best display">
								</UiText>
							</UiBlock>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_3288003.a_239413983.a1715294507.a547155001" format="doubleLeftSpaced doubleRightSpaced" layout="vertical centercenter" width="50.0%" height="100.0%">
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_3288003.a_239413983.a1715294507.a547155001.a_758220971" layout="vertical" width="-1px" height="98px">
									<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_3288003.a_239413983.a1715294507.a547155001.a_758220971.a143403290" title="generate" target="self" mode="Button" size="Medium" format="blockGenerateLogoAction">
									</UiAction>
								</UiBlock>
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_3288003.a_239413983.a1715294507.a547155001.a_910880291" format="airTop" mode="normal" translate={true} value="Automatically create an icon matching the DSL name and domain style">
								</UiText>
							</UiBlock>
						</UiBlock>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_3288003.a_513504583">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_3288003.a1194868975" layout="horizontal endjustified">
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_3288003.a1194868975.a1278328173" title="Cancel" target="self" mode="Button" size="Small" format="airRight">
						</UiAction>
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_3288003.a1194868975.a1552750499" title="Change" target="self" mode="Button" size="Small" highlighted="Fill">
						</UiAction>
					</UiBlock>
				</UiDialog>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LanguageLogoDialog));
DisplayFactory.register("LanguageLogoDialog", withStyles(styles, { withTheme: true })(withSnackbar(LanguageLogoDialog)));