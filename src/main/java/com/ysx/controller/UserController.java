package com.ysx.controller;


import com.ysx.enums.UserEnum;
import com.ysx.exception.UserException;
import com.ysx.model.User;
import com.ysx.service.UserService;
import com.ysx.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public JsonResult addUser(){
        User user = new User();
        user.setUsername("admin");
        user.setPassword("admin");
        return new JsonResult(0, "", user);
    }

    @RequestMapping("/findOne")
    public JsonResult findOne(){
        User one = userService.findOne(1);
        return new JsonResult(0, "", one);
    }

    @RequestMapping("/findAll")
    public JsonResult allUser(){
//        throw new UserException(UserEnum.JAVA);
//        List<User> users = userService.findAll();
        return new JsonResult(0,"",userService.findAll()) ;
    }

    @RequestMapping("/update")
    public JsonResult update(){
        User user = new User();
        user.setId(3);
        user.setUsername("yangboss");
        user.setPassword("666");
        return new JsonResult(0,"",userService.update(user));
    }
}
