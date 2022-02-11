export default {
    /**
     * 配置显示在浏览器标签的title
     */
    title: 'nos-web',
    /**
     * 默认打开的首页的路由name值，默认为home
     */
    homeName: 'home',
    /**
     * 默认打开的登录的路由name值，默认为login
     */
    loginName: 'login',
    /**
     * 默认导航路由的name、title值
     */
    navMenu: [
        {name: 'home', title: '首页', icon: 'el-icon-house'},
        {name: 'message', title: '信息管理', icon: 'el-icon-document'},
        {name: 'content', title: '内容管理', icon: 'el-icon-news'},
        {name: 'information', title: '通知管理', icon: 'el-icon-chat-square'},
        {name: 'power', title: '权限管理', icon: 'el-icon-key'},
    ]
}

export const USER_KEY = 'user';
export const TOKEN_KEY = 'token';
export const BASE_URL = '';