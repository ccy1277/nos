export const setLsItem = (key, value)=>{
    value = JSON.stringify(value);
    window.sessionStorage.setItem(key, value);
}

export const getLsItem = (key)=>{
    return JSON.parse(window.sessionStorage.getItem(key));
}