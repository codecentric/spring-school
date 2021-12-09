package inc.monster.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    @Autowired
    private MyProperties properties;

    public void printProperties() {
        System.out.println(properties.toString());
    }
}
