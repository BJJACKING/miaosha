package com.miaoshaproject.service.model;

import lombok.Data;

/**
 * @program: miaosha
 * @description: user model
 * @author: jackingTec
 * @create: 2023/01/13 08:48
 **/

@Data
public class UserModel {
    private Integer id;
    private String name;
    private Byte gender;
    private Integer age;
    private String telphone;
    private String registerMode;
    private String thirdPartId;
    private String encrptPassWord;
}
