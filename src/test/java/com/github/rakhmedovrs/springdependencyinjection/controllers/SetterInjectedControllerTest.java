package com.github.rakhmedovrs.springdependencyinjection.controllers;

import com.github.rakhmedovrs.springdependencyinjection.services.ConstructorInjectedGettingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author RakhmedovRS
 * @created 01-May-20
 */
class SetterInjectedControllerTest
{
	private SetterInjectedController controller;

	@BeforeEach
	void setUp()
	{
		controller = new SetterInjectedController();
		controller.setGreetingService(new ConstructorInjectedGettingService());
	}

	@Test
	void getGreeting()
	{
		System.out.println(controller.getGreeting());
	}
}