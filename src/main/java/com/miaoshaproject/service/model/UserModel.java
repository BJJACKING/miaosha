package com.miaoshaproject.service.model;

import lombok.Data;

/**
 * @program: miaosha
 * @description: user model
 * @author: jackingTec
 * @create: 2023/01/13 08:48
 **/


public class UserModel {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getRegisterMode() {
        return registerMode;
    }

    public void setRegisterMode(String registerMode) {
        this.registerMode = registerMode;
    }

    public String getThirdPartyId() {
        return thirdPartyId;
    }

    public void setThirdPartyId(String thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
    }

    public String getEncrptPassWord() {
        return encrptPassWord;
    }

    public void setEncrptPassWord(String encrptPassWord) {
        this.encrptPassWord = encrptPassWord;
    }

    private String name;
    private Byte gender;
    private String age;
    private String telphone;
    private String registerMode;
    private String thirdPartyId;

    private String encrptPassWord;
}
