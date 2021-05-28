package inc.monster.autoconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;
import org.springframework.boot.autoconfigure.condition.ConditionalOnJava.Range;
import org.springframework.boot.system.JavaVersion;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AutoconfigurationApplication {

	@Bean
	@ConditionalOnJava(range = Range.EQUAL_OR_NEWER, value = JavaVersion.NINE)
	MyComponent loadMyComponent() {
		return 	new MyComponent();
	}

	public static void main(String[] args) {
		SpringApplication.run(AutoconfigurationApplication.class, args);
	}

}
