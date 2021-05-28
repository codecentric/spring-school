package inc.monster.car.wheels;

import org.springframework.stereotype.Component;

@Component
public class LeftFrontWheel {

    private String wheelName = "left front wheel";

    public void drive() {
        System.out.println(wheelName + " is spinning");
    }

    public void stop() {
        System.out.println(wheelName + " is stopping");
    }
}
