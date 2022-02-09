import Vue from 'vue'
import VueRouter from 'vue-router'
import {mainRouter} from "./routers"

Vue.use(VueRouter);

const router = new VueRouter({
    mode: 'hash',
    addFlag: false,
    routes: mainRouter
});

export default router