package com.suraj.Spring.Boot.Demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class BeanConfiguraiton {

	@Bean
	@Lazy
	public User getUser()
	{
		return new User(1,"Suraj"); 
		
	}
	
	
	
}
