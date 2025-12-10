import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiDisplayStamp from "alexandria-ui-elements/src/displays/components/DisplayStamp";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiFileEditable from "alexandria-ui-elements/src/displays/components/FileEditable";
import UiDialog from "alexandria-ui-elements/src/displays/components/Dialog";
import UiTextEditable from "alexandria-ui-elements/src/displays/components/TextEditable";
import UiDivider from "alexandria-ui-elements/src/displays/components/Divider";
import UiCloseDialog from "alexandria-ui-elements/src/displays/components/CloseDialog";
import DisplaysIntinoFileBrowser from "editor-elements/src/displays/IntinoFileBrowser";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import ModelBrowserTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import ModelBrowserTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class ModelBrowserTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new ModelBrowserTemplateNotifier(this);
		this.requester = new ModelBrowserTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical flexible" width="100.0%" height={this.fixHeight != null ? this.fixHeight("100.0%") : "100.0%"} style={{...this.props.style,...display}}>
				<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1541142223" title="" target="self" mode="Link" affirmed="Are you sure to remove?" size="Medium">
				</UiAction>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_248388896" format="greyLightBackground headerPanel leftSpaced rightSpaced" layout="horizontal">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_248388896.a1677251422" layout="horizontal flexible">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_248388896.a1677251422.a_1299273856" format="h6" mode="normal" translate={true} value="Model">
						</UiText>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_248388896.a1313117700" format="smallAirLeft" layout="horizontal center">
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_248388896.a1313117700.a1536659391" title="Operations..." target="self" mode="MaterialIconButton" icon="MoreVert" size="Small">
						</UiAction>
					</UiBlock>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a67237689" layout="vertical flexible">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a67237689.a_1383648243" layout="vertical" autoSize={true}>
						<UiDisplayStamp context={this._context.bind(this)} owner={this._owner.bind(this)} id="a67237689.a_1383648243.a_2101577501" format="displayHeaderPanel smallAirRight">
						</UiDisplayStamp>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a67237689.a_2040239223" format="spaced" layout="vertical end">
						<UiFileEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a67237689.a_2040239223.a_1828667611" dropZone={true} dropZoneLimit={1}>
						</UiFileEditable>
					</UiBlock>
				</UiBlock>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_214556597" title="" width="400px" height="200px">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_214556597.a290089058" layout="horizontal" width="100.0%" height="calc(100% - 40px)">
						<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_214556597.a290089058.a_2137918316" label="Name" mode="normal" placeholder="Indicate name" focused={true}>
						</UiTextEditable>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_214556597.a_1110401398">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_214556597.a_1928365355" layout="horizontal endjustified">
						<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_214556597.a_1928365355.a_2083486880" title="Cancel" target="self" mode="Button" size="Small" format="airRight">
						</UiCloseDialog>
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_214556597.a_1928365355.a_2147392714" title="Accept" target="self" mode="Button" readonly={true} size="Small" highlighted="Fill">
						</UiAction>
					</UiBlock>
				</UiDialog>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(ModelBrowserTemplate));
DisplayFactory.register("ModelBrowserTemplate", withStyles(styles, { withTheme: true })(withSnackbar(ModelBrowserTemplate)));