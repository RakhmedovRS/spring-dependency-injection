package com.github.rakhmedovrs.springdependencyinjection.controllers;

import com.github.rakhmedovrs.springdependencyinjection.services.GreetingService;
import org.springframework.stereotype.Component;

/**
 * @author RakhmedovRS
 * @created 01-May-20
 */
@Component
public class ConstructorInjectedController
{
	private GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService)
	{
		this.greetingService = greetingService;
	}

	public String getGreeting()
	{
		return greetingService.sayGreeting();
	}
}
