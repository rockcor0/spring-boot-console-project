/**
 * 
 */
package com.rockcor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rockcor.repository.IPersonaRepo;

/**
 * @author ricardodelgadocarreno
 *
 */
@Service
public class PersonaServiceImpl implements IPersonaService {
	
	@Autowired
	private IPersonaRepo _repo;

	@Override
	public void registrar(String name) {
		
		_repo.registrar(name);
		
	}

}
