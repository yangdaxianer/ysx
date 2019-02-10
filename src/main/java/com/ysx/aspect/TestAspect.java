package com.ysx.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Component
@Aspect
public class TestAspect {

    @Before("execution(* com.ysx.controller.UserController.*(..))")
    //所有返回类型，com.ysx.controller.UserController包下的所有类中的所有方法（参数任意）
    public void before(JoinPoint joinPoint){
           System.out.println("前置增强");

        ServletRequestAttributes attributes =
                (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
// url
        System.out.println(request.getRequestURL());
// method
        System.out.println(request.getMethod());
// ip
        System.out.println(request.getRemoteAddr());
// 类-方法 需要参数 JoinPoint
        System.out.println(joinPoint.getSignature().getDeclaringTypeName()+"-"+joinPoint.getSignature().getName());
// 参数
        System.out.println(joinPoint.getArgs());
    }
}
