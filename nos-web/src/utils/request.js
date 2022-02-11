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

export const request = (url, method, params, success, error)=>{
    return instance({
        url: url,
        method: method,
        params: params,
        paramsSerializer: function(params) {
            return Qs.stringify(params, {arrayFormat: 'brackets'})
          },
        auth: params.auth
    }).then(success).catch(error);
}


