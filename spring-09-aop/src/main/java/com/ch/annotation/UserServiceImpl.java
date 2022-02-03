/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2022/2/1 21:20
 * 开发名称：UserServiceImpl
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package com.ch.annotation;

public class UserServiceImpl implements UserService {
    @Override
    public void add_() {
        System.out.println("增加了一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void select() {
        System.out.println("查询了一个用户");
    }

    @Override
    public void update() {
        System.out.println("更新了一个用户");
    }
}