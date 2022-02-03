/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2022/2/1 16:42
 * 开发名称：Host
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package com.ch.demo01;

public class Host implements Rent{

    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }

    @Override
    public void aaa() {
        System.out.println("aaaa");
    }
}