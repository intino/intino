import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiSpinner from "alexandria-ui-elements/src/displays/components/Spinner";
import UiBlockConditional from "alexandria-ui-elements/src/displays/components/BlockConditional";
import DisplaysHeaderTemplate from "editor-elements/gen/displays/templates/HeaderTemplate";
import DisplaysLandingTemplate from "editor-elements/gen/displays/templates/LandingTemplate";
import DisplaysAboutTemplate from "editor-elements/gen/displays/templates/AboutTemplate";
import DisplaysCollectionTemplate from "editor-elements/gen/displays/templates/CollectionTemplate";
import DisplaysLanguageTemplate from "editor-elements/gen/displays/templates/LanguageTemplate";
import DisplaysModelTemplate from "editor-elements/gen/displays/templates/ModelTemplate";
import DisplaysForgeTemplate from "editor-elements/gen/displays/templates/ForgeTemplate";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import HomeTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import HomeTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class HomeTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new HomeTemplateNotifier(this);
		this.requester = new HomeTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" width="100.0%" height={this.fixHeight != null ? this.fixHeight("100.0%") : "100.0%"} style={{...this.props.style,...display}}>
				<DisplaysHeaderTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2083916884">
				</DisplaysHeaderTemplate>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2124480832" layout="vertical flexible">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2124480832.a1739344554" format="centered" layout="vertical" width="100.0%" height="100.0%">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2124480832.a1739344554.a2076972160" layout="vertical flexible centercenter">
							<UiSpinner context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2124480832.a1739344554.a2076972160.a_648528930" format="secondary" color="#F68A1C" mode="Rise">
							</UiSpinner>
						</UiBlock>
						<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2124480832.a1739344554.a38346378" layout="vertical flexible">
							<DisplaysLandingTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2124480832.a1739344554.a38346378.a_1797452927">
							</DisplaysLandingTemplate>
						</UiBlockConditional>
						<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2124480832.a1739344554.a366992896" layout="vertical flexible">
							<DisplaysAboutTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2124480832.a1739344554.a366992896.a2074318805">
							</DisplaysAboutTemplate>
						</UiBlockConditional>
						<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2124480832.a1739344554.a103571081" layout="vertical flexible">
							<DisplaysCollectionTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2124480832.a1739344554.a103571081.a_1404691953">
							</DisplaysCollectionTemplate>
						</UiBlockConditional>
						<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2124480832.a1739344554.a866465091" layout="vertical flexible">
							<DisplaysLanguageTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2124480832.a1739344554.a866465091.a409120079">
							</DisplaysLanguageTemplate>
						</UiBlockConditional>
						<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2124480832.a1739344554.a_303986788" layout="vertical flexible">
							<DisplaysModelTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2124480832.a1739344554.a_303986788.a1738710685">
							</DisplaysModelTemplate>
						</UiBlockConditional>
						<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2124480832.a1739344554.a_945764134" layout="vertical flexible">
							<DisplaysForgeTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2124480832.a1739344554.a_945764134.a_1498435295">
							</DisplaysForgeTemplate>
						</UiBlockConditional>
					</UiBlock>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(HomeTemplate));
DisplayFactory.register("HomeTemplate", withStyles(styles, { withTheme: true })(withSnackbar(HomeTemplate)));