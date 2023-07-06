package in.sspatil;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages= {"in.sspatil"})
//@EnableAutoConfiguration
//@EnableJpaRepositories("in.sspatil.repository")
public class SpringBootRestApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApplication.class, args);
	}

	

}
