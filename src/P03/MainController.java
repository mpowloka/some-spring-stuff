package P03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainController {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config\\Beans-P03.xml");

        Phone phone = (Phone)context.getBean("phone");

        SmartPhone smartPhone = (SmartPhone)context.getBean("smartPhone");

        phone.call();
        smartPhone.call();
        smartPhone.takeAPhoto();

    }

}
