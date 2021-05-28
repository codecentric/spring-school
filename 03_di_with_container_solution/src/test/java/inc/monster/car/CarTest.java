package inc.monster.car;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = CarTest.Configuration.class)
@SpringBootConfiguration
public class CarTest {

    @TestConfiguration
    @ComponentScan(basePackageClasses = {Car.class})
    public static class Configuration {

    }

    @Autowired
    private Car car;

    @Test
    public void drive() {
        car.drive();
    }

    @Test
    public void stop() {
        car.stop();
    }
}
