package inc.monster.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidComponent {

    @Autowired
    private ValidProperties properties;

    public void printProperties() {
        System.out.println(properties.toString());
    }
}
