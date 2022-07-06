import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld beanWorld = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanWorld.getMessage());
        HelloWorld beanWorld2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanWorld2.getMessage());

        Cat beanCat = (Cat) applicationContext.getBean("Cat");
        System.out.println(beanCat.getMessage());
        Cat beanCat2 = (Cat) applicationContext.getBean("Cat");
        System.out.println(beanCat2.getMessage());

        boolean beanTestWorld = beanWorld == beanWorld2;
        boolean beanTestCat = beanCat == beanCat2;

        System.out.println(beanTestWorld);
        System.out.println(beanTestCat);
    }
}