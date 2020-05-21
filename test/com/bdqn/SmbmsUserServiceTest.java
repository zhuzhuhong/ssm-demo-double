package com.bdqn;

import com.bdqn.service.SmbmsUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mo
 * @Description: 测试类
 * @date 2020-05-21 18:06
 */

public class SmbmsUserServiceTest {

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

}
