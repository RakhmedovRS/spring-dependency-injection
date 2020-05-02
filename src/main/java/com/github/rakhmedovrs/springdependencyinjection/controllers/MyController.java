package com.github.rakhmedovrs.springdependencyinjection.controllers;

import com.github.rakhmedovrs.springdependencyinjection.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author RakhmedovRS
 * @created 30-Apr-20
 */
@Controller
public class MyController
{
	private final GreetingService greetingService;

	public MyController(GreetingService greetingService)
	{
		this.greetingService = greetingService;
	}

	public String sayHello()
	{
		return greetingService.sayGreeting();
	}
}
