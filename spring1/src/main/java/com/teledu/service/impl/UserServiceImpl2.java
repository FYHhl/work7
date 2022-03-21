package com.teledu.service.impl;

import com.teledu.dao.IUserDao;
import com.teledu.model.User;
import com.teledu.service.IUserService;



public class UserServiceImpl2 implements IUserService {

    private IUserDao userDao;

    UserServiceImpl2(IUserDao userDao){
        System.out.println("我创建了.....方式是singleton");
        this.userDao=userDao;
    }

    @Override
    public User getUserById() {
        int id=2;
        User user = userDao.getUserById(id);
        System.out.println("service层第二次调用");
        System.out.println("id="+user.getId());
        return user;
    }
}
