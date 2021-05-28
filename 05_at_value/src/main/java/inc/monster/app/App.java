package inc.monster.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);

        SomeComponent someComponent = context.getBean(SomeComponent.class);
        System.out.println(someComponent.toString());
    }
}
