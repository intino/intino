import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiTemplateStamp from "alexandria-ui-elements/src/displays/components/TemplateStamp";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiSearchBox from "alexandria-ui-elements/src/displays/components/SearchBox";
import DisplaysLicenseDialog from "editor-elements/gen/displays/templates/LicenseDialog";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import ModelsDialogNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import ModelsDialogRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class ModelsDialog extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new ModelsDialogNotifier(this);
		this.requester = new ModelsDialogRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock format="autoHeight" layout="horizontal center" width="100.0%" height={this.fixHeight != null ? this.fixHeight("100.0%") : "100.0%"} style={{...this.props.style,...display}}>
				<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1143422850" title="New" target="self" mode="Button" size="Small" highlighted="Outline" visible={false}>
				</UiAction>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_516985257" visible={false} layout="horizontal center flexible">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_516985257.a163170884" format="airRight" layout="horizontal flexible endjustified">
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_516985257.a163170884.a482684494" title="most recent" target="self" mode="Link" size="Medium" format="airRight" visible={false}>
						</UiAction>
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_516985257.a163170884.a482919297" format="airRight" visible={false} mode="normal" value="most recent">
						</UiText>
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_516985257.a163170884.a_908565489" title="last modified" target="self" mode="Link" size="Medium" visible={false}>
						</UiAction>
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_516985257.a163170884.a_908330686" visible={false} mode="normal" value="last modified">
						</UiText>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_516985257.a460987264" layout="vertical">
						<UiSearchBox context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_516985257.a460987264.a_2106141614" showCountMessage="true">
						</UiSearchBox>
					</UiBlock>
				</UiBlock>
				<DisplaysLicenseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a527624027">
				</DisplaysLicenseDialog>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(ModelsDialog));
DisplayFactory.register("ModelsDialog", withStyles(styles, { withTheme: true })(withSnackbar(ModelsDialog)));