import Vue from 'vue'
import VueRouter from 'vue-router'
import {constRouter, mainRouter} from "./routers"
import config from '../config'

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

let loginName = config.loginName;
router.beforeEach((to, from, next)=>{
    if(loginName === to.name || router.options.ifLogin){
      console.log(112);
      next();
    }else{
      router.options.ifLogin = true;
      console.log(222);
      next({name: loginName});
    }
});

export default router