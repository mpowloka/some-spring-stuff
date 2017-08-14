package P06;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainController {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("configs\\Beans-P06.xml");
        context.start();

        HelloWorld hello = (HelloWorld) context.getBean("helloWorld");
        hello.getMessage();

        context.stop();

    }
}
