package com.bdqn;

import com.bdqn.service.SmbmsUserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author mo
 * @Description: 测试类
 * @date 2020-05-21 18:06
 */

public class SmbmsUserServiceTest {
    private SmbmsUserService smbmsUserService = null;
    private static final Logger log = LogManager.getLogger(SmbmsUserServiceTest.class);

    @Before
    public void before() {
        smbmsUserService = new ClassPathXmlApplicationContext("applicationContext.xml")
                .getBean(SmbmsUserService.class);
    }

    @After
    public void after() {
        //GC
        smbmsUserService = null;
    }

    @Test
    public void testCustomUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取CustomUser实例对象
        CustomUser user = context.getBean(CustomUser.class);
        //
        user.setName("张三");
        String name = user.getName();
        //从user对象中取出空的smbmsRole对象
        SmbmsRole smbmsRole = user.getSmbmsRole();
        //给取出来的smbmsRole对象属性赋值
        smbmsRole.setRoleCode("Admin");
        smbmsRole.setRoleName("管理员");


        System.out.println(name);
        System.out.println(user.getSmbmsRole().getId());
        System.out.println("用户角色名："+user.getSmbmsRole().getRoleName());
    }

    @Test
    public void testAopBefore() {
        SmbmsUser smbmsUser = new SmbmsUser();
        smbmsUser.setUserCode("Admin");
        smbmsUser.setUserName("管理员");
    }

    @Test
    public void testGetUserList() {
        List<SmbmsUser> userList = smbmsUserService.getUserList();
        userList.forEach(smbmsUser -> log.info(smbmsUser));
    }

}
