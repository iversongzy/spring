import org.lgt.bilibilispring.ioc.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author liuguotai
 * @Date2020/11/16 23:33
 **/
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/bilibili-spring-bean.xml");
        User user = context.getBean("user", User.class);
        user.hello();
    }
}
