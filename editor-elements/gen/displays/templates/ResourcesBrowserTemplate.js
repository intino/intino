import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiDisplayStamp from "alexandria-ui-elements/src/displays/components/DisplayStamp";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiFileEditable from "alexandria-ui-elements/src/displays/components/FileEditable";
import UiDialog from "alexandria-ui-elements/src/displays/components/Dialog";
import UiSelectorListBox from "alexandria-ui-elements/src/displays/components/SelectorListBox";
import UiBlockConditional from "alexandria-ui-elements/src/displays/components/BlockConditional";
import UiTextEditable from "alexandria-ui-elements/src/displays/components/TextEditable";
import UiDivider from "alexandria-ui-elements/src/displays/components/Divider";
import UiCloseDialog from "alexandria-ui-elements/src/displays/components/CloseDialog";
import DisplaysIntinoFileBrowser from "editor-elements/src/displays/IntinoFileBrowser";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import ResourcesBrowserTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import ResourcesBrowserTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class ResourcesBrowserTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new ResourcesBrowserTemplateNotifier(this);
		this.requester = new ResourcesBrowserTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical flexible" width="100.0%" height={this.fixHeight != null ? this.fixHeight("100.0%") : "100.0%"} style={{...this.props.style,...display}}>
				<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1386418635" title="" target="self" mode="Link" affirmed="Are you sure to remove?" size="Medium">
				</UiAction>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_338111772" format="greyLightBackground headerPanel leftSpaced rightSpaced" layout="horizontal">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_338111772.a_1838633467" layout="horizontal flexible">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_338111772.a_1838633467.a_1466454723" format="h6" mode="normal" translate={true} value="Resources">
						</UiText>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_338111772.a_1513388988" format="smallAirLeft" layout="horizontal center">
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_338111772.a_1513388988.a1755514109" title="Operations..." target="self" mode="MaterialIconButton" icon="MoreVert" size="Small">
						</UiAction>
					</UiBlock>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1057902401" layout="vertical flexible">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1057902401.a84812365" layout="vertical" autoSize={true}>
						<UiDisplayStamp context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1057902401.a84812365.a1172321441" format="displayHeaderPanel smallAirRight">
						</UiDisplayStamp>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1057902401.a_571778615" format="spaced" layout="vertical end">
						<UiFileEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1057902401.a_571778615.a877951783" dropZone={true} dropZoneLimit={1}>
						</UiFileEditable>
					</UiBlock>
				</UiBlock>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a484120519" title="" width="600px" height="350px">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a484120519.a1387914547" layout="horizontal" width="100.0%" height="calc(100% - 40px)">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a484120519.a1387914547.a698259682" format="greyLightBackground" layout="vertical" width="150px" height="-1px">
							<UiSelectorListBox context={this._context.bind(this)} owner={this._owner.bind(this)} id="a484120519.a1387914547.a698259682.a_593628064" multipleSelection={false}>
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a484120519.a1387914547.a698259682.a_593628064.a1100282162" name="newFileOption" mode="normal" value="New file">
								</UiText>
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a484120519.a1387914547.a698259682.a_593628064.a220214257" name="uploadFileOption" mode="normal" value="Upload file">
								</UiText>
							</UiSelectorListBox>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a484120519.a1387914547.a_322176327" format="airLeft" layout="vertical flexible">
							<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a484120519.a1387914547.a_322176327.a_1690471141" format="airTop" layout="vertical">
								<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a484120519.a1387914547.a_322176327.a_1690471141.a70570682" label="Name" mode="normal" placeholder="Indicate name" focused={true}>
								</UiTextEditable>
							</UiBlockConditional>
							<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a484120519.a1387914547.a_322176327.a308106916" format="airBottom airTop" layout="vertical">
								<UiFileEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a484120519.a1387914547.a_322176327.a308106916.a_433795902" dropZone={true} dropZoneLimit={1}>
								</UiFileEditable>
							</UiBlockConditional>
						</UiBlock>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a484120519.a_1826366837">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a484120519.a1646509812" layout="horizontal endjustified">
						<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a484120519.a1646509812.a1180212992" title="Cancel" target="self" mode="Button" size="Small" format="airRight">
						</UiCloseDialog>
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a484120519.a1646509812.a1833758161" title="Accept" target="self" mode="Button" readonly={true} size="Small" highlighted="Fill">
						</UiAction>
					</UiBlock>
				</UiDialog>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(ResourcesBrowserTemplate));
DisplayFactory.register("ResourcesBrowserTemplate", withStyles(styles, { withTheme: true })(withSnackbar(ResourcesBrowserTemplate)));