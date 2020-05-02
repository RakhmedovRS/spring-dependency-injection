package com.github.rakhmedovrs.springdependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author RakhmedovRS
 * @created 02-May-20
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService
{
	@Override
	public String sayGreeting()
	{
		return "Hello World - From the PRIMARY Bean";
	}
}
