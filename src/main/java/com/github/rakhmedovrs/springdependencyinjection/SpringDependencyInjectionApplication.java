package com.github.rakhmedovrs.springdependencyinjection;

import com.github.rakhmedovrs.springdependencyinjection.examplebeans.FakeDataSource;
import com.github.rakhmedovrs.springdependencyinjection.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication
{

	public static void main(String[] args)
	{
		ApplicationContext applicationContext = SpringApplication.run(SpringDependencyInjectionApplication.class, args);

		FakeDataSource fakeDataSource = applicationContext.getBean(FakeDataSource.class);
		System.out.println("User Name - " + fakeDataSource.getUser());
		System.out.println("Password - " + fakeDataSource.getPassword());
		System.out.println("URL - " + fakeDataSource.getUrl());

		FakeJmsBroker fakeJmsBroker = applicationContext.getBean(FakeJmsBroker.class);
		System.out.println("JMS User Name - " + fakeJmsBroker.getUsername());
		System.out.println("JMS Password - " + fakeJmsBroker.getPassword());
		System.out.println("JMS URL - " + fakeJmsBroker.getUrl());
	}
}
