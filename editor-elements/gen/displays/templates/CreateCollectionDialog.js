import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiOpenDialog from "alexandria-ui-elements/src/displays/components/OpenDialog";
import UiDialog from "alexandria-ui-elements/src/displays/components/Dialog";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiTextEditable from "alexandria-ui-elements/src/displays/components/TextEditable";
import UiMaterialIcon from "alexandria-ui-elements/src/displays/components/MaterialIcon";
import UiDivider from "alexandria-ui-elements/src/displays/components/Divider";
import UiCloseDialog from "alexandria-ui-elements/src/displays/components/CloseDialog";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import CreateCollectionDialogNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import CreateCollectionDialogRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class CreateCollectionDialog extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new CreateCollectionDialogNotifier(this);
		this.requester = new CreateCollectionDialogRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" width="100.0%" height={this.fixHeight != null ? this.fixHeight("100.0%") : "100.0%"} style={{...this.props.style,...display}}>
				<UiOpenDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1480597087" title="Create new" target="self" mode="Link" size="Medium">
				</UiOpenDialog>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2094777978" title="" width="400px" height="220px">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2094777978.a_1083533268" format="overflowAuto" layout="vertical" width="100.0%" height="calc(100% - 40px)">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2094777978.a_1083533268.a310813882" format="airBottom description" mode="normal">
						</UiText>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2094777978.a_1083533268.a614113953" format="relative" layout="vertical">
							<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2094777978.a_1083533268.a614113953.a191755935" format="dslFieldInput" mode="lowercase" placeholder="e.g. my-collection">
							</UiTextEditable>
							<UiMaterialIcon context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2094777978.a_1083533268.a614113953.a_2129214459" format="rightIconField veryLargeIconSize" color="green" visible={false} icon="Check">
							</UiMaterialIcon>
							<UiMaterialIcon context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2094777978.a_1083533268.a614113953.a_671083392" format="rightIconField veryLargeIconSize" color="red" visible={false} icon="Clear">
							</UiMaterialIcon>
						</UiBlock>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2094777978.a_2062154522">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2094777978.a_1828461835" layout="horizontal endjustified">
						<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2094777978.a_1828461835.a_1436308799" title="Close" target="self" mode="Button" size="Small" format="airRight">
						</UiCloseDialog>
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_2094777978.a_1828461835.a828685896" title="Create" target="self" mode="Button" size="Small" highlighted="Fill">
						</UiAction>
					</UiBlock>
				</UiDialog>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(CreateCollectionDialog));
DisplayFactory.register("CreateCollectionDialog", withStyles(styles, { withTheme: true })(withSnackbar(CreateCollectionDialog)));