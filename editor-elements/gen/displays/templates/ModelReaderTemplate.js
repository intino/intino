import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiDownload from "alexandria-ui-elements/src/displays/components/Download";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import ModelReaderTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import ModelReaderTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class ModelReaderTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new ModelReaderTemplateNotifier(this);
		this.requester = new ModelReaderTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" style={{...this.props.style,...display}}>
				<UiDownload context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1181352102" title="" target="self" mode="Link" size="Medium">
				</UiDownload>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(ModelReaderTemplate));
DisplayFactory.register("ModelReaderTemplate", withStyles(styles, { withTheme: true })(withSnackbar(ModelReaderTemplate)));