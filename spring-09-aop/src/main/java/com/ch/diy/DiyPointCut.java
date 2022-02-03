/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2022/2/2 11:35
 * 开发名称：DiyPointCut
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package com.ch.diy;

public class DiyPointCut {
    public void before(){
        System.out.println("#==========方法执行前=========#");
    }
    public void after(){
        System.out.println("#==========方法执行后=========#");
    }
}