import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiOpenSite from "alexandria-ui-elements/src/displays/components/OpenSite";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiDate from "alexandria-ui-elements/src/displays/components/Date";
import UiItem from "alexandria-ui-elements/src/displays/components/Item";
import ModelItemNotifier from "alexandria-ui-elements/gen/displays/notifiers/ItemNotifier";
import ModelItemRequester from "alexandria-ui-elements/gen/displays/requesters/ItemRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class ModelItem extends UiItem {

	constructor(props) {
		super(props);
		this.notifier = new ModelItemNotifier(this);
		this.requester = new ModelItemRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<div style={{width:"100%",height:"100%",...this.props.style,...this.style(),...display}} className={className}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_522054500" format="bottomBordered doubleBottomSpaced topSpaced" layout="vertical flexible">
					<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_522054500.a_954079837" title="" target="self" mode="Link" size="Medium" format="bringToFront h5 relative upperCase" visible={false}>
					</UiAction>
					<UiOpenSite context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_522054500.a_165438692" title="" target="blank" mode="Link" size="Medium" format="bringToFront h5 relative upperCase" visible={false}>
					</UiOpenSite>
					<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_522054500.a191283769" title="" target="self" mode="Link" size="Medium" format="bringToFront h5 relative upperCase" visible={false}>
					</UiAction>
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_522054500.a_172627093" mode="normal">
					</UiText>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_522054500.a456394941" layout="horizontal wrap">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_522054500.a456394941.a311572238" label="DSL" format="airRight" mode="normal">
						</UiText>
						<UiDate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_522054500.a456394941.a318420224" label="Created" format="airRight" pattern="DD/MM/YYYY">
						</UiDate>
						<UiDate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_522054500.a456394941.a_1346724275" label="Updated" format="airRight" pattern="DD/MM/YYYY">
						</UiDate>
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_522054500.a456394941.a187685565" label="Created by" visible={false} mode="normal">
						</UiText>
					</UiBlock>
				</UiBlock>
			</div>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(ModelItem));
DisplayFactory.register("ModelItem", withStyles(styles, { withTheme: true })(withSnackbar(ModelItem)));