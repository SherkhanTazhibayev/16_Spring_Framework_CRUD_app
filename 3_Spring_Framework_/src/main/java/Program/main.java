package Program;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Factory factory = context.getBean("factory", Factory.class);
        factory.produce();

//        System.out.println("Model: " + factory.getModel());
//        System.out.println("Generation: " + factory.getGeneration());

        context.close();
    }
}
