package in.sspatil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"in.sspatil"})
public class ContentnegotiationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContentnegotiationApplication.class, args);
	}
}
