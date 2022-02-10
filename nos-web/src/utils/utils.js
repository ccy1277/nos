import { setLsItem, getLsItem } from "./store";
import { USER_KEY, TOKEN_KEY } from "../config";

export const setUser = (user)=>{
    setLsItem(USER_KEY, user);
};

export const getUser = ()=>{
    return getLsItem(USER_KEY);
}  

export const lazyView = (view) => {
    // 使用[request]来告诉webpack，这里的值由传入的字符串来决定
    // https://blog.csdn.net/javao_0/article/details/85162458
    return () => import(/* webpackChunkName: "[request]" */ `../views/${view}.vue`);
};