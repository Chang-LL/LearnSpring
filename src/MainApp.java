import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context
                = new ClassPathXmlApplicationContext("Beans.xml");
        context.start();
        Hello hello=(Hello)context.getBean("hello");
        hello.getMessage();
        context.stop();
    }
}
