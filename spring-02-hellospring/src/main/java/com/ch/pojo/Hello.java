/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2022/1/30 16:45
 * 开发名称：Hello
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package com.ch.pojo;

public class Hello {
    private String name;

    public String getName() {
        return name;
    }
    /**必须要有set方法，在beans配置文件中property设值会调用类的set方法*/
    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("Hello"+name);
    }
}