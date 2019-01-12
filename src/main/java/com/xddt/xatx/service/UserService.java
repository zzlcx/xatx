package com.xddt.xatx.service;

import com.xddt.xatx.bean.User;

public interface UserService {

    //userName获取user
    public User getUserByUserName(String userName);

    public int deleteUserById(Integer userId);
}
