import {lazyView} from '../utils/utils'

const main = 'main/main'

// main路由
export const mainRouter = [
    {
        path: '/',
        name: 'main',
        component: lazyView(main),
        meta: {
            title: '首页'
        }
    }
];