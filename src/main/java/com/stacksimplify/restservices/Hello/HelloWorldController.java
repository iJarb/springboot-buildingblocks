package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//@RequestMapping( method = RequestMethod.GET , path = "/helloworld")
	@GetMapping("/helloworld1")
	public String helloWorld() {
		
		return "Hello Worldd";
	}
	
	@GetMapping("/helloworld-bean")
	public UserDetails helloWorldBean() {
		
		return new UserDetails("Angel", "Busto", "Madrid");
	}

}
