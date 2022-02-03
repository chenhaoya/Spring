/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2022/2/1 12:11
 * 开发名称：MyConfig
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package com.ch.config;

import com.ch.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**被Spring容器托管，注册到容器中，本事也是一个@Component
 * ，@Configuration代表这是一个配置类，就和beans.xml一样 */
@Configuration
/**包扫描*/
@ComponentScan("com.ch.pojo")
/**引入另一个配置文件*/
@Import(MyConfig2.class)
public class MyConfig {
    /**
     * 注册一个bean，相当于我们之前写的一个bean标签
     * 这个方法的名字，相当于bean标签中的id属性
     * 这个方法的返回值，相当于bean标签中的class属性
     * */
    @Bean()
    public User myUser(){
        return new User();
    }
}