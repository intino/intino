import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiDialog from "alexandria-ui-elements/src/displays/components/Dialog";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiSelectorRadioBox from "alexandria-ui-elements/src/displays/components/SelectorRadioBox";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiDivider from "alexandria-ui-elements/src/displays/components/Divider";
import UiCloseDialog from "alexandria-ui-elements/src/displays/components/CloseDialog";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import DisplaysDownloadModelDialog from "editor-elements/gen/displays/templates/DownloadModelDialog";
import DisplaysLanguageExecutionLauncher from "editor-elements/gen/displays/templates/LanguageExecutionLauncher";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import CommitModelDialogNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import CommitModelDialogRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class CommitModelDialog extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new CommitModelDialogNotifier(this);
		this.requester = new CommitModelDialogRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="horizontal" style={{...this.props.style,...display}}>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_604990356" title="Commit model" width="500px" height="300px">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_604990356.a1643086733" layout="vertical" width="100.0%" height="calc(100% - 40px)">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_604990356.a1643086733.a1379624751" visible={false} layout="vertical">
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_604990356.a1643086733.a1379624751.a1541864898" layout="vertical endjustified">
								<UiSelectorRadioBox context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_604990356.a1643086733.a1379624751.a1541864898.a_487408296" multipleSelection={false} layout="Vertical">
								</UiSelectorRadioBox>
							</UiBlock>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_604990356.a1643086733.a1379624751.a1178353363" format="airTop bordered bottomSpaced topSpaced" layout="vertical flexible centercenter">
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_604990356.a1643086733.a1379624751.a1178353363.a_1566780488" format="middleAirBottom" mode="normal" value="New version number">
								</UiText>
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_604990356.a1643086733.a1379624751.a1178353363.a417282754" format="veryLargeFontSize" mode="normal">
								</UiText>
							</UiBlock>
						</UiBlock>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_604990356.a_1205658969">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_604990356.a2045979554" layout="horizontal endjustified">
						<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_604990356.a2045979554.a_327863357" title="Cancel" target="self" mode="Button" size="Small" format="airRight">
						</UiCloseDialog>
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_604990356.a2045979554.a_1457584407" title="Commit" target="self" mode="Button" size="Small" highlighted="Fill">
						</UiAction>
					</UiBlock>
				</UiDialog>
				<DisplaysDownloadModelDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1575813243">
				</DisplaysDownloadModelDialog>
				<DisplaysLanguageExecutionLauncher context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1651363532">
				</DisplaysLanguageExecutionLauncher>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(CommitModelDialog));
DisplayFactory.register("CommitModelDialog", withStyles(styles, { withTheme: true })(withSnackbar(CommitModelDialog)));