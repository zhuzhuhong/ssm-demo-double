package com.bdqn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author mo
 * @Description: 自定义实体类
 * @date 2020-05-14 18:29
 */
@Component
public class CustomUser {

    private Long id;
    private String name;
    private int age;

    @Autowired
    private SmbmsRole smbmsRole;

    @Override
    public String toString() {
        return "CustomUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", smbmsRole=" + smbmsRole +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SmbmsRole getSmbmsRole() {
        return smbmsRole;
    }

    public void setSmbmsRole(SmbmsRole smbmsRole) {
        this.smbmsRole = smbmsRole;
    }
}
