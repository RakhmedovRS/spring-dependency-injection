package com.github.rakhmedovrs.springdependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author RakhmedovRS
 * @created 02-May-20
 */
@Profile("ES")
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService
{
	@Override
	public String sayGreeting()
	{
		return "Hola Mundo - Spanish";
	}
}
