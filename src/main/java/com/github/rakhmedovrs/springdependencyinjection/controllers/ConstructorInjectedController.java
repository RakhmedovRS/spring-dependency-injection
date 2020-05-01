package com.github.rakhmedovrs.springdependencyinjection.controllers;

import com.github.rakhmedovrs.springdependencyinjection.services.GreetingService;

/**
 * @author RakhmedovRS
 * @created 01-May-20
 */
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
