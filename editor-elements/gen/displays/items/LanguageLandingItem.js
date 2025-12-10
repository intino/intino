import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiImage from "alexandria-ui-elements/src/displays/components/Image";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiItem from "alexandria-ui-elements/src/displays/components/Item";
import LanguageLandingItemNotifier from "alexandria-ui-elements/gen/displays/notifiers/ItemNotifier";
import LanguageLandingItemRequester from "alexandria-ui-elements/gen/displays/requesters/ItemRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LanguageLandingItem extends UiItem {

	constructor(props) {
		super(props);
		this.notifier = new LanguageLandingItemNotifier(this);
		this.requester = new LanguageLandingItemRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<div style={{width:"100%",height:"100%",...this.props.style,...this.style(),...display}} className={className}>
				<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1419409095" title="&nbsp;" target="self" mode="Link" size="Medium" format="fullSpaceLink" visible={false}>
				</UiAction>
				<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2124399944" title="&nbsp;" target="self" mode="Link" size="Medium" format="fullSpaceLink" visible={false}>
				</UiAction>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_461011618" format="bottomBordered doubleBottomSpaced topSpaced" layout="horizontal flexible">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_461011618.a237517536" format="relative" layout="vertical center" width="100px" height="-1px">
						<UiImage context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_461011618.a237517536.a_55872662" width="60px" height="-1px" colorInvertedWithDarkMode={true}>
						</UiImage>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_461011618.a1575999661" layout="vertical flexible">
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_461011618.a1575999661.a1374105683" title="" target="self" mode="Link" size="Medium" format="h4 lowerCase" visible={false}>
						</UiAction>
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_461011618.a1575999661.a_1396210350" title="" target="self" mode="Link" size="Medium" format="h4 lowerCase" visible={false}>
						</UiAction>
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_461011618.a1575999661.a_346610288" format="bold h6" mode="normal">
						</UiText>
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_461011618.a1575999661.a_456704716" mode="normal" cropWithEllipsis={350}>
						</UiText>
					</UiBlock>
				</UiBlock>
			</div>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LanguageLandingItem));
DisplayFactory.register("LanguageLandingItem", withStyles(styles, { withTheme: true })(withSnackbar(LanguageLandingItem)));