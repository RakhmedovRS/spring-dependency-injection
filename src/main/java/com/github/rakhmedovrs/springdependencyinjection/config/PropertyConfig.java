package com.github.rakhmedovrs.springdependencyinjection.config;

import com.github.rakhmedovrs.springdependencyinjection.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author RakhmedovRS
 * @created 11-May-20
 */
@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig
{
	@Value("${fake.username}")
	private String user;

	@Value("${fake.password}")
	private String password;

	@Value("${fake.url}")
	private String url;

	@Bean
	public FakeDataSource fakeDataSource()
	{
		return new FakeDataSource(user, password, url);
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties()
	{
		return new PropertySourcesPlaceholderConfigurer();
	}
}
