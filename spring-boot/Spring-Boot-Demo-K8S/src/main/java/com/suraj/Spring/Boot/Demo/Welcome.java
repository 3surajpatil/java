package com.suraj.Spring.Boot.Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody
public class Welcome {
	
	@Autowired
	User u;
	
	@GetMapping("/hello")
	public String helloWorld()
	{
		
		System.out.println(u.toString());
		return "Hello world.";
		
		
	}
	
}