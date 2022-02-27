export const setLsItem = (key, value)=>{
    value = JSON.stringify(value);
    window.sessionStorage.setItem(key, value);
}

export const getLsItem = (key)=>{
    return JSON.parse(window.sessionStorage.getItem(key));
}

export const removeLsItem = (key)=>{
    window.sessionStorage.removeItem(key);
}

export const clearLsItem = ()=>{
    window.sessionStorage.clear();
}