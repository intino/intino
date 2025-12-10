import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiOpenSite from "alexandria-ui-elements/src/displays/components/OpenSite";
import UiImage from "alexandria-ui-elements/src/displays/components/Image";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiSetDarkMode from "alexandria-ui-elements/src/displays/components/SetDarkMode";
import UiSetLightMode from "alexandria-ui-elements/src/displays/components/SetLightMode";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiUser from "alexandria-ui-elements/src/displays/components/User";
import UiSelectorListBox from "alexandria-ui-elements/src/displays/components/SelectorListBox";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import ForgeHeaderTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import ForgeHeaderTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class ForgeHeaderTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new ForgeHeaderTemplateNotifier(this);
		this.requester = new ForgeHeaderTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock format="forgeHeaderStyle" layout="horizontal center" style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_209733203" format="middleAirBottom middleAirLeft middleAirTop" layout="horizontal center flexible">
					<UiOpenSite context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_209733203.a_1675060277" title="" target="self" mode="Link" size="Medium" format="logoLink" visible={false}>
					</UiOpenSite>
					<UiImage context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_209733203.a1091553533" format="airLeft" width="-1px" height="35px" mobileReduceFactor={75} colorInvertedWithDarkMode={true}>
					</UiImage>
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_209733203.a_426808061" format="airLeft bold h2" mode="normal" value="">
					</UiText>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1403881778" layout="horizontal endjustified">
					<UiSetDarkMode context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1403881778.a255588169" title="Set dark mode" target="self" mode="MaterialIconButton" icon="Brightness4" size="Small" format="airRight">
					</UiSetDarkMode>
					<UiSetLightMode context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1403881778.a470910364" title="Set light mode" target="self" mode="MaterialIconButton" icon="Brightness7" size="Small" format="airRight">
					</UiSetLightMode>
					<UiOpenSite context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1403881778.a507884721" title="About" target="self" mode="Button" size="Medium" format="airRight">
					</UiOpenSite>
					<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1403881778.a1851277299" title="Log in" target="self" mode="Button" size="Medium" format="airRight" visible={false}>
					</UiAction>
					<UiUser context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1403881778.a59990529" format="airRight relative smallAirTop veryLargeIconSize" visible={false} mode="OnlyPhoto">
						<UiSelectorListBox context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1403881778.a59990529.a1482197585" multipleSelection={false}>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1403881778.a59990529.a1482197585.a_1453074416" name="Forge_40_4_097558501" layout="vertical">
								<UiOpenSite context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1403881778.a59990529.a1482197585.a_1453074416.a622710506" title="Projects" target="self" mode="Link" size="Medium" visible={false}>
								</UiOpenSite>
							</UiBlock>
						</UiSelectorListBox>
					</UiUser>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(ForgeHeaderTemplate));
DisplayFactory.register("ForgeHeaderTemplate", withStyles(styles, { withTheme: true })(withSnackbar(ForgeHeaderTemplate)));