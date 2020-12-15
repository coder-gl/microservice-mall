package com.mall.mallbase.controller;

import com.mall.mallbase.model.UserModel;
import com.mall.mallbase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getName")
    public String getUserName(){
        String name = userService.getUserName();
        return name;
    }

    @RequestMapping(value = "/getModel")
    public UserModel getUserModel(){
        UserModel userModel = userService.getUserModel();
        return  userModel ;
    }
}
