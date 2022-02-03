/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2022/1/31 20:30
 * 开发名称：User
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package com.ch.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**等价与：<bean id="user" class="com.ch.pojo.User"/>*/
/**Component 组件*/
@Component("userp")
@Scope("prototype")
public class User {
    /**等价于：<property name="name" value="ch"/>
     * 也可以放在set方法上
     * */
    @Value("ch")
    public String name;
}