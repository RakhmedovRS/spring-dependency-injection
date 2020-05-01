package com.github.rakhmedovrs.springdependencyinjection.controllers;

import com.github.rakhmedovrs.springdependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author RakhmedovRS
 * @created 30-Apr-20
 */
@Controller
public class PropertyInjectedController
{
	@Autowired
	private GreetingService greetingService;

	public String getGreeting()
	{
		return greetingService.sayGreeting();
	}
}
