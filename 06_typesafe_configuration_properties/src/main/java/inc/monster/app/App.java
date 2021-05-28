package inc.monster.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@EnableConfigurationProperties({MyProperties.class, NestingProperties.class, ListProperties.class,
        ValidProperties.class, RelaxedProperties.class})
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        final ApplicationContext context = SpringApplication.run(App.class, args);

        final MyComponent myComponent = context.getBean(MyComponent.class);
        myComponent.printProperties();

        final NestingComponent nestingComponent = context.getBean(NestingComponent.class);
        nestingComponent.printProperties();

        final ListComponent listComponent = context.getBean(ListComponent.class);
        listComponent.printProperties();

        final ValidComponent validComponent = context.getBean(ValidComponent.class);
        validComponent.printProperties();

        final RelaxedComponent relaxedComponent = context.getBean(RelaxedComponent.class);
        relaxedComponent.printProperties();
    }
}
