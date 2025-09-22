import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld helloWorld1 = (HelloWorld) context.getBean("getHelloWorld");
        HelloWorld helloWorld2 = (HelloWorld) context.getBean("getHelloWorld");

        Cat cat1 = (Cat) context.getBean("cat");
        Cat cat2 = (Cat) context.getBean("cat");

        System.out.println("HelloWorld comparison: " + (helloWorld1 == helloWorld2)); // true
        System.out.println("Cat comparison: " + (cat1 == cat2)); // false
    }
}