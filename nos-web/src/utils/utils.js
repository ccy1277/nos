import { setLsItem, getLsItem } from "./store";
import { USER_KEY, MSG_KEY } from "../config";

export const setUser = (user)=>{
    setLsItem(USER_KEY, user);
};

export const getUser = ()=>{
    return getLsItem(USER_KEY);
}

export const setMsg = (msg)=>{
    setLsItem(MSG_KEY, msg);
}

export const getMsg = ()=>{
    return getLsItem(MSG_KEY);
}

// 要使用函数来返回用户是否登录 （用变量返回登录状态时，导航守卫难以拿到变化后的登录状态(maybe)）
export const ifLogin = ()=>{
    return (getUser()!==null) ? true: false;
    
}

export const lazyView = (view) => {
    // 使用[request]来告诉webpack，这里的值由传入的字符串来决定
    // https://blog.csdn.net/javao_0/article/details/85162458
    return () => import(/* webpackChunkName: "[request]" */ `../views/${view}.vue`);
};