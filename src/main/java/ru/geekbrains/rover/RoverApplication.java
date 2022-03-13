package ru.geekbrains.rover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;
import ru.geekbrains.rover.config.RoverConfiguration;


@EnableDiscoveryClient
@SpringBootApplication
@Import(RoverConfiguration.class)
public class RoverApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoverApplication.class, args);
	}

}
