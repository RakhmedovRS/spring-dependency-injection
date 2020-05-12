package com.github.rakhmedovrs.springdependencyinjection.config;

import com.github.rakhmedovrs.springdependencyinjection.examplebeans.FakeDataSource;
import com.github.rakhmedovrs.springdependencyinjection.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * @author RakhmedovRS
 * @created 11-May-20
 */
@Configuration
@PropertySources
	({
		@PropertySource("classpath:datasource.properties"),
		@PropertySource("classpath:jms.properties")
	})
public class PropertyConfig
{
	@Autowired
	Environment environment;

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
		return new FakeDataSource(environment.getProperty("FAKE_USERNAME"), password, url);
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
