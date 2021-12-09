package inc.monster.car;

import inc.monster.car.axles.FrontAxle;
import inc.monster.car.axles.RearAxle;

public class Car {

    private FrontAxle frontAxle;

    private RearAxle rearAxle;

    public void drive() {
        System.out.println("This car is driving");
    }

    public void stop() {
        System.out.println("This car is stopping");
    }
}
