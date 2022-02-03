import com.ch.dao.UserDaoOracleImpl;
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
 * 时间：2022/1/30 16:01
 * 开发名称：MyTest
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */

public class MyTest {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoOracleImpl());
        userService.getUser();
    }
    @Test
    public void Test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl oracleImpl = (UserServiceImpl) context.getBean("userServiceImpl");
        oracleImpl.getUser();
    }
}