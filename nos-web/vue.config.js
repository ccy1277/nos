// mode
const env = process.env.NODE_ENV;
const isDev = ('dev' === env);
const isProd = ('prod' === env);
const isReport = ('report' === env);

const BundleAnalyzerPlugin = require('webpack-bundle-analyzer').BundleAnalyzerPlugin;
const OptimizeCssPlugin = require('optimize-css-assets-webpack-plugin');
const UglifyJsPlugin = require('uglifyjs-webpack-plugin');
const path = require('path');
const { dirname } = require('path');
console.log(env);
console.log(isProd);
console.log(isDev);
// cdn 
const cdn = {
    css: [
        '//lib.baomitu.com/element-ui/2.12.0/theme-chalk/index.css'
    ],
    js: [
        '//lib.baomitu.com/vue/2.6.11/vue.min.js',
        '//lib.baomitu.com/vuex/3.0.1/vuex.min.js',
        '//lib.baomitu.com/axios/0.25.0/axios.min.js',
        '//lib.baomitu.com/vue-router/3.1.3/vue-router.min.js',
        '//lib.baomitu.com/element-ui/2.15.6/index.js'
    ]
};

const resolve = (dir)=>{
    return path.join(__dirname, './', dir);
}

module.exports = {
    publicPath: isProd ? "/nos" : "./",
    outputDir: isProd ? "dist/prod" : "dist/dev",
    // 如果你不需要生产环境的 source map，可以将其设置为 false 以加速生产环境构建。
    productionSourceMap: isDev,
    /**
     * 如果你需要基于环境有条件地配置行为，或者想要直接修改配置，那就换成一个函数 (该函数会在环境变量被设置之
     * 后懒执行)。该方法的第一个参数会收到已经解析好的配置。在函数内，你可以直接修改配置，或者返回一个将会被合
     * 并的对象：
     */
    configureWebpack: (config)=>{
        /**
         * 你应该修改 vue.config.js 中的 outputDir 选项而不是修改 output.path；你应该修改 vue.config.js
         *  中的 publicPath 选项而不是修改 output.publicPath 这样做是因为 vue.config.js 中的值会被用在配
         * 置里的多个地方，以确保所有的部分都能正常工作在一起
         */
        config.output = {
            path: config.output.path,
            publicPath: config.output.publicPath,
            /** chunkFilename 指未被列在entry中，却又需要被打包出来的 chunk 文件的名称。一般来说，
             *  这个 chunk 文件指的就是要懒加载的代码。 */
            chunkFilename: 'js/[name].[hash:8].js',
            // 输入文件经过webpack 打包后输出文件的文件名
            filename: 'js/[name].[hash:8].js'
        };
        /**
         * 通过import语法导入的第三方依赖包，最终都会打包合并到一个文件中，打包成功后，这个文件自然过大。
         * 我们可以通过webpack的externals节点，来配置并加载外部的CDN资源，凡是声明在externals中的第三
         * 方依赖，都不会被打包，这样就可以有效的减少单个文件的体积。
         */
        config.externals = {
            'vue': 'Vue',
            'vuex': 'Vuex',
            'axios': 'axios',
            'element-ui': 'ELEMENT',
            'vue-router': 'VueRouter'
        }

        console.error("\n   运行环境：" + env + "\n");

        let plugs = [
            /**压缩css文件 */
            new OptimizeCssPlugin()
        ];

        if (isReport) {
            plugs.push(
                new BundleAnalyzerPlugin({
                    //  将在“服务器”模式下使用的端口启动HTTP服务器。
                    analyzerPort: 1234
                })
            )
        }
        if (isProd) {
            plugs.push(
                /**配置了去除线上环境的打印信息。 */
                new UglifyJsPlugin({
                    uglifyOptions: {
                        warnings: false,
                        compress: {
                            drop_console: true,
                            drop_debugger: true
                        },
                    },
                    sourceMap: false,
                    //使用多进程并行运行来提高构建速度
                    parallel: true,
                }),
            )
        }
            
        return {
            plugins: plugs
        }
        
    },
    /**
     * Vue CLI 内部的 webpack 配置是通过 webpack-chain (链式操作)维护的。这个库提供了一个 webpack 原始
     * 配置的上层抽象，使其可以定义具名的 loader 规则和具名插件，并有机会在后期进入这些规则并对它们的选项进
     * 行修改。
     */
    chainWebpack: (config)=>{
        // 降低带宽压力
        config.plugins.delete('prefetch');
        config.plugins.delete('preload');
        config.plugins.delete('named-chunks');

        config.plugin('html').tap(args => {
            // 多页面指定某种script标签引入排序规则
            args[0].chunksSortMode = 'none';

            args[0].cdn = cdn;
            // 用于页面资源压缩
            // https://github.com/kangax/html-minifier#options-quick-reference
            args[0].minify = {
                removeComments: true, // 清理html注释
                collapseWhitespace: true, // 清理html空格换行符
                useShortDoctype: true, // doctype用短 (HTML5) 文档类型替换
                removeEmptyAttributes: true, // 删除所有具有纯空格值的属性
                removeStyleLinkTypeAttributes: true, // 去掉style和link标签的type属性。
                keepClosingSlash: true, // 在单例元素上保留斜杠
                minifyJS: true, // 压缩html内的js
                minifyCSS: true, // 压缩html内的css
                minifyURLs: true, // 缩小各种属性中的 URL
            };

            return args;
        });
        // 根据不同的策略来分割打包出来的bundle
        config.optimization.splitChunks({
            chunks: 'all', // 同时分割同步和异步代码
            // 缓存策略，默认设置了分割node_modules和公用模块
            // 默认的规则不会打包,需要单独定义
            cacheGroups: {
                vendors: {
                    name: 'chunk-vendors', // 重写文件名称
                    test: /[\\/]node_modules[\\/]/, // 匹配规则
                    priority: 10, // 优先级
                    chunks: 'initial', // 同时打包同步和异步，但是异步内部的引入不再考虑，直接打包在一起
                },
                commons: {
                    name: 'chunk-commons',
                    test: resolve('src/components'),
                    minChunks: 3, // 重写公用chunks的次数
                    priority: 5,
                    reuseExistingChunk: true, // 是否复用存在的chunk
                },
            },
        });
        // 把runtime部分的代码抽离出来单独打包
        config.optimization.runtimeChunk('single');
    },
    css: {
        // 是否将组件中的 CSS 提取至一个独立的 CSS 文件中 (而不是动态注入到 JavaScript 中的 inline 代码)。
        extract: false,
        requireModuleExtension: false,
        sourceMap: isDev,
        loaderOptions: {}
    },
    devServer: {
        open: true,
        hot: true,
        hotOnly: false,
        compress: true
    }
}