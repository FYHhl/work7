package com.teledu.service.impl;

import com.teledu.dao.IUserDao;
import com.teledu.model.User;
import com.teledu.service.IUserService;
import lombok.Setter;




public class UserServiceImpl3 implements IUserService {

    @Setter
    private IUserDao userDao;


    @Override
    public User getUserById() {
        int id=3;
        User user = userDao.getUserById(id);
        System.out.println("service层调用");
        System.out.println("id="+user.getId());
        return user;
    }
}
