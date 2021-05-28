package inc.monster.car.axles;

import inc.monster.car.wheels.LeftRearWheel;
import inc.monster.car.wheels.RightRearWheel;

public class RearAxle {

    private LeftRearWheel leftRearWheel;

    private RightRearWheel rightRearWheel;

    public void setLeftRearWheel(LeftRearWheel leftRearWheel) {
        this.leftRearWheel = leftRearWheel;
    }

    public void setRightRearWheel(RightRearWheel rightRearWheel) {
        this.rightRearWheel = rightRearWheel;
    }

    public void drive() {
        System.out.println("I'm rotating (rear axle)");
        leftRearWheel.drive();
        rightRearWheel.drive();
    }

    public void stop() {
        System.out.println("I'm stopping (rear axle)");
    }
}
