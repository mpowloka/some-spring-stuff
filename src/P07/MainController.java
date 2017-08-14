package P07;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainController {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("configs\\Beans-P07.xml");

        CustomEventPublisher publisher = (CustomEventPublisher) context.getBean("customEventPublisher");

        publisher.publish();
    }
}
