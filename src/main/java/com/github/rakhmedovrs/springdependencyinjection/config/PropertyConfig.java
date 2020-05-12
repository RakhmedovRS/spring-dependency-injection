package com.github.rakhmedovrs.springdependencyinjection.config;

import com.github.rakhmedovrs.springdependencyinjection.examplebeans.FakeDataSource;
import com.github.rakhmedovrs.springdependencyinjection.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author RakhmedovRS
 * @created 11-May-20
 */
@Configuration
public class PropertyConfig
{
	@Value("${fake.username}")
	private String user;

	@Value("${fake.password}")
	private String password;

	@Value("${fake.url}")
	private String url;

	@Value("${fake.jms.username}")
	private String jmsUser;

	@Value("${fake.jms.password}")
	private String jmsPassword;

	@Value("${fake.jms.url}")
	private String jmsUrl;

	@Bean
	public FakeDataSource fakeDataSource()
	{
		return new FakeDataSource(user, password, url);
	}

	@Bean
	public FakeJmsBroker fakeJmsBroker()
	{
		return new FakeJmsBroker(jmsUser, jmsPassword, jmsUrl);
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties()
	{
		return new PropertySourcesPlaceholderConfigurer();
	}
}
