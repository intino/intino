import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiDisplayStamp from "alexandria-ui-elements/src/displays/components/DisplayStamp";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiSelectorComboBox from "alexandria-ui-elements/src/displays/components/SelectorComboBox";
import DisplaysIntinoDslEditor from "editor-elements/src/displays/IntinoDslEditor";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import ModelViewerNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import ModelViewerRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class ModelViewer extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new ModelViewerNotifier(this);
		this.requester = new ModelViewerRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" width="100.0%" height={this.fixHeight != null ? this.fixHeight("100.0%") : "100.0%"} style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a374866672" visible={false} layout="vertical flexible centercenter">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a374866672.a_624172024" format="messageBlock" layout="vertical flexible" width="100.0%" height="100.0%" spacing="16">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a374866672.a_624172024.a1576510542" layout="vertical">
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a374866672.a_624172024.a1576510542.a_722047611" format="airTop h2 textCentered" mode="normal" translate={true} value="Internal error">
							</UiText>
							<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a374866672.a_624172024.a1576510542.a_2021858070" format="greyColor textCentered" mode="normal" translate={true} value="Could not load model">
							</UiText>
						</UiBlock>
					</UiBlock>
				</UiBlock>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_490340841" visible={false} layout="vertical flexible">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_490340841.a2009560466" format="middleAirBottom" layout="horizontal">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_490340841.a2009560466.a1555926541" layout="horizontal startjustified">
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_490340841.a2009560466.a1555926541.a29155079" layout="vertical" width="400px" height="-1px">
								<UiSelectorComboBox context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_490340841.a2009560466.a1555926541.a29155079.a_749831900" multipleSelection={false} placeholder="Select model file" maxMenuHeight={300} view="TextView">
								</UiSelectorComboBox>
							</UiBlock>
						</UiBlock>
					</UiBlock>
					<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_490340841.a1778966809" visible={false} mode="normal" value="No files in model">
					</UiText>
					<UiDisplayStamp context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_490340841.a435736583" format="fullHeight">
					</UiDisplayStamp>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(ModelViewer));
DisplayFactory.register("ModelViewer", withStyles(styles, { withTheme: true })(withSnackbar(ModelViewer)));