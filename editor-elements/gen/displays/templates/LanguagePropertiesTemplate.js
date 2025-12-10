import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiTextEditable from "alexandria-ui-elements/src/displays/components/TextEditable";
import UiMultiple from "alexandria-ui-elements/src/displays/components/Multiple";
import UiOpenDialog from "alexandria-ui-elements/src/displays/components/OpenDialog";
import UiDialog from "alexandria-ui-elements/src/displays/components/Dialog";
import UiDivider from "alexandria-ui-elements/src/displays/components/Divider";
import UiCloseDialog from "alexandria-ui-elements/src/displays/components/CloseDialog";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import DisplaysTagEditor from "editor-elements/gen/displays/templates/TagEditor";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import LanguagePropertiesTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import LanguagePropertiesTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LanguagePropertiesTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new LanguagePropertiesTemplateNotifier(this);
		this.requester = new LanguagePropertiesTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical flexible" style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_611170915" format="doubleAirBottom" layout="vertical">
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_611170915.a_2088503977" format="h5 middleAirBottom" mode="normal" translate={true} value="Title">
					</UiText>
					<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_611170915.a_1426896451" mode="normal">
					</UiTextEditable>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a505723273" format="doubleAirBottom" layout="vertical">
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a505723273.a1621195821" format="h5 middleAirBottom" mode="normal" translate={true} value="What is it">
					</UiText>
					<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a505723273.a_87852682" mode="normal" editionMode="Raw" rows={5}>
					</UiTextEditable>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1617042399" format="doubleAirBottom" layout="vertical">
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1617042399.a1037989589" format="h5 middleAirBottom" mode="normal" translate={true} value="How to cite">
					</UiText>
					<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1617042399.a138024531" mode="normal" editionMode="Raw" rows={5}>
					</UiTextEditable>
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1617042399.a_1827212715" format="middleAirBottom middleAirTop" mode="normal" translate={true} value="Cite link">
					</UiText>
					<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1617042399.a_396816903" mode="normal" editionMode="Raw" rows={5}>
					</UiTextEditable>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_659193414" format="doubleAirBottom" layout="vertical">
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_659193414.a_40806688" format="h5 middleAirBottom" mode="normal" translate={true} value="Copyright and license">
					</UiText>
					<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_659193414.a1410353812" mode="normal" editionMode="Raw" rows={5}>
					</UiTextEditable>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_258188497" format="doubleAirBottom" layout="vertical">
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_258188497.a_1461024002" format="h5 middleAirBottom" mode="normal" translate={true} value="Tags">
					</UiText>
					<UiMultiple context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_258188497.a551534139" multiple={{instances:"tags",arrangement:"Horizontal",noItemsMessage:"No tags",spacing:8,editable:false,wrap:true,collapsed:false,count:{min:0,max:-1}}}>
					</UiMultiple>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_258188497.a1113261093" format="airTop" layout="horizontal">
						<UiOpenDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_258188497.a1113261093.a_1074573675" title="Add tag" target="self" mode="Button" size="Small" highlighted="Outline">
						</UiOpenDialog>
					</UiBlock>
				</UiBlock>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1922398812" title="Add tag" width="280px" height="200px">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1922398812.a_160882229" layout="vertical" width="100.0%" height="calc(100% - 40px)">
						<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1922398812.a_160882229.a_336379211" label="Tag" mode="normal" placeholder="Indicate tag name" focused={true}>
						</UiTextEditable>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1922398812.a1359447191">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1922398812.a_1184114616" layout="horizontal endjustified">
						<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1922398812.a_1184114616.a1563347545" title="Cancel" target="self" mode="Button" size="Small" format="airRight">
						</UiCloseDialog>
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1922398812.a_1184114616.a_1083636586" title="Accept" target="self" mode="Button" size="Small" highlighted="Fill">
						</UiAction>
					</UiBlock>
				</UiDialog>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LanguagePropertiesTemplate));
DisplayFactory.register("LanguagePropertiesTemplate", withStyles(styles, { withTheme: true })(withSnackbar(LanguagePropertiesTemplate)));