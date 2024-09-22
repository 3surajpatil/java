package com.suraj.Spring.Boot.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.suraj.Spring.Boot.Demo.User;

@Controller
@ResponseBody
public class Welcome2 {
	
	@Autowired
	User u;
	
	@GetMapping("/hello2")
	public String helloWorld()
	{
		
		System.out.println(u.toString());
		return "Hello world.";
		
		
	}
	
}