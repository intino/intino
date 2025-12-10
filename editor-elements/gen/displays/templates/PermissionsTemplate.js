import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiImage from "alexandria-ui-elements/src/displays/components/Image";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiDivider from "alexandria-ui-elements/src/displays/components/Divider";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import PermissionsTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import PermissionsTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class PermissionsTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new PermissionsTemplateNotifier(this);
		this.requester = new PermissionsTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical flexible" width="100.0%" height={this.fixHeight != null ? this.fixHeight("100.0%") : "100.0%"} style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1480775764" format="grey" layout="vertical centercenter" width="100.0%" height="100.0%">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1480775764.a2080250007" format="visible" layout="vertical" width="400px" height="400px" paper>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1480775764.a2080250007.a_422676057" format="relative" layout="vertical flexible centerjustified" width="100.0%" height="100.0%" spacing="16">
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1480775764.a2080250007.a_422676057.a1365066531" layout="vertical centercenter">
								<UiImage context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1480775764.a2080250007.a_422676057.a1365066531.a1801297716" format="airRight" width="340px" height="80px" mobileReduceFactor={75} colorInvertedWithDarkMode={true}>
								</UiImage>
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1480775764.a2080250007.a_422676057.a1365066531.a_403331383" format="airTop h4 textCentered" mode="normal" translate={true} value="You dont have access permissions">
								</UiText>
							</UiBlock>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1480775764.a2080250007.a768614088" layout="vertical">
							<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1480775764.a2080250007.a768614088.a2134008926">
							</UiDivider>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1480775764.a2080250007.a768614088.a_1283180457" format="middleAirTop" layout="horizontal centerjustified">
								<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1480775764.a2080250007.a768614088.a_1283180457.a_1716891561" title="Login" target="self" mode="Button" size="Medium" format="airRight" highlighted="Outline" visible={false}>
								</UiAction>
								<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1480775764.a2080250007.a768614088.a_1283180457.a_362732416" title="Logout" target="self" mode="Button" size="Medium" highlighted="Outline" visible={false}>
								</UiAction>
							</UiBlock>
						</UiBlock>
					</UiBlock>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(PermissionsTemplate));
DisplayFactory.register("PermissionsTemplate", withStyles(styles, { withTheme: true })(withSnackbar(PermissionsTemplate)));