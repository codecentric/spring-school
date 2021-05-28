package inc.monster.car.axles;

import inc.monster.car.wheels.LeftRearWheel;
import inc.monster.car.wheels.RightRearWheel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RearAxle {

    private final LeftRearWheel leftRearWheel;

    private final RightRearWheel rightRearWheel;

    @Autowired
    public RearAxle(LeftRearWheel leftRearWheel, RightRearWheel rightRearWheel) {
        this.leftRearWheel = leftRearWheel;
        this.rightRearWheel = rightRearWheel;
    }

    public void drive() {
        System.out.println("I'm rotating (rear axle)");
        leftRearWheel.drive();
        rightRearWheel.drive();
    }

    public void stop() {
        System.out.println("I'm stopping (rear axle)");
        leftRearWheel.stop();
        rightRearWheel.stop();
    }
}
