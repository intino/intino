import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiDownload from "alexandria-ui-elements/src/displays/components/Download";
import UiDialog from "alexandria-ui-elements/src/displays/components/Dialog";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiCopyToClipboard from "alexandria-ui-elements/src/displays/components/CopyToClipboard";
import UiDivider from "alexandria-ui-elements/src/displays/components/Divider";
import UiCloseDialog from "alexandria-ui-elements/src/displays/components/CloseDialog";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import DownloadModelDialogNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import DownloadModelDialogRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class DownloadModelDialog extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new DownloadModelDialogNotifier(this);
		this.requester = new DownloadModelDialogRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="horizontal" style={{...this.props.style,...display}}>
				<UiDownload context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1283342465" title="" target="self" mode="Link" size="Medium">
				</UiDownload>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_36436547" title="Download" width="550px" height="300px">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_36436547.a_97984784" layout="vertical" width="100.0%" height="calc(100% - 40px)">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_36436547.a_97984784.a111069696" format="doubleAirBottom" layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_36436547.a_97984784.a111069696.a658527347" format="h5 middleAirBottom" mode="normal" translate={true} value="Model file (zip format)">
							</UiText>
							<UiDownload context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_36436547.a_97984784.a111069696.a_579639238" title="Download" target="self" mode="Link" size="Medium">
							</UiDownload>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_36436547.a_97984784.a_917113817" format="doubleAirBottom" layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_36436547.a_97984784.a_917113817.a844666237" format="h5 middleAirBottom" mode="normal" translate={true} value="Model url">
							</UiText>
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_36436547.a_97984784.a_917113817.a_2110174540" mode="normal">
							</UiText>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_36436547.a_97984784.a_917113817.a1792415524" format="airTop" layout="vertical">
								<UiCopyToClipboard context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_36436547.a_97984784.a_917113817.a1792415524.a_1936494553" title="Copy URL" target="self" mode="Link" size="Medium" format="smallAirBottom">
								</UiCopyToClipboard>
								<UiCopyToClipboard context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_36436547.a_97984784.a_917113817.a1792415524.a_626465921" title="Copy commit" target="self" mode="Link" size="Medium">
								</UiCopyToClipboard>
							</UiBlock>
						</UiBlock>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_36436547.a1491922333">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_36436547.a_1110399922" layout="horizontal endjustified">
						<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_36436547.a_1110399922.a1582757787" title="Close" target="self" mode="Button" size="Small" highlighted="Fill">
						</UiCloseDialog>
					</UiBlock>
				</UiDialog>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(DownloadModelDialog));
DisplayFactory.register("DownloadModelDialog", withStyles(styles, { withTheme: true })(withSnackbar(DownloadModelDialog)));