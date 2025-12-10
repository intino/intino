import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiImage from "alexandria-ui-elements/src/displays/components/Image";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiItem from "alexandria-ui-elements/src/displays/components/Item";
import LanguageItemNotifier from "alexandria-ui-elements/gen/displays/notifiers/ItemNotifier";
import LanguageItemRequester from "alexandria-ui-elements/gen/displays/requesters/ItemRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LanguageItem extends UiItem {

	constructor(props) {
		super(props);
		this.notifier = new LanguageItemNotifier(this);
		this.requester = new LanguageItemRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<div style={{width:"100%",height:"100%",...this.props.style,...this.style(),...display}} className={className}>
				<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a631078546" title="&nbsp;" target="self" mode="Link" size="Medium" format="fullSpaceLink" visible={false}>
				</UiAction>
				<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_560085231" title="&nbsp;" target="self" mode="Link" size="Medium" format="fullSpaceLink" visible={false}>
				</UiAction>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1258847765" format="bottomBordered doubleBottomSpaced topSpaced" layout="horizontal flexible">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1258847765.a_212410184" layout="vertical center" width="100px" height="-1px">
						<UiImage context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1258847765.a_212410184.a73415594" width="60px" height="-1px" colorInvertedWithDarkMode={true}>
						</UiImage>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1258847765.a_739942029" layout="vertical flexible">
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1258847765.a_739942029.a_735884728" title="" target="self" mode="Link" size="Medium" format="h4 lowerCase" visible={false}>
						</UiAction>
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1258847765.a_739942029.a_950478265" title="" target="self" mode="Link" size="Medium" format="h4 lowerCase" visible={false}>
						</UiAction>
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1258847765.a_739942029.a_1331803589" format="bold h6" mode="normal">
						</UiText>
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1258847765.a_739942029.a250410399" mode="normal">
						</UiText>
					</UiBlock>
				</UiBlock>
			</div>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LanguageItem));
DisplayFactory.register("LanguageItem", withStyles(styles, { withTheme: true })(withSnackbar(LanguageItem)));