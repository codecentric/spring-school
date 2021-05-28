package inc.monster.app.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SayHelloWorldSpeakerWithSetterBasedInjection {

    private SayHelloWorld sayHelloWorld;

    @Autowired
    public void setSayHelloWorld(SayHelloWorld sayHelloWorld) {
        this.sayHelloWorld = sayHelloWorld;
        System.out.println("setter injection, injected 'SayHelloWorld' object" + sayHelloWorld.toString());
    }

    public void sayHelloWorld() {
        System.out.println("I want to say, " + sayHelloWorld.greet());
    }
}
