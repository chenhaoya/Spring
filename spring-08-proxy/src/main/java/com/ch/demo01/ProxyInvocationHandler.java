/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2022/2/1 16:44
 * 开发名称：ProxyInvocationHandler
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package com.ch.demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**自动生成代理类*/
public class ProxyInvocationHandler implements InvocationHandler {

    /**被代理的接口*/
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Object getProxy(){
        /*获取代理实例
        * 参数：
              loader - 定义代理类的类加载器
              interfaces - 代理类要实现的接口列表
              h - 指派方法调用的调用处理程序   InvocationHandler
          返回：
              一个带有代理类的指定调用处理程序的代理实例，它由指定的类加载器定义，并实现指定的接口
        * */
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    /**处理代理实例，并返回结果*/
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        /*动态代理的本质就是反射机制实现的*/
        see();
        /* rent：被代理的接口*/
        Object result = method.invoke(rent, args);
        log(method.getName());
        return result;
    }
    public void log(String name){
        System.out.println(name+"被执行了");
    }
    public void see(){
        System.out.println("中介带看房子");
    }
}