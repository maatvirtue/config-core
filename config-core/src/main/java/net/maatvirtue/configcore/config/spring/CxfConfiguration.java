package net.maatvirtue.configcore.config.spring;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import net.maatvirtue.wsutils.filter.CorsFilter;
import net.maatvirtue.wsutils.filter.RequestLogFilter;
import net.maatvirtue.wsutils.restexception.providers.GlobalExceptionMapper;
import net.maatvirtue.wsutils.restexception.providers.RestExceptionBodyReader;
import net.maatvirtue.wsutils.restexception.providers.RestExceptionCxfClientMapper;
import org.apache.cxf.jaxrs.spring.SpringComponentScanServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(SpringComponentScanServer.class)
public class CxfConfiguration
{
	@Bean
	public GlobalExceptionMapper globalExceptionMapper()
	{
		return new GlobalExceptionMapper();
	}

	@Bean
	public RestExceptionBodyReader restExceptionBodyReader()
	{
		return new RestExceptionBodyReader();
	}

	@Bean
	public RestExceptionCxfClientMapper restExceptionCxfClientMapper()
	{
		return new RestExceptionCxfClientMapper();
	}

	@Bean
	public RequestLogFilter requestLogFilter()
	{
		return new RequestLogFilter();
	}

	@Bean
	public CorsFilter corsFilter()
	{
		return new CorsFilter();
	}

	@Bean
	public JacksonJsonProvider jacksonJsonProvider()
	{
		return new JacksonJsonProvider();
	}
}
