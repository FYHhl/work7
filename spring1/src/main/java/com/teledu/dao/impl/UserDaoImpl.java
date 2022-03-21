package com.teledu.dao.impl;

import com.teledu.dao.IUserDao;
import com.teledu.model.User;

public class UserDaoImpl implements IUserDao {
    UserDaoImpl(){
        System.out.println("UserDaoImpl被创建了");
    }
    @Override
    public User getUserById(Integer id) {
        User user=new User();
        user.setUsername("于淼");
        user.setId(id);
        System.out.println("这是一次查询操作");
        return user;
    }
}
