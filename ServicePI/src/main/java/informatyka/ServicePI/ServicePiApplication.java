package informatyka.ServicePI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServicePiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicePiApplication.class, args);
	}

}
