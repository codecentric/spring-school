package inc.monster.app.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SayHelloWorldSpeakerWithCtorBasedInjection {

    private final SayHelloWorld sayHelloWorld;

    @Autowired
    public SayHelloWorldSpeakerWithCtorBasedInjection(SayHelloWorld sayHelloWorld) {
        this.sayHelloWorld = sayHelloWorld;
        System.out.println("ctor injection, injected 'SayHelloWorld' object" + sayHelloWorld.toString());
    }

    public void sayHelloWorld() {
        System.out.println("I want to say, " + sayHelloWorld.greet());
    }
}
