package com.miaoshaproject.service.impl;

import com.miaoshaproject.dao.UserDoMapper;
import com.miaoshaproject.dao.UserPasswordDOMapper;
import com.miaoshaproject.dataobject.UserDo;
import com.miaoshaproject.service.UserService;
import com.miaoshaproject.service.model.UserModel;
import com.miaoshaproject.dataobject.UserPasswordDO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: miaosha
 * @description: implement of userservice
 * @author: jackingTec
 * @create: 2023/01/13 08:42
 **/

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDoMapper userDoMapper;

    @Autowired
    private UserPasswordDOMapper userPasswordDOMapper;

    @Override
    public UserModel getUserById(Integer id) {
        // 调用userdomapper获取到对应的用户dataobject
        UserDo userDo = userDoMapper.selectByPrimaryKey(id);
        if(userDo == null){
            return null;
        }
        // 通过用户id获取对应的用户加密密码信息
        UserPasswordDO userPasswordDO = userPasswordDOMapper.selectByUserId(userDo.getId());
        return converFromDataObject(userDo, userPasswordDO);
    }

    private UserModel converFromDataObject(UserDo userDo, UserPasswordDO userPasswordDo){
        if(userDo == null){
            return null;
        }
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userDo, userModel);

        if(userPasswordDo != null){
            userModel.setEncrptPassWord(userPasswordDo.getEncrptPassword());
        }
        return userModel;
    }
}
