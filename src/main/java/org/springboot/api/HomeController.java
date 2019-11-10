package org.springboot.api;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class HomeController {
	
	Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	public static void main(String[] args) {
	      SpringApplication.run(HomeController.class, args);
	   }

	@RequestMapping("/login")
	public String loginPage() {
		return "index.html";
	}
	
	@RequestMapping("/")
	public String home() {
		return "index.html";
	}
	
	@RequestMapping("user")
	@ResponseBody
	public Principal user(Principal principal) {
		logger.debug("test "+principal);
		return principal;
	}
}
