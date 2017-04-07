package net.nlacombe.configws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
@Configuration
@PropertySource("classpath:/secret.properties")
public class ConfigCoreApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(ConfigCoreApplication.class);
	}
}
