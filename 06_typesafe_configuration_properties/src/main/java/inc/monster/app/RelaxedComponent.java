package inc.monster.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RelaxedComponent {
    @Value("${relaxed.lastName}")
    private String lastName;

    @Autowired
    private RelaxedProperties properties;

    public void printProperties() {
        System.out.println(properties.toString());
        System.out.println("@Value(\"${relaxed.lastName}\"), " + lastName);
    }
}
