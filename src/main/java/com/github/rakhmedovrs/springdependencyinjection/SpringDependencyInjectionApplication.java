package com.github.rakhmedovrs.springdependencyinjection;

import com.github.rakhmedovrs.springdependencyinjection.controllers.ConstructorInjectedController;
import com.github.rakhmedovrs.springdependencyinjection.controllers.MyController;
import com.github.rakhmedovrs.springdependencyinjection.controllers.PropertyInjectedController;
import com.github.rakhmedovrs.springdependencyinjection.controllers.SetterInjectedController;
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

		System.out.println("---------- Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("---------- Property");
		PropertyInjectedController propertyInjectedController =
			(PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("---------- Setter");
		SetterInjectedController setterInjectedController =
			(SetterInjectedController) applicationContext.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("---------- Constructor");
		ConstructorInjectedController constructorInjectedController =
			(ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}
}
