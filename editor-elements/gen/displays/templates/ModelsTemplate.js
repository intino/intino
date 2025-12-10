import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiOpenSite from "alexandria-ui-elements/src/displays/components/OpenSite";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiList from "alexandria-ui-elements/src/displays/components/List";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import DisplaysModelItem from "editor-elements/gen/displays/items/ModelItem";
import DisplaysModelViewer from "editor-elements/gen/displays/templates/ModelViewer";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import ModelsTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import ModelsTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class ModelsTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new ModelsTemplateNotifier(this);
		this.requester = new ModelsTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" width="100.0%" height={this.fixHeight != null ? this.fixHeight("100.0%") : "100.0%"} style={{...this.props.style,...display}}>
				<UiOpenSite context={this._context.bind(this)} owner={this._owner.bind(this)} id="a37166571" title="" target="blank" mode="Link" size="Medium">
				</UiOpenSite>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_959385282" layout="vertical flexible">
					<UiList context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_959385282.a232806822" noItemsMessage="" pageSize={20} itemHeight={50} scrollingMark={true}>
					</UiList>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1543533482" visible={false} layout="vertical flexible">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1543533482.a1696937742" layout="horizontal center">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1543533482.a1696937742.a_1162375725" format="autoHeight" layout="horizontal flexible">
							<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1543533482.a1696937742.a_1162375725.a213592651" title="Examples" target="self" mode="MaterialIconButton" icon="ArrowUpward" size="Small" format="exampleAirLeft middleAirRight">
							</UiAction>
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1543533482.a1696937742.a_1162375725.a_1624832150" format="h5" mode="normal">
							</UiText>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1543533482.a1696937742.a_224156497" format="airRight" layout="horizontal endjustified">
						</UiBlock>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1543533482.a_418986996" layout="vertical flexible">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1543533482.a_418986996.a1275740524" format="greyLightBackground middleSpaced" layout="vertical flexible">
							<DisplaysModelViewer context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1543533482.a_418986996.a1275740524.a_1688540610">
							</DisplaysModelViewer>
						</UiBlock>
					</UiBlock>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(ModelsTemplate));
DisplayFactory.register("ModelsTemplate", withStyles(styles, { withTheme: true })(withSnackbar(ModelsTemplate)));