import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
//        Hello hello=new Hello();
//        hello.setMessage1("Spring");
//        hello.getMessage1();
//        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
//        Hello hello=(Hello)context.getBean("hello");
        //ApplicationContext context=new FileSystemXmlApplicationContext("src/Beans.xml");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Hello hello = (Hello) context.getBean("hello");
        hello.getMessage1();
        hello.getMessage2();

        HelloIndia helloIndia = (HelloIndia) context.getBean("helloIndia");
        helloIndia.getMessage1();
        helloIndia.getMessage2();
        helloIndia.getMessage3();
    }
}
