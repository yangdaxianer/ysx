package com.ysx.exception;

public enum UserEnum {
    UNKNOWN_ERROR(-1,"未知错误"),
    SUCESS(0,"成功"),
    JAVA(100,"你在学java"),
    PHP(101,"你在学php"),;

    private Integer code;
    private String msg;

    UserEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public Integer getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }
}
