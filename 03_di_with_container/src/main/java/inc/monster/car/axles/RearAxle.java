package inc.monster.car.axles;

import inc.monster.car.wheels.LeftRearWheel;
import inc.monster.car.wheels.RightRearWheel;

public class RearAxle {

    private LeftRearWheel leftRearWheel;

    private RightRearWheel rightRearWheel;

    public void drive() {
        System.out.println("I'm rotating (rear axle)");
    }

    public void stop() {
        System.out.println("I'm stopping (rear axle)");
    }
}
