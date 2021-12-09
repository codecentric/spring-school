package inc.monster.app.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SayHelloWorldSpeakerWithFieldBasedInjection {

    @Autowired
    private SayHelloWorld sayHelloWorld;

    public void sayHelloWorld() {
        System.out.println("I want to say, " + sayHelloWorld.greet());
    }
}
