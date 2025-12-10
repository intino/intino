const path = require("path");
const HtmlWebPackPlugin = require("html-webpack-plugin");
const CopyWebpackPlugin = require('copy-webpack-plugin');
const CircularDependencyPlugin = require('circular-dependency-plugin');

module.exports = {
	module: {
		rules: [
            {
                test: /node_modules\/ace-linters*/,
                use: { loader: 'babel-loader', options: { presets: ['@babel/preset-env'] } }
            },
            {
                test: /\.mjs$/,
                include: /node_modules/,
                type: "javascript/auto",
                loader: "babel-loader"
            },
			{
				test: /\.js$/,
				exclude: /node_modules\/(?!(alexandria-ui-elements)\/).*/,
				options: { rootMode: "upward", presets: ['@babel/preset-env'], cacheDirectory: true },
				loader: "babel-loader"
			},
			{
				test: /\.html$/,
				loader: "html-loader"
			},
			{
				test: /\.css$/,
				loader: 'style-loader!css-loader'
			}
		]
	},
	entry : {
		'loginTemplate' : './gen/apps/LoginTemplate.js',
		'homeTemplate' : './gen/apps/HomeTemplate.js'
	},
	output: {
		path: "/Users/oroncal/workspace/infrastructure/quassar/out/production/editor-elements/www/editor-elements",
		publicPath: '$basePath/editor-elements/',
		filename: "[name].js"
	},
	resolve: {
		alias: {
			"app-elements": path.resolve(__dirname, '.'),
			"editor-elements": path.resolve(__dirname, '.')
		}
	},
	plugins: [
		new CircularDependencyPlugin({
			failOnError: false,
			allowAsyncCycles: false,
			cwd: process.cwd(),
		}),
		new CopyWebpackPlugin([{
			from: 'res',
			to: './res'
		}]),
		new HtmlWebPackPlugin({
			hash: true,
			title: "Test UI",
			chunks: ['loginTemplate'],
			template: "./src/loginTemplate.html",
			filename: "./loginTemplate.html"
		}),
		new HtmlWebPackPlugin({
			hash: true,
			title: "Test UI",
			chunks: ['homeTemplate'],
			template: "./src/homeTemplate.html",
			filename: "./homeTemplate.html"
		})
	]
};