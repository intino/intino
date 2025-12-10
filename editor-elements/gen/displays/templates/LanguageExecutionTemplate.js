import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiOpenSite from "alexandria-ui-elements/src/displays/components/OpenSite";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiMultiple from "alexandria-ui-elements/src/displays/components/Multiple";
import UiTextEditable from "alexandria-ui-elements/src/displays/components/TextEditable";
import UiCopyToClipboard from "alexandria-ui-elements/src/displays/components/CopyToClipboard";
import UiSelectorRadioBox from "alexandria-ui-elements/src/displays/components/SelectorRadioBox";
import UiBlockConditional from "alexandria-ui-elements/src/displays/components/BlockConditional";
import DisplaysDependencyTemplate from "editor-elements/gen/displays/templates/DependencyTemplate";
import DisplaysLinkTemplate from "editor-elements/gen/displays/templates/LinkTemplate";
import DisplaysDownloadTemplate from "editor-elements/gen/displays/templates/DownloadTemplate";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import LanguageExecutionTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import LanguageExecutionTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LanguageExecutionTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new LanguageExecutionTemplateNotifier(this);
		this.requester = new LanguageExecutionTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock format="doubleSpaced" layout="vertical flexible" style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1015502667" visible={false} layout="vertical flexible">
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1015502667.a569646615" mode="normal" value="Select version on right panel to open execution environment">
					</UiText>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1619442195" visible={false} layout="vertical flexible centercenter">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1619442195.a1205742317" layout="vertical centercenter" width="40.0%" height="100.0%">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1619442195.a1205742317.a_1656803044" format="h5 textCentered" mode="normal" value="You haven’t committed the metamodel yet. A commit is required to create a DSL release. Please go to the metamodel and commit your changes.">
						</UiText>
						<UiOpenSite context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1619442195.a1205742317.a_1884088249" title="Goto metamodel" target="self" mode="Button" size="Medium" format="doubleAirTop" highlighted="Fill">
						</UiOpenSite>
					</UiBlock>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1530374660" visible={false} layout="vertical flexible centercenter">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1530374660.a_1936857129" layout="vertical centercenter" width="40.0%" height="100.0%">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1530374660.a_1936857129.a1835176957" format="h5 textCentered" mode="normal" value="This version of the DSL has not been defined yet. To define its execution environments, you must first create the version.">
						</UiText>
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1530374660.a_1936857129.a894870079" title="Create version" target="self" mode="Button" size="Medium" format="doubleAirTop" highlighted="Fill">
						</UiAction>
					</UiBlock>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559" visible={false} layout="vertical flexible">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a867674204" format="middleAirBottom" layout="vertical">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a867674204.a1733133590" format="bold h5" mode="normal" translate={true} value="1. Build your execution logic">
						</UiText>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a867674204.a1766826641" format="autoHeight" layout="vertical" width="80.0%" height="100.0%">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a867674204.a1766826641.a706458447" format="airBottom" mode="normal" translate={true} value="Use the provided Maven dependency to read and parse models created with this version of the DSL. Implement the runtime logic needed to execute them. This could involve compiling, transforming, or running them directly.">
							</UiText>
						</UiBlock>
						<UiMultiple context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a867674204.a643052588" multiple={{instances:"dependencies",arrangement:"Horizontal",noItemsMessage:"There are no readers available",spacing:16,editable:false,wrap:true,collapsed:false,count:{min:0,max:-1}}}>
						</UiMultiple>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a867674204.a546650483" format="doubleAirBottom" layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a867674204.a546650483.a1091133766" format="h7" mode="normal" translate={true} value="Examples of code usage">
							</UiText>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a867674204.a546650483.a1062705499" format="airBottom" layout="horizontal center">
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a867674204.a546650483.a1062705499.a720603545" format="airRight" mode="normal" value="Starting from a:">
								</UiText>
								<UiMultiple context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a867674204.a546650483.a1062705499.a_2005641070" multiple={{instances:"examplesCodeUsage",arrangement:"Horizontal",noItemsMessage:"",spacing:0,editable:false,wrap:true,collapsed:false,count:{min:0,max:-1}}}>
								</UiMultiple>
							</UiBlock>
							<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a867674204.a546650483.a_2098782753" format="whiteBackground" mode="normal" editionMode="Raw" rows={2}>
							</UiTextEditable>
							<UiCopyToClipboard context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a867674204.a546650483.a_1421576677" title="Copy" target="self" mode="Link" size="Medium" format="middleAirTop">
							</UiCopyToClipboard>
						</UiBlock>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1562139960" format="middleAirBottom" visible={false} layout="vertical">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1562139960.a1081932728" format="bold h5" mode="normal" translate={true} value="Downloads">
						</UiText>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1562139960.a881121574" format="autoHeight" layout="vertical" width="80.0%" height="100.0%">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1562139960.a881121574.a1539721470" format="airBottom" mode="normal" translate={true} value="Access all available resources related to this DSL">
							</UiText>
						</UiBlock>
						<UiMultiple context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1562139960.a_1536422860" multiple={{instances:"downloads",arrangement:"Horizontal",noItemsMessage:"There are no downloads available",spacing:16,editable:false,wrap:true,collapsed:false,count:{min:0,max:-1}}}>
						</UiMultiple>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a175494979" format="doubleAirTop middleAirBottom" layout="vertical">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a175494979.a_2112442169" format="bold h5" mode="normal" translate={true} value="2. Deploy the execution environment">
						</UiText>
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a175494979.a1155594317" format="airBottom" mode="normal" translate={true} value="After building your execution logic, deploy it to the target environment where models will be executed. This can be a local service, a remote server, a Docker container, or a Maven plugin — depending on your setup.">
						</UiText>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069" format="doubleAirTop middleAirBottom" layout="vertical">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a1953272361" format="bold h5" mode="normal" translate={true} value="3. How to execute models">
						</UiText>
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a_1795142022" format="airBottom" mode="normal" translate={true} value="Once the runtime environment has been deployed, users will be able to execute their models via a visible action in the model editor. You must define the label for that action and specify its behavior when triggered.">
						</UiText>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a_2021322058" format="doubleAirBottom" layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a_2021322058.a84683897" format="h7" mode="normal" translate={true} value="3.1 Name the action users will see">
							</UiText>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a_2021322058.a1093642909" format="autoHeight" layout="vertical" width="80.0%" height="100.0%">
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a_2021322058.a1093642909.a1529377547" format="airBottom" mode="normal" translate={true} value="Choose the label that users will click to execute a model. It could be something like Execute, Run, Deploy, or Build — whatever best describes what your DSL does.">
								</UiText>
							</UiBlock>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a_2021322058.a_2104464771" layout="vertical" width="400px" height="-1px">
								<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a_2021322058.a_2104464771.a1103221654" format="h5" mode="normal" placeholder="execute">
								</UiTextEditable>
							</UiBlock>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a492698895" layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a492698895.a1425380151" format="h7" mode="normal" translate={true} value="3.2 Choose how the action will be triggered">
							</UiText>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a492698895.a1492676389" format="autoHeight" layout="vertical" width="80.0%" height="100.0%">
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a492698895.a1492676389.a809937027" format="airBottom" mode="normal" translate={true} value="Define what should be executed when the action is triggered. This connects it to your runtime logic.">
								</UiText>
							</UiBlock>
							<UiSelectorRadioBox context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a492698895.a_861741228" multipleSelection={false} layout="Vertical">
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a492698895.a_861741228.a810890136" name="noneOption" mode="normal" value="No execution method defined (yet)">
								</UiText>
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a492698895.a_861741228.a318354278" name="remoteOption" mode="normal" value="Invoke via URL">
								</UiText>
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a492698895.a_861741228.a2007218005" name="localOption" mode="normal" value="Manual script execution">
								</UiText>
							</UiSelectorRadioBox>
							<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a492698895.a_2104844235" format="airTop doubleSpaced greyLightBackground" layout="vertical" width="80.0%" height="100.0%">
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a492698895.a_2104844235.a984554802" format="bold" mode="normal" translate={true} value="If your runtime environment is not ready, you can keep this option.">
								</UiText>
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a492698895.a_2104844235.a_1675174929" format="airBottom" mode="normal" translate={true} value="The model will be available, but users won’t be able to run it until a method is provided.">
								</UiText>
							</UiBlockConditional>
							<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a492698895.a_460656509" format="airTop doubleSpaced greyLightBackground" layout="vertical" width="80.0%" height="100.0%">
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a492698895.a_460656509.a_1736270058" format="bold" mode="normal" translate={true} value="If your runtime is accessible through an API or web service, specify the URL that will be called to execute the model.">
								</UiText>
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a492698895.a_460656509.a1849728509" format="airBottom" mode="normal" translate={true} value="Use the placeholder [commit] to reference the model version. It will be automatically replaced at runtime. Ensure the endpoint is reachable and accepts requests in the expected format. You can update this configuration at any time if the endpoint or parameters change.">
								</UiText>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a492698895.a_460656509.a_153559048" format="airTop" layout="horizontal">
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a492698895.a_460656509.a_153559048.a_961775325" format="italic middleAirRight" mode="normal" translate={true} value="Example:">
									</UiText>
									<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a492698895.a_460656509.a_153559048.a1934250035" title="https://your-application.com/run?model=[commit]" target="self" mode="Link" size="Medium" format="italic">
									</UiAction>
								</UiBlock>
								<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a492698895.a_460656509.a_1494575464" format="whiteBackground" mode="normal" placeholder="https://your-application.com/run?model=[commit]">
								</UiTextEditable>
							</UiBlockConditional>
							<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a492698895.a_295267966" format="airTop doubleSpaced greyLightBackground" layout="vertical" width="80.0%" height="100.0%">
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a492698895.a_295267966.a360940142" format="bold" mode="normal" translate={true} value="If the model must be executed manually specify the command users should copy and run.">
								</UiText>
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a492698895.a_295267966.a980333025" format="airBottom" mode="normal" translate={true} value="Include the placeholder [commit] or [commit-url] where the model version should be inserted. These values will be resolved automatically at runtime. You can use a predefined template or customize the command to match your environment (e.g., Maven, Docker, shell script). This configuration can be updated at any time.">
								</UiText>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a492698895.a_295267966.a1840365455" format="airBottom" layout="horizontal center">
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a492698895.a_295267966.a1840365455.a1675080876" format="airRight" mode="normal" value="Example templates:">
									</UiText>
									<UiMultiple context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a492698895.a_295267966.a1840365455.a95994318" multiple={{instances:"exampleTemplates",arrangement:"Horizontal",noItemsMessage:"",spacing:0,editable:false,wrap:true,collapsed:false,count:{min:0,max:-1}}}>
									</UiMultiple>
								</UiBlock>
								<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a492698895.a_295267966.a1239997228" format="whiteBackground" mode="normal" editionMode="Raw" rows={15}>
								</UiTextEditable>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a492698895.a_295267966.a290366065" format="doubleAirTop" layout="vertical">
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a492698895.a_295267966.a290366065.a_879231916" format="italic" mode="normal" translate={true} value="If your execution environment requires any setup or dependencies, include a URL where users can find the installation steps">
									</UiText>
									<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_931443559.a_1667944069.a492698895.a_295267966.a290366065.a855908325" format="whiteBackground" mode="normal">
									</UiTextEditable>
								</UiBlock>
							</UiBlockConditional>
						</UiBlock>
					</UiBlock>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LanguageExecutionTemplate));
DisplayFactory.register("LanguageExecutionTemplate", withStyles(styles, { withTheme: true })(withSnackbar(LanguageExecutionTemplate)));