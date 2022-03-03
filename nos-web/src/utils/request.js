import axios from 'axios'
import router from '../router'
import config from '../config'
const Qs = require('qs')
export const instance = axios.create({
    timeout: 10 * 1000,
    // 请求头可以携带cookie
    // withCredentials: true,
    headers: {
        'Content-Type': 'application/json; charset=utf-8',
        'X-Requested-With': 'XMLHttpRequest'
    }
});

// response 拦截器
instance.interceptors.response.use(
    response => {
        // console.log(response.config.url)
        // console.log(response.data)
        return response;
    },
    err => {
        return Promise.reject(err);
    }
);
export const  request =  (url, method, params, success, error)=>{
    return  instance({
        url: url,
        method: method,
        params: params,
        paramsSerializer: function(params) {
            return Qs.stringify(params, {arrayFormat: 'brackets'})
          },
        auth: params.auth
    }).then(success).catch(error);
}


