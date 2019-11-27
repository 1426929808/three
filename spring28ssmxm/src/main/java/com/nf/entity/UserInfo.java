package com.nf.entity;

import lombok.Data;

import org.springframework.beans.BeanUtils;

@Data
public class UserInfo {
    private Integer id;
    private String name;
    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo();

//        userInfo.setId(1);
//        userInfo.setName("abc");

        MyUserInfo myUserInfo = new MyUserInfo();

        BeanUtils.copyProperties(userInfo, myUserInfo);
        System.out.println("-----debug: myUserInfo = " + myUserInfo);
    }
}
class MyUserInfo{
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyUserInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
