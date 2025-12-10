import React from "react";
import { withStyles } from '@material-ui/core/styles';
import UiDialog from "alexandria-ui-elements/src/displays/components/Dialog";
import UiBlock from "alexandria-ui-elements/src/displays/components/Block";
import UiImageEditable from "alexandria-ui-elements/src/displays/components/ImageEditable";
import UiText from "alexandria-ui-elements/src/displays/components/Text";
import UiSelectorRadioBox from "alexandria-ui-elements/src/displays/components/SelectorRadioBox";
import UiDivider from "alexandria-ui-elements/src/displays/components/Divider";
import UiCloseDialog from "alexandria-ui-elements/src/displays/components/CloseDialog";
import UiAction from "alexandria-ui-elements/src/displays/components/Action";
import UiTemplate from "alexandria-ui-elements/src/displays/components/Template";
import PublishModelDialogNotifier from "alexandria-ui-elements/gen/displays/notifiers/TemplateNotifier";
import PublishModelDialogRequester from "alexandria-ui-elements/gen/displays/requesters/TemplateRequester";
import DisplayFactory from 'alexandria-ui-elements/src/displays/DisplayFactory';
import { withSnackbar } from 'notistack';

const styles = theme => ({});

class PublishModelDialog extends UiTemplate {

	constructor(props) {
		super(props);
		this.notifier = new PublishModelDialogNotifier(this);
		this.requester = new PublishModelDialogRequester(this);
	};

	render() {
		const display = !this.state.visible ? {display:'none'} : undefined;
		const className = "layout vertical center-justified" + (this.hiddenClass() !== "" ? " " + this.hiddenClass() : "");
		return(
			<UiBlock layout="horizontal" style={{...this.props.style,...display}}>
				<UiDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_170981530" title="Publish model" width="650px" height="460px">
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_170981530.a1562025663" layout="vertical" width="100.0%" height="calc(100% - 40px)">
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_170981530.a1562025663.a_2110921221" format="doubleAirBottom doubleBottomSpaced" visible={false} layout="horizontal">
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_170981530.a1562025663.a_2110921221.a612408446" layout="vertical" width="170px" height="-1px">
								<UiImageEditable context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_170981530.a1562025663.a_2110921221.a612408446.a1312044475" width="150px" height="150px">
								</UiImageEditable>
							</UiBlock>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_170981530.a1562025663.a_2110921221.a_1642213409" layout="vertical flexible">
								<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_170981530.a1562025663.a_2110921221.a_1642213409.a968335635" format="airTop" layout="vertical">
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_170981530.a1562025663.a_2110921221.a_1642213409.a968335635.a_1462344225" format="h5 middleAirBottom" mode="normal" translate={true} value="Language level">
									</UiText>
									<UiSelectorRadioBox context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_170981530.a1562025663.a_2110921221.a_1642213409.a968335635.a1272509811" multipleSelection={false} layout="Vertical">
										<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_170981530.a1562025663.a_2110921221.a_1642213409.a968335635.a1272509811.a_2069619890" name="level1Option" mode="normal" value="Level 1">
										</UiText>
										<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_170981530.a1562025663.a_2110921221.a_1642213409.a968335635.a1272509811.a_1182116209" name="level2Option" mode="normal" value="Level 2">
										</UiText>
									</UiSelectorRadioBox>
								</UiBlock>
							</UiBlock>
						</UiBlock>
						<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_170981530.a1562025663.a_95092055" visible={false} layout="vertical">
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_170981530.a1562025663.a_95092055.a989847670" format="bordered bottomSpaced topSpaced" layout="vertical flexible centercenter">
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_170981530.a1562025663.a_95092055.a989847670.a_1033301318" format="middleAirBottom" mode="normal" value="New version number">
								</UiText>
								<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_170981530.a1562025663.a_95092055.a989847670.a_1630259997" format="veryLargeFontSize" mode="normal">
								</UiText>
							</UiBlock>
							<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_170981530.a1562025663.a_95092055.a905859900" format="doubleAirTop" layout="vertical endjustified">
								<UiSelectorRadioBox context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_170981530.a1562025663.a_95092055.a905859900.a_713048384" multipleSelection={false} layout="Vertical">
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_170981530.a1562025663.a_95092055.a905859900.a_713048384.a392064531" name="majorVersionOption" mode="normal" value="Major version">
									</UiText>
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_170981530.a1562025663.a_95092055.a905859900.a_713048384.a586470807" name="minorVersionOption" mode="normal" value="Minor version">
									</UiText>
									<UiText context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_170981530.a1562025663.a_95092055.a905859900.a_713048384.a_1861028977" name="revisionOption" mode="normal" value="Revision">
									</UiText>
								</UiSelectorRadioBox>
							</UiBlock>
						</UiBlock>
					</UiBlock>
					<UiDivider context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_170981530.a1288815857">
					</UiDivider>
					<UiBlock context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_170981530.a1904925658" layout="horizontal endjustified">
						<UiCloseDialog context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_170981530.a1904925658.a_2033292465" title="Cancel" target="self" mode="Button" size="Small" format="airRight">
						</UiCloseDialog>
						<UiAction context={this._context.bind(this)} owner={this._owner.bind(this)} id="a_170981530.a1904925658.a_1287605523" title="Publish" target="self" mode="Button" size="Small" highlighted="Fill">
						</UiAction>
					</UiBlock>
				</UiDialog>
			</UiBlock>
		);
	}
}

export default withStyles(styles, { withTheme: true })(withSnackbar(PublishModelDialog));
DisplayFactory.register("PublishModelDialog", withStyles(styles, { withTheme: true })(withSnackbar(PublishModelDialog)));