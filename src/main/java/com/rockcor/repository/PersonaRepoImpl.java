/**
 * 
 */
package com.rockcor.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 * @author ricardodelgadocarreno
 *
 */
@Repository
public class PersonaRepoImpl implements IPersonaRepo {
	
	public static Logger LOG = LoggerFactory.getLogger(PersonaRepoImpl.class);

	@Override
	public void registrar(String name) {
		LOG.info("Nombre: " + name);
	}

}
