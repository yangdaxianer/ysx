package com.ysx.handle;

import com.ysx.exception.UserException;
import com.ysx.utils.JsonResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public JsonResult handle(Exception e){
        if(e instanceof UserException){
            UserException userException = (UserException) e;
            System.out.println(((UserException) e).getCode());
            return new JsonResult(userException.getCode(), userException.getMessage());
        }else{
            return new JsonResult(-1, "未知错误");
        }
    }
}
