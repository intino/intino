import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiImage from "alexandria-ui-elements/src/displays/components/Image";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiDivider from "alexandria-ui-elements/src/displays/components/Divider";
import UiOpenPage from "alexandria-ui-elements/src/displays/components/OpenPage";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import NotFoundTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import NotFoundTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class NotFoundTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new NotFoundTemplateNotifier(this);
		this.requester = new NotFoundTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical flexible" width="100.0%" height={this.fixHeight != null ? this.fixHeight("100.0%") : "100.0%"} style={{...this.props.style,...display}}>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_718316277" format="grey" layout="vertical centercenter" width="100.0%" height="100.0%">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_718316277.a1847254007" format="visible" layout="vertical" width="400px" height="400px" paper>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_718316277.a1847254007.a_1766767053" format="relative" layout="vertical flexible centerjustified" width="100.0%" height="100.0%" spacing="16">
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_718316277.a1847254007.a_1766767053.a590216928" layout="vertical centercenter">
								<UiImage context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_718316277.a1847254007.a_1766767053.a590216928.a1851666914" format="airRight" width="340px" height="80px" mobileReduceFactor={75} colorInvertedWithDarkMode={true}>
								</UiImage>
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_718316277.a1847254007.a_1766767053.a590216928.a_451408320" format="airTop h4 textCentered" mode="normal" translate={true} value="Model not found">
								</UiText>
							</UiBlock>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_718316277.a1847254007.a_1745274205" layout="vertical">
							<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_718316277.a1847254007.a_1745274205.a1109763098">
							</UiDivider>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_718316277.a1847254007.a_1745274205.a_221708182" format="middleAirTop" layout="horizontal centerjustified">
								<UiOpenPage context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_718316277.a1847254007.a_1745274205.a_221708182.a_2020969308" title="Home" target="self" mode="Button" size="Medium" format="airRight" highlighted="Outline">
								</UiOpenPage>
							</UiBlock>
						</UiBlock>
					</UiBlock>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(NotFoundTemplate));
DisplayFactory.register("NotFoundTemplate", withStyles(styles, { withTheme: true })(withSnackbar(NotFoundTemplate)));