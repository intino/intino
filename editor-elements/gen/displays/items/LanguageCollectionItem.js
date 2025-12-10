import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiImage from "alexandria-ui-elements/src/displays/components/Image";
import UiItem from "alexandria-ui-elements/src/displays/components/Item";
import LanguageCollectionItemNotifier from "alexandria-ui-elements/gen/displays/notifiers/ItemNotifier";
import LanguageCollectionItemRequester from "alexandria-ui-elements/gen/displays/requesters/ItemRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LanguageCollectionItem extends UiItem {

	constructor(props) {
		super(props);
		this.notifier = new LanguageCollectionItemNotifier(this);
		this.requester = new LanguageCollectionItemRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<div style={{width:"100%",height:"100%",...this.props.style,...this.style(),...display}} className={className}>
				<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_313361578" title="&nbsp;" target="self" mode="Link" size="Medium" format="fullSpaceLink">
				</UiAction>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_19396704" format="middleBottomSpaced middleTopSpaced" layout="horizontal flexible">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_19396704.a1496215702" format="relative" layout="vertical center">
						<UiImage context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_19396704.a1496215702.a_498039212" width="20px" height="-1px" colorInvertedWithDarkMode={true}>
						</UiImage>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_19396704.a1886831033" format="collectionItemLink" layout="vertical flexible">
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_19396704.a1886831033.a_1307339534" title="" target="self" mode="Link" size="Medium" format="h4 lowerCase">
						</UiAction>
					</UiBlock>
				</UiBlock>
			</div>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LanguageCollectionItem));
DisplayFactory.register("LanguageCollectionItem", withStyles(styles, { withTheme: true })(withSnackbar(LanguageCollectionItem)));