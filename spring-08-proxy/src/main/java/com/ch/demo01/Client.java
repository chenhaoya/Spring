/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2022/2/1 16:58
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package com.ch.demo01;

public class Client {
    public static void main(String[] args) {
        /*真实角色*/
        Host host = new Host();
        /*代理角色:现在没有*/
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        /*通过调用程序处理角色来处理，我们要调用的接口对象*/
        pih.setRent(host);
        /*创建代理类*/
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
        proxy.aaa();
    }
}