import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import LicenseItemTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import LicenseItemTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LicenseItemTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new LicenseItemTemplateNotifier(this);
		this.requester = new LicenseItemTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock format="greyLightBackground middleAirBottom middleRounded middleSpaced" layout="vertical" style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2019470612" layout="horizontal center" isHoverContainer="true">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2019470612.a1033287991" layout="vertical flexible">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2019470612.a1033287991.a1899243279" layout="horizontal">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2019470612.a1033287991.a1899243279.a1157187104" mode="normal" value=" ">
							</UiText>
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2019470612.a1033287991.a1899243279.a_500587142" mode="normal">
							</UiText>
						</UiBlock>
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2019470612.a1033287991.a_1800382691" format="greyColor" mode="normal">
						</UiText>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2019470612.a_1802818726" format="middleAirRight" layout="horizontal endjustified" hidden="IfNotHover">
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2019470612.a_1802818726.a_11842683" title="renew" target="self" mode="Link" size="Medium" visible={false}>
						</UiAction>
					</UiBlock>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LicenseItemTemplate));
DisplayFactory.register("LicenseItemTemplate", withStyles(styles, { withTheme: true })(withSnackbar(LicenseItemTemplate)));