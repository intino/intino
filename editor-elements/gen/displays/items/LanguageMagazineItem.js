import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiImage from "alexandria-ui-elements/src/displays/components/Image";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiDate from "alexandria-ui-elements/src/displays/components/Date";
import UiNumber from "alexandria-ui-elements/src/displays/components/Number";
import UiItem from "alexandria-ui-elements/src/displays/components/Item";
import LanguageMagazineItemNotifier from "alexandria-ui-elements/gen/displays/notifiers/ItemNotifier";
import LanguageMagazineItemRequester from "alexandria-ui-elements/gen/displays/requesters/ItemRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LanguageMagazineItem extends UiItem {

	constructor(props) {
		super(props);
		this.notifier = new LanguageMagazineItemNotifier(this);
		this.requester = new LanguageMagazineItemRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<div style={{width:"100%",height:"100%",...this.props.style,...this.style(),...display}} className={className}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a901029176" format="dashboardItemStyle" layout="vertical">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a901029176.a_1998407543" format="relative" layout="vertical">
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a901029176.a_1998407543.a_866480010" title="" target="self" mode="Link" size="Medium" format="magazineLinkStyle">
						</UiAction>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a901029176.a_1998407543.a_933408974" layout="horizontal">
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a901029176.a_1998407543.a_933408974.a876265684" format="airRight" layout="vertical">
								<UiImage context={this._context.bind(this)} owner={this._owner.bind(this)} id="a901029176.a_1998407543.a_933408974.a876265684.a847682671" width="50px" height="50px" colorInvertedWithDarkMode={true}>
								</UiImage>
							</UiBlock>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a901029176.a_1998407543.a_933408974.a671636807" layout="vertical flexible">
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a901029176.a_1998407543.a_933408974.a671636807.a_1117303555" layout="horizontal">
									<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a901029176.a_1998407543.a_933408974.a671636807.a_1117303555.a2141910943" layout="vertical flexible">
										<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a901029176.a_1998407543.a_933408974.a671636807.a_1117303555.a2141910943.a1696841294" format="orangeColor" mode="normal">
										</UiText>
									</UiBlock>
								</UiBlock>
								<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a901029176.a_1998407543.a_933408974.a671636807.a1898916949" title="" target="self" mode="Link" size="Medium" format="h4">
								</UiAction>
							</UiBlock>
						</UiBlock>
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a901029176.a_1998407543.a_22442376" format="greyColor middleAirTop" mode="normal" cropWithEllipsis={40}>
						</UiText>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a901029176.a_1998407543.a_1530480322" format="airTop bottomSpaced" layout="horizontal start">
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a901029176.a_1998407543.a_1530480322.a_166920076" layout="vertical flexible">
								<UiDate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a901029176.a_1998407543.a_1530480322.a_166920076.a58030506" label="Creation date" pattern="DD/MM/YYYY HH:mm">
								</UiDate>
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a901029176.a_1998407543.a_1530480322.a_166920076.a_93860982" label="Created with" mode="normal">
								</UiText>
								<UiNumber context={this._context.bind(this)} owner={this._owner.bind(this)} id="a901029176.a_1998407543.a_1530480322.a_166920076.a_617156123" label="Models count" style="Number" value={0.0} decimals={0} expanded={true}>
								</UiNumber>
							</UiBlock>
						</UiBlock>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a901029176.a_239375331" format="topBordered topSpaced" layout="horizontal wrap">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a901029176.a_239375331.a_2088465247" layout="horizontal endjustified">
							<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a901029176.a_239375331.a_2088465247.a_235929035" title="View models" target="self" mode="Link" readonly={true} size="Small" format="airRight">
							</UiAction>
						</UiBlock>
					</UiBlock>
				</UiBlock>
			</div>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LanguageMagazineItem));
DisplayFactory.register("LanguageMagazineItem", withStyles(styles, { withTheme: true })(withSnackbar(LanguageMagazineItem)));