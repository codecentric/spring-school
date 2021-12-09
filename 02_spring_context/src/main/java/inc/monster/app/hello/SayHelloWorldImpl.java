package inc.monster.app.hello;

import org.springframework.stereotype.Component;

@Component
public class SayHelloWorldImpl implements SayHelloWorld {

    @Override
    public String greet() {
        return "Hello World!";
    }
}
