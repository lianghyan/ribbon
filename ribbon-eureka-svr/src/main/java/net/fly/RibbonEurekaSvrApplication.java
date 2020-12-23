package net.fly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaServer
@SpringBootApplication
public class RibbonEurekaSvrApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonEurekaSvrApplication.class, args);
	}

	@RequestMapping("/sayHi")
	public String sayHi() {
		return "this is from from ribbon-eureka-svr";
	}
}
