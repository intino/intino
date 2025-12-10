import React from "react";
import { MuiThemeProvider, withStyles } from '@material-ui/core/styles';
import { IconButton } from "@material-ui/core";
import { Close } from '@material-ui/icons';
import { SnackbarProvider, useSnackbar } from "notistack";
import CssBaseline from '@material-ui/core/CssBaseline';
import Theme from '../../gen/Theme';
import Page from "alexandria-ui-elements/src/displays/Page";
import ConnectionChecker from "alexandria-ui-elements/src/displays/ConnectionChecker";
import PermissionsTemplate from "../../gen/displays/templates/PermissionsTemplate";


let theme = Theme.create();
const styles = theme => ({});

const PermissionsTemplatePageDismissAction = ({ id }) => {
const { closeSnackbar } = useSnackbar();
return (<IconButton color="inherit" onClick={() => closeSnackbar(id)}><Close fontSize="small" /></IconButton>);
}

export default class PermissionsTemplatePage extends Page {
render() {
	const { classes } = this.props;
    theme = Theme.create(this.state.appMode);
    theme.onChangeMode(mode => this.setState({appMode:mode}));
	return (
		<MuiThemeProvider theme={theme}>
			<SnackbarProvider maxSnack={3} action={key => <PermissionsTemplatePageDismissAction id={key}/>}>
				<CssBaseline />
				<PermissionsTemplate id="permissionsTemplate"></PermissionsTemplate>
				<ConnectionChecker></ConnectionChecker>
			</SnackbarProvider>
		</MuiThemeProvider>
	);
}
}