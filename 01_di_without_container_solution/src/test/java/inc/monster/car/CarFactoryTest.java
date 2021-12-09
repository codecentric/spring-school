package inc.monster.car;

import org.junit.jupiter.api.Test;

public class CarFactoryTest {

    private CarFactory carFactory = new CarFactory();

    @Test
    public void create_And_Drive() {
        carFactory.create().drive();
    }

    @Test
    public void create_And_Stop() {
        carFactory.create().stop();
    }
}
