/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2022/2/2 12:25
 * 开发名称：AnnotationPointCut
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package com.ch.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**标注为切面*/
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.ch.annotation.UserService.*(..))")
    public void before(){
        System.out.println("--------方法执行前--------");
    }
    @After("execution(* com.ch.annotation.UserService.*(..))")
    public void after(){
        System.out.println("--------方法执行后--------");
    }
    /**在软绕增强种，我们可以给顶一个参数，代表我们要获取处理切入的点*/
    @Around("execution(* com.ch.annotation.UserService.*(..))")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        /*获得签名*/
        System.out.println(pjp.getSignature());
        /*执行方法*/
        System.out.println("环绕前");
        pjp.proceed();
        System.out.println("环绕后");
    }
}