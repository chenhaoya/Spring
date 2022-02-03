import com.ch.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2022/1/30 16:55
 * 开发名称：MyTest
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */

public class MyTest {
    public static void main(String[] args) {
        /**获取Spring上下文对象*/
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        /**我们的对象现在都在Spring中管理了，使用直接到里面取出来即可*/
        Hello hello = (Hello)context.getBean("hello");
        hello.show();
    }
}