import { LOGIN } from "../api";
import { request } from "../../utils/request";

export function login(params, success, error){
    request(LOGIN, 'post', params, success, error);
}