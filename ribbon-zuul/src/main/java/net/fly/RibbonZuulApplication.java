package net.fly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class RibbonZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonZuulApplication.class, args);
	}

	@RequestMapping("/sayHi")
	public String sayHi() {
		return "this is from start-zuul";
	}
}
