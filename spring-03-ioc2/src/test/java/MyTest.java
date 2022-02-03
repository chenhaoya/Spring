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
 * 时间：2022/1/30 20:07
 * 开发名称：MyTest
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User show = (User) context.getBean("shdofisj");
        show.show();
    }
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User2 user2 = (User2) context.getBean("u2");
        System.out.println(user2.getName());
    }
}