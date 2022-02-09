export const lazyView = (view) => {
    // 使用[request]来告诉webpack，这里的值由传入的字符串来决定
    // https://blog.csdn.net/javao_0/article/details/85162458
    return () => import(/* webpackChunkName: "[request]" */ `../views/${view}.vue`);
};