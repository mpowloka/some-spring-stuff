package P05;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainController {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("configs\\Beans-P05.xml");
        CollectionsContainer cc = (CollectionsContainer)context.getBean("collectionsContainer");

        cc.getList();
        cc.getMap();
        cc.getProps();
        cc.getSet();
    }
}
