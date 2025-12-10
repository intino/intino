import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiIcon from "alexandria-ui-elements/src/displays/components/Icon";
import UiMaterialIcon from "alexandria-ui-elements/src/displays/components/MaterialIcon";
import UiOpenSite from "alexandria-ui-elements/src/displays/components/OpenSite";
import UiDialog from "alexandria-ui-elements/src/displays/components/Dialog";
import UiDivider from "alexandria-ui-elements/src/displays/components/Divider";
import UiCloseDialog from "alexandria-ui-elements/src/displays/components/CloseDialog";
import DisplaysLanguagesLandingTemplate from "editor-elements/gen/displays/templates/LanguagesLandingTemplate";
import DisplaysModelsDialog from "editor-elements/gen/displays/templates/ModelsDialog";
import DisplaysModelsTemplate from "editor-elements/gen/displays/templates/ModelsTemplate";
import DisplaysLanguagesTemplate from "editor-elements/gen/displays/templates/LanguagesTemplate";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import LandingTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import LandingTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LandingTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new LandingTemplateNotifier(this);
		this.requester = new LandingTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical flexible" width="100.0%" height={this.fixHeight != null ? this.fixHeight("100.0%") : "100.0%"} style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124" layout="vertical center" width="100.0%" height="100.0%">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_874254982" format="landingSlogan" layout="vertical">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_874254982.a_1964921687" format="landingSloganText" mode="normal" translate={true} value="Domain Specific Languages to model the universe">
						</UiText>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034" format="landingSection" layout="horizontal centerjustified wrap">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a1476739703" format="block" layout="vertical center">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a1476739703.a_1644260360" format="blockTitle doubleAirBottom" mode="normal" value="Model with a DSL">
							</UiText>
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a1476739703.a_197906543" format="blockDescription" mode="normal" value="Use existing DSL from our community">
							</UiText>
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a1476739703.a2054637912" format="blockDescription" mode="normal" value="to build your models">
							</UiText>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a1476739703.a_1633522259" format="doubleAirBottom doubleAirTop" layout="vertical centercenter">
								<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a1476739703.a_1633522259.a_786303719" title="Start modelling" target="self" mode="Button" size="Medium" format="blockMainAction" visible={false}>
								</UiAction>
								<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a1476739703.a_1633522259.a_35958320" title="Start modelling" target="self" mode="Button" size="Medium" format="blockMainAction" visible={false}>
								</UiAction>
							</UiBlock>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a1476739703.a_1518111601" format="bringToFront doubleAirTop" layout="vertical flexible centerjustified wrap">
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a1476739703.a_1518111601.a_1636625161" format="doubleAirBottom" layout="vertical centercenter">
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a1476739703.a_1518111601.a_1636625161.a_2044302012" format="stepBudge" mode="normal" value="1">
									</UiText>
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a1476739703.a_1518111601.a_1636625161.a_1909013169" format="stepTitle" mode="normal" value="Model">
									</UiText>
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a1476739703.a_1518111601.a_1636625161.a_1340421123" format="stepDescription" mode="normal" value="Describe a problem or behavior using a DSL">
									</UiText>
								</UiBlock>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a1476739703.a_1518111601.a1839153582" format="doubleAirBottom doubleAirTop" layout="vertical centercenter">
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a1476739703.a_1518111601.a1839153582.a_758114202" format="stepBudge" mode="normal" value="2">
									</UiText>
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a1476739703.a_1518111601.a1839153582.a1053832595" format="stepTitle" mode="normal" value="Deliver value">
									</UiText>
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a1476739703.a_1518111601.a1839153582.a_1525953679" format="stepDescription" mode="normal" value="Transform the model into a solution">
									</UiText>
								</UiBlock>
							</UiBlock>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a2132934595" layout="vertical center">
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a2132934595.a_319927945" format="doubleAirBottom doubleAirLeft doubleAirRight" layout="vertical">
							</UiBlock>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a_154838479" format="block" layout="vertical center">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a_154838479.a1870642225" format="blockTitle doubleAirBottom" mode="normal" value="Build your own DSL">
							</UiText>
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a_154838479.a_280322709" format="blockDescription" mode="normal" value="Design it as a model using metta">
							</UiText>
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a_154838479.a_1279447633" format="blockDescription" mode="normal" value="No code required">
							</UiText>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a_154838479.a_1497033630" format="doubleAirBottom doubleAirTop" layout="vertical centercenter">
								<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a_154838479.a_1497033630.a2056210931" title="Start building" target="self" mode="Button" size="Medium" format="blockMainAction">
								</UiAction>
								<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a_154838479.a_1497033630.a_73206474" title="Start building" target="self" mode="Button" size="Medium" format="blockMainAction" visible={false}>
								</UiAction>
							</UiBlock>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a_154838479.a971408736" format="bringToFront doubleAirTop" layout="vertical flexible centerjustified wrap">
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a_154838479.a971408736.a_269409822" format="doubleAirBottom" layout="vertical centercenter">
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a_154838479.a971408736.a_269409822.a479120582" format="stepBudge" mode="normal" value="1">
									</UiText>
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a_154838479.a971408736.a_269409822.a_1495147232" format="stepTitle" mode="normal" value="Design">
									</UiText>
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a_154838479.a971408736.a_269409822.a1599692840" format="stepDescription" mode="normal" value="Model with metta, a DSL for designing other DSLs">
									</UiText>
								</UiBlock>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a_154838479.a971408736.a815864673" format="doubleAirBottom doubleAirTop" layout="vertical centercenter">
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a_154838479.a971408736.a815864673.a570212516" format="stepBudge" mode="normal" value="2">
									</UiText>
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a_154838479.a971408736.a815864673.a_1261860588" format="stepTitle" mode="normal" value="Build and share">
									</UiText>
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1540989034.a_154838479.a971408736.a815864673.a_564367033" format="stepDescription" mode="normal" value="Make your DSL available to other users">
									</UiText>
								</UiBlock>
							</UiBlock>
						</UiBlock>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a229814196" format="landingSection" layout="vertical center" width="60.0%" height="100.0%">
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a229814196.a1052552837" title="What is Quassar" target="self" mode="Link" size="Medium" format="blockSubtitleLink bold tripleAirBottom tripleAirTop">
						</UiAction>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_1920237227" format="landingSection" layout="vertical" width="60.0%" height="100.0%">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_1920237227.a1501130986" format="landingSectionTitle" mode="normal" translate={true} value="Featured DSLs">
						</UiText>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_1920237227.a_1709784510" format="landingCatalog" layout="vertical">
							<DisplaysLanguagesLandingTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_1920237227.a_1709784510.a_1837275099">
							</DisplaysLanguagesLandingTemplate>
						</UiBlock>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_2088850198" format="landingSection" layout="vertical center" width="60.0%" height="100.0%">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_2088850198.a1849514375" format="blockSubtitle bold tripleAirBottom tripleAirTop" mode="normal" value="How it works">
						</UiText>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a2128051442" format="landingSubSection" layout="vertical center" width="32.0%" height="100.0%">
						<UiIcon context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a2128051442.a_334844663" format="landingIcon">
						</UiIcon>
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a2128051442.a801304786" format="landingSubSectionTitle" mode="normal" translate={true} value="Define your DSL with Metta">
						</UiText>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a2128051442.a986336444" layout="vertical centercenter" width="100.0%" height="100.0%">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a2128051442.a986336444.a_1572079380" format="landingSubSectionDescription textCentered" mode="normal" translate={true} value="Turn domain concepts into language features with declarative modeling.">
							</UiText>
						</UiBlock>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_1382772438" format="doubleAirBottom" layout="vertical">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_1382772438.a_693574565" format="landingTransparent" mode="normal" value="divider">
						</UiText>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a780176701" format="landingSubSection" layout="vertical center" width="32.0%" height="100.0%">
						<UiIcon context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a780176701.a918367622" format="landingIcon">
						</UiIcon>
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a780176701.a2028430180" format="landingSubSectionTitle" mode="normal" translate={true} value="Quassar builds DSL tools">
						</UiText>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a780176701.a1356217206" layout="vertical centercenter" width="100.0%" height="100.0%">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a780176701.a1356217206.a_1841667127" format="landingSubSectionDescription textCentered" mode="normal" translate={true} value="Automatically generates a parser and a full modelling environment with syntax highlighting, validation, and autocomplete.">
							</UiText>
						</UiBlock>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_626715517" format="doubleAirBottom" layout="vertical">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_626715517.a_1546157399" format="landingTransparent" mode="normal" value="divider">
						</UiText>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a2006530221" format="landingSubSection" layout="vertical center" width="32.0%" height="100.0%">
						<UiIcon context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a2006530221.a_1370483069" format="landingIcon">
						</UiIcon>
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a2006530221.a_13537602" format="landingSubSectionTitle" mode="normal" translate={true} value="Add onboarding">
						</UiText>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a2006530221.a1771651561" layout="vertical centercenter" width="100.0%" height="100.0%">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a2006530221.a1771651561.a_1797151837" format="landingSubSectionDescription textCentered" mode="normal" translate={true} value="Provide help, examples, and model templates so users can model with clarity and confidence">
							</UiText>
						</UiBlock>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_1897455129" format="doubleAirBottom" layout="vertical">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_1897455129.a_661521439" format="landingTransparent" mode="normal" value="divider">
						</UiText>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_667451336" format="landingSubSection" layout="vertical center" width="32.0%" height="100.0%">
						<UiIcon context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_667451336.a1494829908" format="landingIcon">
						</UiIcon>
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_667451336.a_1038405549" format="landingSubSectionTitle" mode="normal" translate={true} value="Code how models are executed">
						</UiText>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_667451336.a_303202855" layout="vertical centercenter" width="100.0%" height="100.0%">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_667451336.a_303202855.a1720346546" format="landingSubSectionDescription textCentered" mode="normal" translate={true} value="Implement the behavior of your DSL using the automatically generated parser">
							</UiText>
						</UiBlock>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1126772555" format="doubleAirBottom" layout="vertical">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1126772555.a223114521" format="landingTransparent" mode="normal" value="divider">
						</UiText>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_1929350997" format="landingSubSection" layout="vertical center" width="32.0%" height="100.0%">
						<UiIcon context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_1929350997.a1297755708" format="landingIcon">
						</UiIcon>
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_1929350997.a_1173775759" format="landingSubSectionTitle" mode="normal" translate={true} value="Let users build solutions with your DSL">
						</UiText>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_1929350997.a_1930411447" layout="vertical centercenter" width="100.0%" height="100.0%">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_1929350997.a_1930411447.a_1675704138" format="landingSubSectionDescription textCentered" mode="normal" translate={true} value="Users can now create models in the modeling environment and run them in the execution environment">
							</UiText>
						</UiBlock>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a699868780" format="doubleAirBottom" layout="vertical">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a699868780.a1588529919" format="landingTransparent" mode="normal" value="divider">
						</UiText>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a112855060" format="doubleAirBottom doubleAirTop" layout="horizontal center">
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a112855060.a_194789014" title="Create your DSL" target="self" mode="Button" size="Medium" format="blockMainAction doubleAirLeft doubleAirRight">
						</UiAction>
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a112855060.a1645318175" title="Create your DSL" target="self" mode="Button" size="Medium" format="blockMainAction" visible={false}>
						</UiAction>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1018013910" format="landingSection" layout="vertical center" width="60.0%" height="100.0%">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1018013910.a163525640" format="blockSubtitle bold tripleAirBottom tripleAirTop" mode="normal" value="Explore, Ask, Share">
						</UiText>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_2116232715" format="landingSubSection" layout="vertical center" width="32.0%" height="100.0%">
						<UiMaterialIcon context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_2116232715.a_653210860" format="landingIcon" icon="Language">
						</UiMaterialIcon>
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_2116232715.a827380731" format="landingSubSectionTitle" mode="normal" translate={true} value="Explore">
						</UiText>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_2116232715.a_908718020" layout="vertical centercenter" width="100.0%" height="100.0%">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_2116232715.a_908718020.a2000709258" format="landingSubSectionDescription textCentered" mode="normal" translate={true} value="Join a growing global community of Quassar users and creators.">
							</UiText>
						</UiBlock>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a185186089" format="doubleAirBottom" layout="vertical">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a185186089.a200742303" format="landingTransparent" mode="normal" value="divider">
						</UiText>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_417296647" format="landingSubSection" layout="vertical center" width="32.0%" height="100.0%">
						<UiMaterialIcon context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_417296647.a_1628673981" format="landingIcon" icon="Chat">
						</UiMaterialIcon>
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_417296647.a_1860637119" format="landingSubSectionTitle" mode="normal" translate={true} value="Ask">
						</UiText>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_417296647.a221915247" layout="vertical centercenter" width="100.0%" height="100.0%">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_417296647.a221915247.a1686051193" format="landingSubSectionDescription textCentered" mode="normal" translate={true} value="Be part of the conversation and shape the future of Quassar with us.">
							</UiText>
						</UiBlock>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_1085553523" format="doubleAirBottom" layout="vertical">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_1085553523.a_1768481249" format="landingTransparent" mode="normal" value="divider">
						</UiText>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a55021641" format="landingSubSection" layout="vertical center" width="32.0%" height="100.0%">
						<UiMaterialIcon context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a55021641.a1841079736" format="landingIcon" icon="WbIncandescent">
						</UiMaterialIcon>
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a55021641.a_1299021407" format="landingSubSectionTitle" mode="normal" translate={true} value="Share">
						</UiText>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a55021641.a_694369768" layout="vertical centercenter" width="100.0%" height="100.0%">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a55021641.a_694369768.a_1242761372" format="landingSubSectionDescription textCentered" mode="normal" translate={true} value="See what others are building, find inspiration, and stay ahead.">
							</UiText>
						</UiBlock>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_329496602" format="doubleAirBottom" layout="vertical">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_329496602.a_1187045313" format="landingTransparent" mode="normal" value="divider">
						</UiText>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_2003048114" format="doubleAirBottom doubleAirTop" layout="horizontal center">
						<UiOpenSite context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a_2003048114.a_1009319629" title="Join on Discord" target="blank" mode="Button" size="Medium" format="blockMainAction doubleAirLeft doubleAirRight">
						</UiOpenSite>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1669493643" format="footerStyle tripleAirTop" layout="vertical centercenter">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1872887124.a1669493643.a2035620545" mode="normal" value="© 2025 Monentia. All rights reserved">
						</UiText>
					</UiBlock>
				</UiBlock>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1488168116" title="" width="60.0%" height="80.0%">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1488168116.a654264343" layout="horizontal" width="100.0%" height="calc(100% - 40px)">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1488168116.a654264343.a_798894084" format="middleAirBottom" layout="vertical">
							<DisplaysModelsDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1488168116.a654264343.a_798894084.a46714601">
							</DisplaysModelsDialog>
						</UiBlock>
						<DisplaysModelsTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1488168116.a654264343.a1711032640">
						</DisplaysModelsTemplate>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1488168116.a388240657">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1488168116.a2020108394" layout="horizontal endjustified">
						<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1488168116.a2020108394.a219082408" title="Close" target="self" mode="Button" size="Small" highlighted="Fill">
						</UiCloseDialog>
					</UiBlock>
				</UiDialog>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2082466934" title="" width="60.0%" height="80.0%">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2082466934.a_56938289" layout="horizontal" width="100.0%" height="calc(100% - 40px)">
						<DisplaysLanguagesTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2082466934.a_56938289.a1127471812">
						</DisplaysLanguagesTemplate>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2082466934.a_375786732">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2082466934.a_874923241" layout="horizontal endjustified">
						<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a2082466934.a_874923241.a1718587988" title="Close" target="self" mode="Button" size="Small" highlighted="Fill">
						</UiCloseDialog>
					</UiBlock>
				</UiDialog>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LandingTemplate));
DisplayFactory.register("LandingTemplate", withStyles(styles, { withTheme: true })(withSnackbar(LandingTemplate)));