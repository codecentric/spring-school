package inc.monster.car.axles;

import inc.monster.car.wheels.LeftFrontWheel;
import inc.monster.car.wheels.RightFrontWheel;

public class FrontAxle {

    private LeftFrontWheel leftFrontWheel;

    private RightFrontWheel rightFrontWheel;

    public void setLeftFrontWheel(LeftFrontWheel leftFrontWheel) {
        this.leftFrontWheel = leftFrontWheel;
    }

    public void setRightFrontWheel(RightFrontWheel rightFrontWheel) {
        this.rightFrontWheel = rightFrontWheel;
    }

    public void drive() {
        System.out.println("I'm rotating (front axle)");
        leftFrontWheel.drive();
        rightFrontWheel.drive();
    }

    public void stop() {
        System.out.println("I'm stopping (front axle)");
    }
}
