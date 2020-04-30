package com.github.rakhmedovrs.springdependencyinjection.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author RakhmedovRS
 * @created 30-Apr-20
 */
@Controller
public class MyController
{
	public String sayHello()
	{
		System.out.println("Hello world");
		return "Hello muchacho";
	}
}
