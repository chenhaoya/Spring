/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2022/1/30 20:06
 * 开发名称：User
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package com.ch.pojo;

public class User {
    public String name;

    public User(String name2222){
        this.name = name2222;
        System.out.println("User的有参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name2222) {
        this.name = name2222;
    }

    public void show(){
        System.out.println("name"+ name);
    }
}