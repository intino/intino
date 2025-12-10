import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiBlockConditional from "alexandria-ui-elements/src/displays/components/BlockConditional";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiTextEditable from "alexandria-ui-elements/src/displays/components/TextEditable";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import LanguageToolEditorNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import LanguageToolEditorRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class LanguageToolEditor extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new LanguageToolEditorNotifier(this);
		this.requester = new LanguageToolEditorRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="vertical" style={{...this.props.style,...display}}>
				<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a585546331" layout="vertical" width="100.0%" height="100.0%">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a585546331.a_1104981263" format="doubleAirBottom" layout="vertical">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a585546331.a_1104981263.a_2045268829" mode="normal" translate={true} value="Docker image url">
						</UiText>
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a585546331.a_1104981263.a1341722879" format="description" mode="normal" translate={true} value="Use [model] or [release] to indicate current model/release version">
						</UiText>
						<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a585546331.a_1104981263.a535137315" format="airBottom" mode="normal" focused={true}>
						</UiTextEditable>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a585546331.a_282085681" layout="vertical">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a585546331.a_282085681.a_12595052" mode="normal" translate={true} value="Docker image run parameters">
						</UiText>
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a585546331.a_282085681.a_780295041" format="description" mode="normal" translate={true} value="Use [model] or [release] to indicate current model/release version">
						</UiText>
						<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a585546331.a_282085681.a1763054186" format="airBottom" mode="normal">
						</UiTextEditable>
					</UiBlock>
				</UiBlockConditional>
				<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1952231412" layout="vertical" width="100.0%" height="100.0%">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1952231412.a_725783536" layout="vertical">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1952231412.a_725783536.a836246028" mode="normal" translate={true} value="Deploy site url. It must contain two parameters: [model] and [release]">
						</UiText>
						<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1952231412.a_725783536.a_1559937844" format="airBottom" mode="normal" placeholder="https://[your-site]?model=[model]&release=[release]" focused={true}>
						</UiTextEditable>
					</UiBlock>
				</UiBlockConditional>
				<UiBlockConditional context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1114750845" layout="vertical" width="100.0%" height="100.0%">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1114750845.a_14853394" format="doubleAirBottom" layout="vertical">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1114750845.a_14853394.a_618820141" mode="normal" translate={true} value="Install instructions">
						</UiText>
						<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1114750845.a_14853394.a507327343" format="airBottom" mode="normal" editionMode="Raw" rows={4} focused={true}>
						</UiTextEditable>
					</UiBlock>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1114750845.a11860282" layout="vertical">
						<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1114750845.a11860282.a_518628360" mode="normal" translate={true} value="Execution instructions">
						</UiText>
						<UiTextEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1114750845.a11860282.a_1018632902" format="airBottom" mode="normal" editionMode="Raw" rows={4}>
						</UiTextEditable>
					</UiBlock>
				</UiBlockConditional>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(LanguageToolEditor));
DisplayFactory.register("LanguageToolEditor", withStyles(styles, { withTheme: true })(withSnackbar(LanguageToolEditor)));