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
    ],
    /**
     * 信息管理组件 table中prop,label,width属性的设置
     */

    msgColumns: {
        novelColumns: [{
            prop: 'id',
            label: 'id',
            width: '70'
        },{
            prop: 'name',
            label: '名字',
        },{
            prop: 'update_time',
            label: '最新更新时间'
        },{
            prop: 'list',
            label: '榜单'
        },{
            prop: 'cat',
            label: '分类'
        },{
            prop: 'author',
            label: '作者'
        },{
            prop: 'status',
            label: '状态',
            width: '70'
        },{
            prop: 'intro',
            label: '简介'
        }],
        userColumns: [{
            prop: 'id',
            label: '用户名'
        },{
            prop: 'sex',
            label: '性别'
        },{
            prop: 'age',
            label: '年龄'
        },{
            prop: 'phone',
            label: '电话'
        },{
            prop: 'email',
            label: '邮箱'
        },{
            prop: 'role',
            label: '身份'
        },{
            prop: 'join_time',
            label: '注册时间'
        },{
            prop: 'city',
            label: '地区'
        }]
    }
}

export const USER_KEY = 'user';
export const MSG_KEY = 'msg';
export const BASE_URL = 'http://localhost:8001/';