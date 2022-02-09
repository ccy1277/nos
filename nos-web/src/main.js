import Vue from 'vue'
import App from './App.vue'
import store from './store'
import config from './config'
import router from './router'
import './assets/css/common.css'

// 全局注册应用配置
Vue.prototype.$config = config;
Vue.config.productionTip = false;

// vue错误处理
Vue.config.errorHandler = function (){
    Vue.nextTick(()=>{
      console.log(err);
    })
}

new Vue({
  el: "#app",
  router,
  store,
  render: h => h(App),
})