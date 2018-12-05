import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
//        Hello hello=new Hello();
//        hello.setMessage("Spring");
//        hello.getMessage();
//        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
//        Hello hello=(Hello)context.getBean("hello");
        //ApplicationContext context=new FileSystemXmlApplicationContext("src/Beans.xml");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans_2.xml");

        Hello initHello = (Hello) context.getBean("initHello");
        initHello.getMessage();
        Hello destroyHello = (Hello) context.getBean("destructHello");
        destroyHello.getMessage();
        context.registerShutdownHook();
    }
}
