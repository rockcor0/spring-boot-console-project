package com.rockcor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootConsoleProjectApplication implements CommandLineRunner {
	
	public static Logger LOG = LoggerFactory.getLogger(SpringBootConsoleProjectApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConsoleProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("Aplicación de consola");
		LOG.warn("Esta aplicación no hace nada");
		LOG.error("Ocurrió un error!!! Es broma");
	}

}
