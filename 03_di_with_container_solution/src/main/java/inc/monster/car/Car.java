package inc.monster.car;

import inc.monster.car.axles.FrontAxle;
import inc.monster.car.axles.RearAxle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private final FrontAxle frontAxle;

    private final RearAxle rearAxle;

    @Autowired
    public Car(FrontAxle frontAxle, RearAxle rearAxle) {
        this.frontAxle = frontAxle;
        this.rearAxle = rearAxle;
    }

    public void drive() {
        System.out.println("This car is driving");
        frontAxle.drive();
        rearAxle.drive();
    }

    public void stop() {
        System.out.println("This car is stopping");
        frontAxle.stop();
        rearAxle.stop();
    }
}
