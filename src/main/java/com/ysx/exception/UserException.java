package com.ysx.exception;

import com.ysx.exception.UserEnum;



public class UserException extends RuntimeException {

    private Integer code;

    public UserException(UserEnum userEnum) {
        super(userEnum.getMsg());
        this.code = userEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
