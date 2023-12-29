package com.example.testingweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	public @ResponseBody String greeting() {
		//String password = "123456";
		//String user = "Admin";
		//String query = "SELECT * FROM USUARIOS WHERE 1 = 1";
		return "Hello, World";
	}

}
