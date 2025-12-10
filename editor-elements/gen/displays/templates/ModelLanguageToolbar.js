import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiImage from "alexandria-ui-elements/src/displays/components/Image";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import ModelLanguageToolbarNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import ModelLanguageToolbarRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class ModelLanguageToolbar extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new ModelLanguageToolbarNotifier(this);
		this.requester = new ModelLanguageToolbarRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="horizontal center" style={{...this.props.style,...display}}>
				<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1587946260" format="bold doubleAirRight" mode="normal" value="">
				</UiText>
				<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a1587711457" title="" target="self" mode="Link" size="Medium" format="doubleAirRight" visible={false}>
				</UiAction>
				<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a690138132" format="bold doubleAirRight" visible={false} mode="normal" value="help">
				</UiText>
				<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a689903329" title="help" target="self" mode="Link" size="Medium" format="doubleAirRight" visible={false}>
				</UiAction>
				<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1450196452" format="bold doubleAirRight" visible={false} mode="normal" value="examples">
				</UiText>
				<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_1450431255" title="examples" target="self" mode="Link" size="Medium" format="doubleAirRight" visible={false}>
				</UiAction>
				<UiImage context={this._context.bind(this)} owner={this._owner.bind(this)} id="a824285737" format="middleAirRight" width="-1px" height="25px" mobileReduceFactor={75} colorInvertedWithDarkMode={true}>
				</UiImage>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(ModelLanguageToolbar));
DisplayFactory.register("ModelLanguageToolbar", withStyles(styles, { withTheme: true })(withSnackbar(ModelLanguageToolbar)));