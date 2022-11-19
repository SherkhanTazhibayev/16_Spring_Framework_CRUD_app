package Program;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml"
//        );

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfiguration.class
        );

        Factory factory = context.getBean("factory", Factory.class);

        System.out.println(factory.getName());
        System.out.println(factory.getVolume());

        Japan japan1 = context.getBean("japan", Japan.class);
        Japan japan2 = context.getBean("japan", Japan.class);

        System.out.println(japan1 == japan2);

        context.close();
    }
}
