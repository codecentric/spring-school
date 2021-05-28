package inc.monster.app;

import inc.monster.app.hello.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import static java.util.Arrays.asList;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class.getPackage().getName());

        System.out.println("--- start environment -----------------------------------------------------------------------");
        Environment environment = context.getEnvironment();
        System.out.println(environment);
        System.out.println("--- end environment -----------------------------------------------------------------------");

        System.out.println("--- start beans -----------------------------------------------------------------------");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        asList(beanDefinitionNames).forEach(System.out::println);
        System.out.println("--- end beans -----------------------------------------------------------------------");

        System.out.println("--- start My 'SayHelloWorld' beans -----------------------------------------------------------------------");

        Object beanAsObject = context.getBean("sayHelloWorldImpl");
        System.out.println("As object " + beanAsObject);

        SayHelloWorldImpl beanAsImpl = context.getBean(SayHelloWorldImpl.class);
        System.out.println("As impl " + beanAsImpl);

        SayHelloWorld beanAsInterface = context.getBean(SayHelloWorld.class);
        System.out.println("As interface " + beanAsInterface);

        SayHelloWorldSpeakerWithCtorBasedInjection speaker1 = context.getBean(
                SayHelloWorldSpeakerWithCtorBasedInjection.class);
        System.out.println("(ctor injection) My speaker " + speaker1);

        speaker1.sayHelloWorld();

        SayHelloWorldSpeakerWithSetterBasedInjection speaker2 = context.getBean(
                SayHelloWorldSpeakerWithSetterBasedInjection.class);
        System.out.println("(setter injection) My speaker " + speaker2);

        speaker2.sayHelloWorld();

        SayHelloWorldSpeakerWithFieldBasedInjection speaker3 = context.getBean(
                SayHelloWorldSpeakerWithFieldBasedInjection.class);
        System.out.println("(field injection) My speaker " + speaker3);

        speaker3.sayHelloWorld();

        System.out.println("--- end My 'SayHelloWorld' beans -----------------------------------------------------------------------");
    }
}
