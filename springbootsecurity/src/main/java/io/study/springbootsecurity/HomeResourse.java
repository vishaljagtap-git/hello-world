package io.study.springbootsecurity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeResourse {
	
	@RequestMapping("/")
	public String home() {
		return "Welcome";
	}
	
	@RequestMapping("/user")
	public String user() {
		return "Welcome User";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "Welcome Admin";
	}

}
