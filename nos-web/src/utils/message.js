import {Message} from 'element-ui'

export const duration = 1200;
export const errDuration = 2000;

export const info = (msg) => {
    Message({
        message: msg,
        type: 'info',
        duration: duration
    });
};

export const success = (msg) => {
    Message({
        message: msg,
        type: 'success',
        duration: duration
    });
};

export const warning = (msg) => {
    Message({
        message: msg,
        type: 'warning',
        duration: duration
    });
};

export const error = (msg) => {
    Message({
        message: msg,
        type: 'error',
        duration: errDuration
    });
};