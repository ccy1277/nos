import {lazyView} from '../utils/utils'


const main = 'main/main';
const home = 'content/home';
const login = 'login/login';
const content = 'content/content';
const message = 'content/message';
const power = 'content/power';
const information = 'content/information'

// 固定路由
export const constRouter = [
    {
        path: '/login',
        name: 'login',
        component: lazyView(login),
        meta: {
            title: '登录'
        }
    }
]

// main路由
export const mainRouter = [
    {
        path: '/',
        name: 'main',
        component: lazyView(main),
        redirect: {name: 'home'},
        meta: {
            title: 'main'
        },
        children: [
            {
                path: '/home',
                name: 'home',
                component: lazyView(home),
                meta: {
                    title: '首页'
                }
            },
            {
                path: '/message',
                name: 'message',
                component: lazyView(message),
                meta: {
                    title: '信息管理'
                }
            },
            {
                path: '/content',
                name: 'content',
                component: lazyView(content),
                meta: {
                    title: '内容管理'
                }
            },{
                path: '/information',
                name: 'information',
                component: lazyView(information),
                meta: {
                    title: '通知管理'
                }
            },
            {
                path: '/power',
                name: 'power',
                component: lazyView(power),
                meta: {
                    title: '权限管理'
                }
            }
        ]
    }
];