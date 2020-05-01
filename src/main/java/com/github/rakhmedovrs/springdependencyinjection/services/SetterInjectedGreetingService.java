package com.github.rakhmedovrs.springdependencyinjection.services;

import org.springframework.stereotype.Service;

/**
 * @author RakhmedovRS
 * @created 01-May-20
 */
@Service
public class SetterInjectedGreetingService implements GreetingService
{
	@Override
	public String sayGreeting()
	{
		return "Hello World - Setter";
	}
}
