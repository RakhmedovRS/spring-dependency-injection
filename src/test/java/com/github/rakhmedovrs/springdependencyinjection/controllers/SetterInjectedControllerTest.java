package com.github.rakhmedovrs.springdependencyinjection.controllers;

import com.github.rakhmedovrs.springdependencyinjection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
		controller.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	void getGreeting()
	{
		System.out.println(controller.getGreeting());
	}
}