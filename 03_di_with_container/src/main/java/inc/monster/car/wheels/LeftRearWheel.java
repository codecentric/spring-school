package inc.monster.car.wheels;

public class LeftRearWheel {

    private String wheelName = "left rear wheel";

    public void drive() {
        System.out.println(wheelName + " is spinning");
    }

    public void stop() {
        System.out.println(wheelName + " is stopping");
    }
}
