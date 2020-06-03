package in.co.boltz.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages= {"in.co.boltz"})
@EnableJpaRepositories("in.co.boltz.repository") //create bean for CrudRepository
@EntityScan("in.co.boltz.entity")//To Map Entity

public class BoltzApplication  extends SpringBootServletInitializer
{
		
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BoltzApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BoltzApplication.class, args);
	}
}
