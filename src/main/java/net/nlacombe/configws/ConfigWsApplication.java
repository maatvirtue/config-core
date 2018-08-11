package net.nlacombe.configws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigWsApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(ConfigWsApplication.class);
	}
}
