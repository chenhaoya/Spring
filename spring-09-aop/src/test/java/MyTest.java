import com.ch.service.UserService;
import com.ch.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2022/2/2 11:11
 * 开发名称：MyTest
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*动态代理的是接口：注意点*/
        UserService bean = context.getBean("userService" , UserService.class);
        bean.add_();
    }
    @Test
    public void diyTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        com.ch.annotation.UserService bean = context.getBean("userService2" , com.ch.annotation.UserService.class);
        bean.add_();
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}