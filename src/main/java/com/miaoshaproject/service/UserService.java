package com.miaoshaproject.service;

import com.miaoshaproject.service.model.UserModel;

/**
 * @program: miaosha
 * @description: user service
 * @author: jackingTec
 * @create: 2023/01/13 08:42
 **/

public interface UserService {
    // 通过用户ID获取用户对象的方法
    UserModel getUserById(Integer id);
}
