package com.miaoshaproject.controller;

import com.miaoshaproject.service.UserService;
import com.miaoshaproject.service.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: miaosha
 * @description: user controller
 * @author: jackingTec
 * @create: 2023/01/13 08:36
 **/

@Controller("user")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    @ResponseBody
    public UserModel getUser(@RequestParam(name="id")Integer id){
        // 调用server服务获取对应id的用户对象并返回给前端
        UserModel userModel = userService.getUserById(id);
        return userModel;
    }
}
