package com.github.rakhmedovrs.springdependencyinjection.controllers;

import com.github.rakhmedovrs.springdependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author RakhmedovRS
 * @created 02-May-20
 */
@Component
public class I18nController
{
	private final GreetingService greetingService;

	public I18nController(@Qualifier("i18nService") GreetingService greetingService)
	{
		this.greetingService = greetingService;
	}

	public String sayHello()
	{
		return greetingService.sayGreeting();
	}
}
