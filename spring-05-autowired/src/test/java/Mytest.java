import com.ch.pojo.Person;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2022/1/31 14:29
 * 开发名称：Mytest
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */

public class Mytest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person people = context.getBean("people", Person.class);
        System.out.println(people);
        people.getCat().shout();
        people.getDog().shout();
    }
}