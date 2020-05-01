package com.github.rakhmedovrs.springdependencyinjection.controllers;

import com.github.rakhmedovrs.springdependencyinjection.services.GreetingService;

/**
 * @author RakhmedovRS
 * @created 01-May-20
 */
public class SetterInjectedController
{
	private GreetingService greetingService;

	public void setGreetingService(GreetingService greetingService)
	{
		this.greetingService = greetingService;
	}

	public String getGreeting()
	{
		return greetingService.sayGreeting();
	}
}
