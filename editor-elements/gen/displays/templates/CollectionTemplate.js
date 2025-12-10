import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiBlockConditional from "alexandria-ui-elements/src/displays/components/BlockConditional";
import UiBlockResizable from "alexandria-ui-elements/src/displays/components/BlockResizable";
import DisplaysCollectionHeaderTemplate from "editor-elements/gen/displays/templates/CollectionHeaderTemplate";
import DisplaysLanguagesCollectionTemplate from "editor-elements/gen/displays/templates/LanguagesCollectionTemplate";
import DisplaysCollaboratorsTemplate from "editor-elements/gen/displays/templates/CollaboratorsTemplate";
import DisplaysLicensesTemplate from "editor-elements/gen/displays/templates/LicensesTemplate";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import CollectionTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import CollectionTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class CollectionTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new CollectionTemplateNotifier(this);
		this.requester = new CollectionTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" width="100.0%" height={this.fixHeight != null ? this.fixHeight("calc(100% - 2px)") : "calc(100% - 2px)"} style={{...this.props.style,...display}}>
				<DisplaysCollectionHeaderTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_707560242" visible={false}>
				</DisplaysCollectionHeaderTemplate>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1769296291" format="whiteBackground" layout="vertical flexible" width="100.0%" height="100.0%">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1769296291.a_262405182" visible={false} layout="vertical flexible centercenter">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1769296291.a_262405182.a223909841" format="messageBlock" layout="vertical flexible" width="60.0%" height="100.0%" spacing="16">
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1769296291.a_262405182.a223909841.a1858964294" layout="vertical">
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1769296291.a_262405182.a223909841.a1858964294.a1873305731" format="airTop greyHardColor h2 textCentered" mode="normal" translate={true} value="Not found">
								</UiText>
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1769296291.a_262405182.a223909841.a1858964294.a1870428004" format="greyColor h5 textCentered" mode="normal" translate={true} value="Sorry, we can't find the collection you are visiting">
								</UiText>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1769296291.a_262405182.a223909841.a1858964294.a335704428" layout="horizontal">
									<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1769296291.a_262405182.a223909841.a1858964294.a335704428.a_1200604573" title="home" target="self" mode="Button" size="Medium" format="airTop" highlighted="Outline">
									</UiAction>
								</UiBlock>
							</UiBlock>
						</UiBlock>
					</UiBlock>
					<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1769296291.a_1676650824" layout="vertical flexible" width="100.0%" height="100.0%">
						<UiBlockResizable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1769296291.a_1676650824.a_1324260716" format="whiteBackground" layout="horizontal flexible" width="100.0%" height="100.0%" minSize={4.0}>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1769296291.a_1676650824.a_1324260716.a1927389039" format="bottomSpaced doubleLeftSpaced doubleRightSpaced topSpaced" layout="vertical flexible" width="30.0%" height="100.0%">
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1769296291.a_1676650824.a_1324260716.a1927389039.a344582042" format="doubleAirBottom" layout="horizontal">
									<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1769296291.a_1676650824.a_1324260716.a1927389039.a344582042.a_914103217" layout="vertical flexible">
										<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1769296291.a_1676650824.a_1324260716.a1927389039.a344582042.a_914103217.a695304322" format="bold" backgroundColor="transparent" mode="uppercase" highlighted={{text:"white",background:"transparent"}}>
										</UiText>
									</UiBlock>
									<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1769296291.a_1676650824.a_1324260716.a1927389039.a344582042.a396550544" layout="horizontal endjustified">
										<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1769296291.a_1676650824.a_1324260716.a1927389039.a344582042.a396550544.a_2090652578" title="remove" target="self" mode="MaterialIconButton" icon="Delete" signed={{mode:"SimpleText",text:"To confirm deletion, please type the name of the collection. This action cannot be undone.",reason:""}} size="Small" visible={false}>
										</UiAction>
									</UiBlock>
								</UiBlock>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1769296291.a_1676650824.a_1324260716.a1927389039.a1587122472" format="doubleAirBottom" layout="vertical">
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1769296291.a_1676650824.a_1324260716.a1927389039.a1587122472.a1795591550" format="h5" mode="normal" value="DSLs">
									</UiText>
									<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1769296291.a_1676650824.a_1324260716.a1927389039.a1587122472.a723897385" layout="vertical" width="-1px" height="120px">
										<DisplaysLanguagesCollectionTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1769296291.a_1676650824.a_1324260716.a1927389039.a1587122472.a723897385.a_707299809">
										</DisplaysLanguagesCollectionTemplate>
									</UiBlock>
								</UiBlock>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1769296291.a_1676650824.a_1324260716.a1927389039.a_1301431585" format="doubleAirBottom" layout="vertical">
									<DisplaysCollaboratorsTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1769296291.a_1676650824.a_1324260716.a1927389039.a_1301431585.a_2027237065">
									</DisplaysCollaboratorsTemplate>
								</UiBlock>
							</UiBlock>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1769296291.a_1676650824.a_1324260716.a341591811" layout="vertical flexible" width="70.0%" height="100.0%">
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1769296291.a_1676650824.a_1324260716.a341591811.a1986380647" format="h5 spaced" mode="normal" value="Licenses">
								</UiText>
								<DisplaysLicensesTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1769296291.a_1676650824.a_1324260716.a341591811.a_1062483371">
								</DisplaysLicensesTemplate>
							</UiBlock>
						</UiBlockResizable>
					</UiBlockConditional>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(CollectionTemplate));
DisplayFactory.register("CollectionTemplate", withStyles(styles, { withTheme: true })(withSnackbar(CollectionTemplate)));