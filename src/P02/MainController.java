package P02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainController {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("configs\\Beans-P02.xml");

        Messenger mess = (Messenger) context.getBean("messenger");
        mess.showMessage();
        context.registerShutdownHook();

    }
}
