package inc.monster.car.axles;

import inc.monster.car.wheels.LeftFrontWheel;
import inc.monster.car.wheels.RightFrontWheel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FrontAxle {

    private final LeftFrontWheel leftFrontWheel;

    private final RightFrontWheel rightFrontWheel;

    @Autowired
    public FrontAxle(LeftFrontWheel leftFrontWheel, RightFrontWheel rightFrontWheel) {
        this.leftFrontWheel = leftFrontWheel;
        this.rightFrontWheel = rightFrontWheel;
    }

    public void drive() {
        System.out.println("I'm rotating (front axle)");
        leftFrontWheel.drive();
        rightFrontWheel.drive();
    }

    public void stop() {
        System.out.println("I'm stopping (front axle)");
        leftFrontWheel.stop();
        rightFrontWheel.stop();
    }
}
