package com.github.rakhmedovrs.springdependencyinjection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author RakhmedovRS
 * @created 30-Apr-20
 */
class PropertyInjectedControllerTest
{
	private PropertyInjectedController controller;

	@BeforeEach
	void setUp()
	{
		controller = new PropertyInjectedController();
	}

	@Test
	void getGreeting()
	{
		System.out.println(controller.getGreeting());
	}
}