import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiDisplayStamp from "alexandria-ui-elements/src/displays/components/DisplayStamp";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiImage from "alexandria-ui-elements/src/displays/components/Image";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiSetDarkMode from "alexandria-ui-elements/src/displays/components/SetDarkMode";
import UiSetLightMode from "alexandria-ui-elements/src/displays/components/SetLightMode";
import UiUser from "alexandria-ui-elements/src/displays/components/User";
import DisplaysGoogleLoginDisplay from "editor-elements/src/displays/GoogleLoginDisplay";
import DisplaysUserHomeTemplate from "editor-elements/gen/displays/templates/UserHomeTemplate";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import HeaderTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import HeaderTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class HeaderTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new HeaderTemplateNotifier(this);
		this.requester = new HeaderTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock format="headerStyle" layout="horizontal center" style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1278070197" visible={false} layout="vertical">
					<UiDisplayStamp context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1278070197.a_22508138">
					</UiDisplayStamp>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2055520906" format="middleAirBottom middleAirLeft middleAirTop" layout="horizontal center flexible">
					<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2055520906.a_1196194699" title="" target="self" mode="Link" size="Medium" format="logoLink">
					</UiAction>
					<UiImage context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2055520906.a_929411300" format="airLeft" width="130px" height="30px" mobileReduceFactor={75}>
					</UiImage>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2055520906.a1020125452" visible={false} layout="horizontal center">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2055520906.a1020125452.a_1131873583" format="airLeft airRight h3 headerBullet middleAirTop whiteColor" mode="normal" value=" ">
						</UiText>
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2055520906.a1020125452.a1121576901" title="" target="self" mode="Link" size="Medium" format="h3 whiteColor">
						</UiAction>
					</UiBlock>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1938703462" layout="horizontal endjustified">
					<UiSetDarkMode context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1938703462.a2110050904" title="Set dark mode" target="self" mode="MaterialIconButton" icon="Brightness4" size="Small" format="airRight">
					</UiSetDarkMode>
					<UiSetLightMode context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1938703462.a_1969594197" title="Set light mode" target="self" mode="MaterialIconButton" icon="Brightness7" size="Small" format="airRight">
					</UiSetLightMode>
					<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1938703462.a_2122510140" title="Log in" target="self" mode="Button" size="Medium" format="airRight whiteColor" visible={false}>
					</UiAction>
					<UiUser context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1938703462.a_1592216816" format="airRight relative smallAirTop veryLargeIconSize" visible={false} mode="OnlyPhoto">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1938703462.a_1592216816.a1144258336" format="spaced" layout="vertical">
							<DisplaysUserHomeTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1938703462.a_1592216816.a1144258336.a_1778526339">
							</DisplaysUserHomeTemplate>
						</UiBlock>
					</UiUser>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(HeaderTemplate));
DisplayFactory.register("HeaderTemplate", withStyles(styles, { withTheme: true })(withSnackbar(HeaderTemplate)));