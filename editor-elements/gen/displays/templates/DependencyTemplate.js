import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiTextCode from "alexandria-ui-elements/src/displays/components/TextCode";
import UiCopyToClipboard from "alexandria-ui-elements/src/displays/components/CopyToClipboard";
import UiDownload from "alexandria-ui-elements/src/displays/components/Download";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import DependencyTemplateNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import DependencyTemplateRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class DependencyTemplate extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new DependencyTemplateNotifier(this);
		this.requester = new DependencyTemplateRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock format="airTop" layout="vertical" width="400px" height={this.fixHeight != null ? this.fixHeight("-1px") : "-1px"} style={{...this.props.style,...display}}>
				<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_682122787" mode="normal">
				</UiText>
				<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1200717969" layout="horizontal">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1200717969.a659812925" format="doubleAirRight" layout="vertical">
						<UiTextCode context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1200717969.a659812925.a_1513513987" format="dependencyStyle" mode="normal" language="Html" value="">
						</UiTextCode>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1200717969.a659812925.a_1971787721" format="middleAirTop" layout="horizontal">
							<UiCopyToClipboard context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1200717969.a659812925.a_1971787721.a594846618" title="Copy" target="self" mode="Link" size="Medium" format="airRight">
							</UiCopyToClipboard>
							<UiDownload context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1200717969.a659812925.a_1971787721.a1555245563" title="Download" target="self" mode="Link" size="Medium">
							</UiDownload>
						</UiBlock>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1200717969.a343893268" layout="vertical">
						<UiTextCode context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1200717969.a343893268.a182103833" format="dependencyStyle" mode="normal" language="Html" value="">
						</UiTextCode>
						<UiCopyToClipboard context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1200717969.a343893268.a1114431995" title="Copy" target="self" mode="Link" size="Medium" format="middleAirTop">
						</UiCopyToClipboard>
					</UiBlock>
				</UiBlock>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(DependencyTemplate));
DisplayFactory.register("DependencyTemplate", withStyles(styles, { withTheme: true })(withSnackbar(DependencyTemplate)));