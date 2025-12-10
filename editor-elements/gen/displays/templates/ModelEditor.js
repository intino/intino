import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiDisplayStamp from "alexandria-ui-elements/src/displays/components/DisplayStamp";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiSelectorListBox from "alexandria-ui-elements/src/displays/components/SelectorListBox";
import UiMaterialIcon from "alexandria-ui-elements/src/displays/components/MaterialIcon";
import UiBlockResizable from "alexandria-ui-elements/src/displays/components/BlockResizable";
import UiBlockConditional from "alexandria-ui-elements/src/displays/components/BlockConditional";
import UiOpenDialog from "alexandria-ui-elements/src/displays/components/OpenDialog";
import UiFile from "alexandria-ui-elements/src/displays/components/File";
import UiDialog from "alexandria-ui-elements/src/displays/components/Dialog";
import UiDivider from "alexandria-ui-elements/src/displays/components/Divider";
import UiHtmlViewer from "alexandria-ui-elements/src/displays/components/HtmlViewer";
import UiCloseDialog from "alexandria-ui-elements/src/displays/components/CloseDialog";
import DisplaysModelHeaderTemplate from "editor-elements/gen/displays/templates/ModelHeaderTemplate";
import DisplaysModelBrowserTemplate from "editor-elements/gen/displays/templates/ModelBrowserTemplate";
import DisplaysResourcesBrowserTemplate from "editor-elements/gen/displays/templates/ResourcesBrowserTemplate";
import DisplaysIntinoDslEditor from "editor-elements/src/displays/IntinoDslEditor";
import DisplaysConsoleTemplate from "editor-elements/gen/displays/templates/ConsoleTemplate";
import DisplaysLanguageExplorer from "editor-elements/gen/displays/templates/LanguageExplorer";
import DisplaysEditorHelpDisplay from "editor-elements/src/displays/EditorHelpDisplay";
import DisplaysModelSettingsEditor from "editor-elements/gen/displays/templates/ModelSettingsEditor";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import ModelEditorNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import ModelEditorRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class ModelEditor extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new ModelEditorNotifier(this);
		this.requester = new ModelEditorRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" width="100.0%" height={this.fixHeight != null ? this.fixHeight("100.0%") : "100.0%"} style={{...this.props.style,...display}}>
				<DisplaysModelHeaderTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2106529490">
				</DisplaysModelHeaderTemplate>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1383072459" visible={false} layout="vertical flexible centercenter">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1383072459.a_1210235801" format="messageBlock" layout="vertical flexible" width="100.0%" height="100.0%" spacing="16">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1383072459.a_1210235801.a1152297132" layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1383072459.a_1210235801.a1152297132.a_983404054" format="airTop h2 textCentered" mode="normal" translate={true} value="Internal error">
							</UiText>
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1383072459.a_1210235801.a1152297132.a_314865975" format="greyColor textCentered" mode="normal" translate={true} value="Could not load model. Click the info button to use a different DSL version">
							</UiText>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1383072459.a_1210235801.a1152297132.a1009952736" layout="horizontal">
								<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1383072459.a_1210235801.a1152297132.a1009952736.a_1530003742" title="info" target="self" mode="Button" size="Medium" format="airTop" highlighted="Outline">
								</UiAction>
							</UiBlock>
						</UiBlock>
					</UiBlock>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820" visible={false} layout="horizontal flexible">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a757691433" format="relative" visible={false} layout="vertical" width="70px" height="-1px">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a757691433.a_1668300820" format="leftPanelBorder" layout="vertical">
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a757691433.a_1128531117" format="greyLightBackground headerPanel leftPanelSpaced" layout="horizontal">
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a757691433.a_1128531117.a1622712824" layout="horizontal center flexible">
								<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a757691433.a_1128531117.a1622712824.a1477050263" title="open edition" target="self" mode="MaterialIconButton" icon="ChevronRight" size="Small" visible={false}>
								</UiAction>
							</UiBlock>
						</UiBlock>
						<UiSelectorListBox context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a757691433.a785188371" multipleSelection={false}>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a757691433.a785188371.a_1210140994" name="collapsedModel" layout="horizontal center">
								<UiMaterialIcon context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a757691433.a785188371.a_1210140994.a_358324041" format="airRight monitoringSmallAirLeft" title="Model" icon="DescriptionOutlined">
								</UiMaterialIcon>
							</UiBlock>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a757691433.a785188371.a_1445615814" name="collapsedResources" layout="horizontal center">
								<UiMaterialIcon context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a757691433.a785188371.a_1445615814.a_1646927681" format="airRight monitoringSmallAirLeft" title="Resources" icon="AccountTreeOutlined">
								</UiMaterialIcon>
							</UiBlock>
						</UiSelectorListBox>
					</UiBlock>
					<UiBlockResizable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229" layout="horizontal flexible" minSize={0.0}>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_794946289" layout="horizontal flexible" width="14.0%" height="100.0%">
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_794946289.a77992175" layout="vertical" width="70px" height="-1px">
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_794946289.a77992175.a1920173482" format="greyLightBackground headerPanel leftPanelSpaced" layout="horizontal">
									<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_794946289.a77992175.a1920173482.a_1867598426" layout="horizontal center flexible">
										<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_794946289.a77992175.a1920173482.a_1867598426.a_789325563" title="close edition" target="self" mode="MaterialIconButton" icon="ChevronLeft" size="Small" visible={false}>
										</UiAction>
									</UiBlock>
								</UiBlock>
								<UiSelectorListBox context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_794946289.a77992175.a131412804" multipleSelection={false}>
									<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_794946289.a77992175.a131412804.a_1487204754" name="model" layout="horizontal center">
										<UiMaterialIcon context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_794946289.a77992175.a131412804.a_1487204754.a588066892" format="airRight monitoringSmallAirLeft" title="Model" icon="DescriptionOutlined">
										</UiMaterialIcon>
									</UiBlock>
									<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_794946289.a77992175.a131412804.a1325311722" name="resources" layout="horizontal center">
										<UiMaterialIcon context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_794946289.a77992175.a131412804.a1325311722.a_272181015" format="airRight monitoringSmallAirLeft" title="Resources" icon="AccountTreeOutlined">
										</UiMaterialIcon>
									</UiBlock>
								</UiSelectorListBox>
							</UiBlock>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_794946289.a_1286315338" format="whiteBackground" layout="vertical flexible" width="100.0%" height="100.0%">
								<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_794946289.a_1286315338.a_709261627" layout="vertical flexible" width="100.0%" height="100.0%">
									<DisplaysModelBrowserTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_794946289.a_1286315338.a_709261627.a210527306">
									</DisplaysModelBrowserTemplate>
								</UiBlockConditional>
								<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_794946289.a_1286315338.a_1005093823" layout="vertical flexible" width="100.0%" height="100.0%">
									<DisplaysResourcesBrowserTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_794946289.a_1286315338.a_1005093823.a_1301083454">
									</DisplaysResourcesBrowserTemplate>
								</UiBlockConditional>
							</UiBlock>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_2004540213" layout="vertical flexible" width="50.0%" height="100.0%">
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_2004540213.a_1220041226" format="greyLightBackground headerPanel leftBordered leftSpaced rightSpaced" layout="horizontal">
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_2004540213.a_1220041226.a_557675225" layout="horizontal flexible">
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_2004540213.a_1220041226.a_557675225.a_818499277" format="h6" mode="normal" translate={true} value="">
									</UiText>
									<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_2004540213.a_1220041226.a_557675225.a_1004545738" format="airLeft" visible={false} layout="horizontal">
										<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_2004540213.a_1220041226.a_557675225.a_1004545738.a_730801367" format="airRight bold redColor" mode="normal" translate={true} value="modified">
										</UiText>
									</UiBlock>
									<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_2004540213.a_1220041226.a_557675225.a176780872" format="airLeft" visible={false} layout="horizontal">
										<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_2004540213.a_1220041226.a_557675225.a176780872.a_894037356" format="airRight bold greenColor" mode="normal" translate={true} value="saved">
										</UiText>
									</UiBlock>
								</UiBlock>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_2004540213.a_1220041226.a_1490749516" layout="horizontal endjustified">
									<UiOpenDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_2004540213.a_1220041226.a_1490749516.a1842629518" title="shortcuts" target="self" mode="Button" size="Medium">
									</UiOpenDialog>
								</UiBlock>
							</UiBlock>
							<UiBlockResizable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_2004540213.a3557292" layout="vertical flexible" width="100.0%" height="100.0%" minSize={20.0}>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_2004540213.a3557292.a795946659" layout="vertical flexible" width="100.0%" height="60.0%">
									<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_2004540213.a3557292.a795946659.a_1443717685" format="whiteBackground" layout="vertical flexible centercenter">
										<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_2004540213.a3557292.a795946659.a_1443717685.a88815839" mode="normal" value="Select file on left panel to open it">
										</UiText>
									</UiBlock>
									<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_2004540213.a3557292.a795946659.a_1712024400" format="whiteBackground" layout="vertical flexible">
										<UiFile context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_2004540213.a3557292.a795946659.a_1712024400.a_1527956465">
										</UiFile>
									</UiBlock>
									<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_2004540213.a3557292.a795946659.a_1282614563" visible={false} layout="vertical flexible">
										<UiDisplayStamp context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_2004540213.a3557292.a795946659.a_1282614563.a_51814195" format="fullHeight">
										</UiDisplayStamp>
									</UiBlock>
								</UiBlock>
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_2004540213.a3557292.a_154782840" visible={false} layout="vertical" width="100.0%" height="40.0%">
									<DisplaysConsoleTemplate context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_2004540213.a3557292.a_154782840.a_58411104">
									</DisplaysConsoleTemplate>
								</UiBlock>
							</UiBlockResizable>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_38033627" layout="vertical flexible" width="36.0%" height="100.0%">
							<DisplaysLanguageExplorer context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a874886229.a_38033627.a762624043">
							</DisplaysLanguageExplorer>
						</UiBlock>
					</UiBlockResizable>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a_1403062052" format="relative" visible={false} layout="vertical" width="70px" height="-1px">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a_1403062052.a_1528983966" format="rightPanelBorder" layout="vertical">
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a_1403062052.a_1731483428" format="greyLightBackground headerPanel" layout="horizontal center">
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a_1403062052.a_1731483428.a1800355384" format="doubleAirRight" layout="horizontal center endjustified flexible">
								<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a_1403062052.a_1731483428.a1800355384.a_958843825" title="open panel" target="self" mode="MaterialIconButton" icon="ChevronLeft" size="Small">
								</UiAction>
							</UiBlock>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a_1403062052.a1651033701" format="relative" layout="vertical flexible" width="100.0%" height="100.0%">
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a_1403062052.a1651033701.a_885111437" layout="vertical flexible" autoSize={true}>
								<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2078270820.a_1403062052.a1651033701.a_885111437.a_2019641317" title=" " target="self" mode="Link" size="Medium" format="collapsedBlockLink">
								</UiAction>
							</UiBlock>
						</UiBlock>
					</UiBlock>
				</UiBlock>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2034001131" title="File modified" width="500px" height="180px">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2034001131.a286167875" layout="vertical" width="100.0%" height="calc(100% - 40px)">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2034001131.a286167875.a_952714869" mode="normal" translate={true} value="File have been modified. What do you want to do?">
						</UiText>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2034001131.a1256083352">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2034001131.a_140376697" layout="horizontal">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2034001131.a_140376697.a2034044291" layout="horizontal flexible startjustified">
							<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2034001131.a_140376697.a2034044291.a1215284703" title="Cancel" target="self" mode="Button" size="Small" format="airRight">
							</UiAction>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2034001131.a_140376697.a_1080091677" layout="horizontal endjustified">
							<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2034001131.a_140376697.a_1080091677.a1208171082" title="Don't save" target="self" mode="Button" size="Small" format="airRight">
							</UiAction>
							<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2034001131.a_140376697.a_1080091677.a_69085878" title="Save" target="self" mode="Button" size="Small" highlighted="Fill">
							</UiAction>
						</UiBlock>
					</UiBlock>
				</UiDialog>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a675233009" title="DSL help" width="60.0%" height="80.0%">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a675233009.a120862250" format="overflowAuto" layout="vertical" width="100.0%" height="calc(100% - 40px)">
						<UiHtmlViewer context={this._context.bind(this)} owner={this._owner.bind(this)} id="a675233009.a120862250.a160899988" format="fullHeight">
						</UiHtmlViewer>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a675233009.a_986126764">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a675233009.a_1820495127" layout="horizontal endjustified">
						<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a675233009.a_1820495127.a_1565011962" title="Close" target="self" mode="Button" size="Small" highlighted="Fill">
						</UiCloseDialog>
					</UiBlock>
				</UiDialog>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1372270654" title="Shortcuts" width="60.0%" height="80.0%">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1372270654.a_339139133" format="overflowAuto" layout="vertical" width="100.0%" height="calc(100% - 40px)">
						<UiDisplayStamp context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1372270654.a_339139133.a_989763517" format="fullHeight">
						</UiDisplayStamp>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1372270654.a223317445">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1372270654.a1612407750" layout="horizontal endjustified">
						<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1372270654.a1612407750.a1874162714" title="Close" target="self" mode="Button" size="Small" highlighted="Fill">
						</UiCloseDialog>
					</UiBlock>
				</UiDialog>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1570550867" title="Model settings" width="60.0%" height="80.0%">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1570550867.a476102311" format="overflowAuto" layout="vertical" width="100.0%" height="calc(100% - 40px)">
						<DisplaysModelSettingsEditor context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1570550867.a476102311.a268997358">
						</DisplaysModelSettingsEditor>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1570550867.a223517171">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1570550867.a826365926" layout="horizontal endjustified">
						<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1570550867.a826365926.a_151271465" title="Close" target="self" mode="Button" size="Small" highlighted="Fill">
						</UiCloseDialog>
					</UiBlock>
				</UiDialog>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(ModelEditor));
DisplayFactory.register("ModelEditor", withStyles(styles, { withTheme: true })(withSnackbar(ModelEditor)));