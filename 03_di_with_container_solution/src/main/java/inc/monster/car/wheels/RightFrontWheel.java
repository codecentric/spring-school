package inc.monster.car.wheels;

import org.springframework.stereotype.Component;

@Component
public class RightFrontWheel {

    private String wheelName = "right front wheel";

    public void drive() {
        System.out.println(wheelName + " is spinning");
    }

    public void stop() {
        System.out.println(wheelName + " is stopping");
    }
}
