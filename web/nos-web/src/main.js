// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
// 引入ElementUI组件
import "./utils/elementui"
// 引入全局css样式
import global from '../static/css/global.css'
Vue.config.productionTip = false
// 引入store.js
import store from './store/store'
import "./utils/adaption"

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  store,
  components: { App },
  template: '<App/>'
})
