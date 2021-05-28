package inc.monster.car;

import inc.monster.car.axles.FrontAxle;
import inc.monster.car.axles.RearAxle;
import inc.monster.car.wheels.LeftFrontWheel;
import inc.monster.car.wheels.LeftRearWheel;
import inc.monster.car.wheels.RightFrontWheel;
import inc.monster.car.wheels.RightRearWheel;

public class CarFactory {

    public Car create() {
        LeftFrontWheel leftFrontWheel = new LeftFrontWheel();
        RightFrontWheel rightFrontWheel = new RightFrontWheel();

        LeftRearWheel leftRearWheel = new LeftRearWheel();
        RightRearWheel rightRearWheel = new RightRearWheel();

        FrontAxle frontAxle = new FrontAxle();
        frontAxle.setLeftFrontWheel(leftFrontWheel);
        frontAxle.setRightFrontWheel(rightFrontWheel);

        RearAxle rearAxle = new RearAxle();
        rearAxle.setLeftRearWheel(leftRearWheel);
        rearAxle.setRightRearWheel(rightRearWheel);

        Car car = new Car();
        car.setFrontAxle(frontAxle);
        car.setRearAxle(rearAxle);

        return car;
    }
}
