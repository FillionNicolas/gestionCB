package com.gestionCB.service;

import java.util.List;
import java.util.Optional;

import com.gestionCB.entities.Compte;

public interface CompteService {
	
	//Find All
	public List<Compte> findAllComptes();
	
	//Find One By Id
	public Optional<Compte> findCompteById(Long id);
	
	//Save & Update
	public Compte saveCompte(Compte compte);
		
	//Delete
	public void deleteCompteById(Long id);
		
}
