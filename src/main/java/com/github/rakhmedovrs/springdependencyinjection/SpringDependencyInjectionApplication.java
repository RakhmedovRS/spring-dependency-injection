package com.github.rakhmedovrs.springdependencyinjection;

import com.github.rakhmedovrs.springdependencyinjection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication
{

	public static void main(String[] args)
	{
		ApplicationContext applicationContext = SpringApplication.run(SpringDependencyInjectionApplication.class, args);
		MyController myController = (MyController) applicationContext.getBean("myController");

		String greetings = myController.sayHello();
		System.out.println(greetings);
	}
}
