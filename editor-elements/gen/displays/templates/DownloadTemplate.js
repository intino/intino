import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiDownload from "alexandria-ui-elements/src/displays/components/Download";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import DownloadTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import DownloadTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class DownloadTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new DownloadTemplateNotifier(this);
		this.requester = new DownloadTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" style={{...this.props.style,...display}}>
				<UiDownload context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1617886004" title="" target="self" mode="Link" size="Medium">
				</UiDownload>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(DownloadTemplate));
DisplayFactory.register("DownloadTemplate", withStyles(styles, { withTheme: true })(withSnackbar(DownloadTemplate)));