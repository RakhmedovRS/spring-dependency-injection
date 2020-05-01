package com.github.rakhmedovrs.springdependencyinjection.controllers;

import com.github.rakhmedovrs.springdependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author RakhmedovRS
 * @created 01-May-20
 */
@Component
public class SetterInjectedController
{
	private GreetingService greetingService;

	@Autowired
	public void setGreetingService(@Qualifier("setterInjectedGreetingService") GreetingService greetingService)
	{
		this.greetingService = greetingService;
	}

	public String getGreeting()
	{
		return greetingService.sayGreeting();
	}
}
