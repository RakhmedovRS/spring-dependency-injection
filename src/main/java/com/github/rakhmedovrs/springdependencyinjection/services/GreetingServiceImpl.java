package com.github.rakhmedovrs.springdependencyinjection.services;

import org.springframework.stereotype.Component;

/**
 * @author RakhmedovRS
 * @created 30-Apr-20
 */
@Component
public class GreetingServiceImpl implements GreetingService
{
	@Override
	public String sayGreeting()
	{
		return "Hello World";
	}
}
