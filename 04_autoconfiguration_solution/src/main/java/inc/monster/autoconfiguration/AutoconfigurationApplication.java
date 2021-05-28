package inc.monster.autoconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AutoconfigurationApplication {

	@Bean
	MyComponent loadMyComponent() {
		return 	new MyComponent();
	}

	public static void main(String[] args) {
		SpringApplication.run(AutoconfigurationApplication.class, args);
	}

}
