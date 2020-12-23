package net.fly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class ServiceConsumerController {
	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/hi")
	public String customer() {
		return callService();
	}

	@HystrixCommand(fallbackMethod="errorCallBack")
	public String callService() {
		return restTemplate.getForObject("http://RIBBON-SERVICE/sayHi", String.class);
	}

	public String errorCallBack() {
		return "Some error happened!";
	}
}
