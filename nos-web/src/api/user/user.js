import { LOGIN, USERS } from "../api";
import { request } from "../../utils/request";

export function login(params, success, error){
    request(LOGIN, 'post', params, success, error);
}

export  function getUserMsg(params, success, error){
    request(USERS + '/id', 'get', params, success, error);
}
