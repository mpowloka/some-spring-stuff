package P04;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainController {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("configs\\Beans-P04.xml");

        TextEditor editor = (TextEditor) context.getBean("textEditor");
        editor.runSpellChecker();

    }

}
