package com.ysx.utils;

public class JsonResult<T>{

    private Integer code;
    private String msg;
    private T data;

    public JsonResult(){}

    public JsonResult(Integer code, String message) {
        this.code = code;
        this.msg = message;
    }
    public JsonResult(Integer code, String message,T data){
        this.code = code;
        this.msg = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }

}
