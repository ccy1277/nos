import { BASE_URL } from "../config";
// 登录
export const LOGIN = BASE_URL + '/sys/v1/login';
// 查询所有用户信息
export const USERS = BASE_URL + 'sys/v1/users';
// 查询月票量
export const MONKETS = BASE_URL + '/sys/v1/monkets';
// 查询收藏量
export const STARS = BASE_URL + '/sys/v1/stars';
// 查询点击量
export const CLICKS = BASE_URL + '/sys/v1/clicks';
// 按条件查询所有小说信息
export const NOVELS = BASE_URL + '/sys/v1/novels';
// 查询所有通知
export const NOTICES = BASE_URL + '/sys/v1/notices';
// 发布不同
export const SET_NOTICE = BASE_URL + '/sys/v1/setNotice'