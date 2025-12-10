import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import DisplaysAddLicenseEditor from "editor-elements/gen/displays/templates/AddLicenseEditor";
import DisplaysRenewLicenseDialog from "editor-elements/gen/displays/templates/RenewLicenseDialog";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import LicenseExpiredBannerNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import LicenseExpiredBannerRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LicenseExpiredBanner extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new LicenseExpiredBannerNotifier(this);
		this.requester = new LicenseExpiredBannerRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1536592119" format="banner" visible={false} layout="vertical">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1536592119.a_323034790" layout="vertical flexible">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1536592119.a_323034790.a_37264777" layout="horizontal">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1536592119.a_323034790.a_37264777.a386001800" mode="normal" value=" ">
							</UiText>
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1536592119.a_323034790.a_37264777.a860009234" mode="normal">
							</UiText>
						</UiBlock>
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1536592119.a_323034790.a907089029" format="greyColor" mode="normal">
						</UiText>
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1536592119.a_323034790.a_1835356976" format="airRight" mode="normal">
						</UiText>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1536592119.a2044628204" format="middleAirTop" layout="horizontal">
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1536592119.a2044628204.a301687544" title="Renew" target="self" mode="Button" size="Small" highlighted="Outline">
						</UiAction>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1536592119.a234311383" format="whiteBackground" visible={false} layout="vertical">
						<DisplaysAddLicenseEditor context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1536592119.a234311383.a_1443045803">
						</DisplaysAddLicenseEditor>
					</UiBlock>
				</UiBlock>
				<DisplaysRenewLicenseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a813723340">
				</DisplaysRenewLicenseDialog>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LicenseExpiredBanner));
DisplayFactory.register("LicenseExpiredBanner", withStyles(styles, { withTheme: true })(withSnackbar(LicenseExpiredBanner)));