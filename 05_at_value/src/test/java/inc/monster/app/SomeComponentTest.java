package inc.monster.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class SomeComponentTest {

    @Autowired
    private SomeComponent someComponent;

    @Test
    public void test() {
        assertThat(someComponent.getFirstProperty()).isEqualTo("Hello World!");
    }
}
