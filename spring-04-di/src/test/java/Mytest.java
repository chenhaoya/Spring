import com.ch.pojo.Student;
import com.ch.pojo.User;
import com.ch.pojo.User2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2022/1/31 10:55
 * 开发名称：Mytest
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */

public class Mytest {
    @Test
    public void test_() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }

    @Test
    public void test_user_P() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_p.xml");
        User user = context.getBean("user_p", User.class);
        System.out.printf(user.toString());
    }

    @Test
    public void test_user2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("user2beans.xml");
        User2 user2 = context.getBean("user2", User2.class);
        System.out.println(user2);
    }

    @Test
    public void test_user_C() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_c.xml");
        User user = context.getBean("user_c", User.class);
        User user2 = context.getBean("user_c", User.class);
        System.out.println(user);
        System.out.println(user==user2);
    }
}