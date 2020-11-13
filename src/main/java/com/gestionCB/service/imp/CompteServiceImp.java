package com.gestionCB.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.gestionCB.entities.Compte;
import com.gestionCB.repositories.CompteRepository;
import com.gestionCB.service.CompteService;

public class CompteServiceImp implements CompteService {

	
	@Autowired
	CompteRepository compteRepo;
	
	@Override
	public List<Compte> findAllComptes() {
		return compteRepo.findAll();
	}

	@Override
	public Optional<Compte> findCompteById(Long id) {
		return compteRepo.findById(id);
	}

	@Override
	public Compte saveCompte(Compte compte) {
		return compteRepo.save(compte);
	}

	@Override
	public void deleteCompteById(Long id) {
		compteRepo.deleteById(id);
		
	}

}
