package com.xddt.xatx.service.impl;

import com.xddt.xatx.bean.User;
import com.xddt.xatx.dao.UserMapper;
import com.xddt.xatx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userDao;

    @Override
    public User getUserByUserName(String userName) {
        return userDao.getUserByUserName(userName);
    }

    @Override
    public int deleteUserById(Integer userId) {
        return userDao.deleteByPrimaryKey(userId);
    }
}
