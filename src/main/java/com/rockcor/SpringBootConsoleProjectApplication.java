package com.rockcor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rockcor.service.IPersonaService;

@SpringBootApplication
public class SpringBootConsoleProjectApplication implements CommandLineRunner {
	
	public static Logger LOG = LoggerFactory.getLogger(SpringBootConsoleProjectApplication.class);

	@Autowired
	private IPersonaService _service;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootConsoleProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		LOG.info("Aplicación de consola");
		LOG.warn("Esta aplicación no hace nada");
		LOG.error("Ocurrió un error!!! Es broma");
		
		_service.registrar("Ricardo");
		_service.registrar("Lilly");
		_service.registrar("Gandalf");
		_service.registrar("Arya");
		
	}

}
