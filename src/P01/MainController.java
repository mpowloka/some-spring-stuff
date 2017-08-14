package P01;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainController {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("configs\\Beans-P01.xml");
        Messenger mess = (Messenger) context.getBean("messenger");

        mess.setMessage("Hello world!");
        mess.showMessage();
        context.registerShutdownHook();

    }

}
