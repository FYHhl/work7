import com.teledu.service.impl.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserTest {

    ClassPathXmlApplicationContext application;
    @Before
    public void before(){
        //读取配置文件
        application=new ClassPathXmlApplicationContext("applicationContext.xml");

    }

    @Test
    public void getUser(){

//        UserServiceImpl userService=new UserServiceImpl();
//        userService.getUserById();
       //  UserServiceImpl userService = (UserServiceImpl)application.getBean("userService");
        //获取bean，实例化UserServiceImpl
        UserServiceImpl userService = application.getBean("userService", UserServiceImpl.class);
        userService.getUserById();
    }
    @Test
    public void getUser1(){
        UserServiceImpl1 userService1 = application.getBean("userService1", UserServiceImpl1.class);
        userService1.getUserById();
    }

    @Test
    public void singleton(){
        UserServiceImpl2 userService = application.getBean("userService2", UserServiceImpl2.class);
        UserServiceImpl2 userService1 = application.getBean("userService2", UserServiceImpl2.class);
        userService.getUserById();
        userService1.getUserById();
    }

    @Test
    public void byName(){
        //获取bean，实例化UserServiceImpl
        UserServiceImpl3 userService = application.getBean("userService3", UserServiceImpl3.class);
        userService.getUserById();
    }
    @Test
    public void byType(){
        //获取bean，实例化UserServiceImpl
        UserServiceImpl4 userService = application.getBean("userService4", UserServiceImpl4.class);
        userService.getUserById();
    }
    @Test
    public void lifecycle(){
        //获取bean，实例化UserServiceImpl
        UserServiceImpl5 userService = application.getBean("userService5", UserServiceImpl5.class);
        userService.getUserById();
        application.destroy();
    }
    @Test
    public void lazy(){
        //获取bean，实例化UserServiceImpl
//        UserServiceImpl6 userService = application.getBean("userService6", UserServiceImpl6.class);
//        userService.getUserById();
    }
}
