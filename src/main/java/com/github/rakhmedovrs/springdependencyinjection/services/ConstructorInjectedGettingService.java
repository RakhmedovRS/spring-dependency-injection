package com.github.rakhmedovrs.springdependencyinjection.services;

import org.springframework.stereotype.Service;

/**
 * @author RakhmedovRS
 * @created 30-Apr-20
 */
@Service
public class ConstructorInjectedGettingService implements GreetingService
{
	@Override
	public String sayGreeting()
	{
		return "Hello World - Constructor";
	}
}
