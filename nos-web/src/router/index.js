import Vue from 'vue'
import VueRouter from 'vue-router'
import {constRouter, mainRouter} from "./routers"
import config from '../config'
import {ifLogin} from '../utils/utils'

Vue.use(VueRouter);

//以下代码解决路由地址重复点击的报错问题
const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
const originalPushs = VueRouter.prototype.replace
VueRouter.prototype.replace = function replace(location) {
  return originalPushs.call(this, location).catch(err => err)
}

const router = new VueRouter({
    mode: 'hash',
    ifLogin: false,
    routes: mainRouter.concat(constRouter)
});

router.beforeEach((to, from, next)=>{
  // 是否登录
  if(config.loginName === to.name || ifLogin()){
    next();
  }else{
    next({name: config.loginName});
  }
});

export default router