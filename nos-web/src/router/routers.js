import {lazyView} from '../utils/utils'

const main = 'main/main';
const home = 'content/home';
const login = 'login/login'

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
            }
        ]
    }
];