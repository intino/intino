import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiDisplayStamp from "alexandria-ui-elements/src/displays/components/DisplayStamp";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiOpenSite from "alexandria-ui-elements/src/displays/components/OpenSite";
import UiImage from "alexandria-ui-elements/src/displays/components/Image";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiSelectorListBox from "alexandria-ui-elements/src/displays/components/SelectorListBox";
import UiTextEditable from "alexandria-ui-elements/src/displays/components/TextEditable";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import DisplaysGoogleLoginDisplay from "editor-elements/src/displays/GoogleLoginDisplay";
import DisplaysLoginSelectorOption from "editor-elements/gen/displays/templates/LoginSelectorOption";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import LoginTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import LoginTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LoginTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new LoginTemplateNotifier(this);
		this.requester = new LoginTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock format="radialBackground" layout="vertical flexible" width="100.0%" height={this.fixHeight != null ? this.fixHeight("100.0%") : "100.0%"} style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1326125118" format="centered" layout="vertical centercenter" width="80.0%" height="100.0%">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1326125118.a_412554648" format="relative" layout="horizontal">
						<UiOpenSite context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1326125118.a_412554648.a_1033474397" title="" target="self" mode="Link" size="Medium" format="fullSpaceLink">
						</UiOpenSite>
						<UiImage context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1326125118.a_412554648.a_930008141" format="airLeft airRight doubleAirBottom" width="180px" height="41px" mobileReduceFactor={75}>
						</UiImage>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1326125118.a225345469" layout="vertical">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1326125118.a225345469.a2002394291" layout="vertical center" width="400px" height="-1px">
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1326125118.a225345469.a2002394291.a_1384647550" format="doubleAirBottom googleLoginBlockStyle" visible={false} layout="vertical">
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1326125118.a225345469.a2002394291.a_1384647550.a1859373642" layout="vertical center">
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1326125118.a225345469.a2002394291.a_1384647550.a1859373642.a1209638476" format="bold h6" mode="normal" translate={true} value="Login using Google">
									</UiText>
									<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1326125118.a225345469.a2002394291.a_1384647550.a1859373642.a_1469568148" format="spaced" layout="vertical">
										<UiDisplayStamp context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1326125118.a225345469.a2002394291.a_1384647550.a1859373642.a_1469568148.a_2109093392">
										</UiDisplayStamp>
									</UiBlock>
								</UiBlock>
							</UiBlock>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1326125118.a225345469.a2002394291.a_1705372406" visible={false} layout="vertical center" width="100.0%" height="100.0%">
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1326125118.a225345469.a2002394291.a_1705372406.a1836679909" layout="vertical flexible center" width="100.0%" height="100.0%">
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1326125118.a225345469.a2002394291.a_1705372406.a1836679909.a_970287243" format="airBottom blackColor bold h6" mode="normal" translate={true} value="Login using...">
									</UiText>
									<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1326125118.a225345469.a2002394291.a_1705372406.a1836679909.a_629917028" format="localLoginBlockStyle" layout="vertical">
										<UiSelectorListBox context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1326125118.a225345469.a2002394291.a_1705372406.a1836679909.a_629917028.a_1197109944" format="userSelectorStyle" multipleSelection={false}>
										</UiSelectorListBox>
										<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1326125118.a225345469.a2002394291.a_1705372406.a1836679909.a_629917028.a_1587448645" format="airLeft airRight doubleAirBottom" layout="vertical">
											<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1326125118.a225345469.a2002394291.a_1705372406.a1836679909.a_629917028.a_1587448645.a_1909018807" mode="normal" placeholder="new username...">
											</UiTextEditable>
										</UiBlock>
										<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1326125118.a225345469.a2002394291.a_1705372406.a1836679909.a_629917028.a1505187492" format="airBottom fullWidth h6 redColor textCentered" visible={false} mode="normal" translate={true} value="User not found">
										</UiText>
									</UiBlock>
								</UiBlock>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1326125118.a225345469.a2002394291.a_1705372406.a1374342759" format="doubleAirTop" layout="horizontal">
									<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1326125118.a225345469.a2002394291.a_1705372406.a1374342759.a1446087791" title="Enter" target="self" mode="Button" size="Medium" format="whiteButton" highlighted="Fill">
									</UiAction>
								</UiBlock>
							</UiBlock>
						</UiBlock>
					</UiBlock>
				</UiBlock>
				<DisplaysLoginSelectorOption context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1447221227" visible={false}>
				</DisplaysLoginSelectorOption>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LoginTemplate));
DisplayFactory.register("LoginTemplate", withStyles(styles, { withTheme: true })(withSnackbar(LoginTemplate)));