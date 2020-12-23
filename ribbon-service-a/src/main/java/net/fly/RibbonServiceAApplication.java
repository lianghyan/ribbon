package net.fly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@SpringBootApplication
public class RibbonServiceAApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonServiceAApplication.class, args);
	}

	@RequestMapping("/sayHi")
	public String sayHi() {
		return "this is from ribbon-service-a";
	}
}
