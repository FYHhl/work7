package com.teledu.service.impl;

import com.teledu.dao.IUserDao;
import com.teledu.model.User;
import com.teledu.service.IUserService;
import lombok.Setter;

import java.util.List;
import java.util.Map;
import java.util.Set;


public class UserServiceImpl implements IUserService {

    @Setter
    private IUserDao userDao;
    @Setter
    private Integer age;
    @Setter
    private List<String> strList;
    @Setter
    private Set<String> strSet;
    @Setter
    private Map<String,String> strMap;

    @Override
    public User getUserById() {
        int id=1;
        User user = userDao.getUserById(id);
        System.out.println("service层调用");
        System.out.println("id="+user.getId());
        System.out.println(this.age);
        return user;
    }
}
