package com.teledu.service.impl;

import com.teledu.dao.IUserDao;
import com.teledu.model.User;
import com.teledu.service.IUserService;
import lombok.Setter;


public class UserServiceImpl5 implements IUserService {

    @Setter
    private IUserDao userDao;

    @Override
    public User getUserById() {
        int id=5;
        User user = userDao.getUserById(id);
        System.out.println("service层调用");
        System.out.println("id="+user.getId());
        return user;
    }
    //init初识化方法
    public void init(){
//        System.out.println("我被初始化了");
    }
    //destroy销毁方法
    public void destroy(){
//        System.out.println("我被销毁了");
    }
}
