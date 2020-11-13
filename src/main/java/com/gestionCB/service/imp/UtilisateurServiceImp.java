package com.gestionCB.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.gestionCB.entities.Utilisateur;
import com.gestionCB.service.UtilisateurService;
import com.gestionCB.repositories.UtilisateurRepository;

public class UtilisateurServiceImp implements UtilisateurService {

	@Autowired
	UtilisateurRepository utilisateurRepo;
	
	@Override
	public List<Utilisateur> findAllUtilisateurs() {
		return utilisateurRepo.findAll();
	}

	@Override
	public Optional<Utilisateur> findUtilisateurById(Long id) {
		return utilisateurRepo.findById(id);

	}

	@Override
	public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
		return utilisateurRepo.save(utilisateur);
	}
	

	@Override
	public void deleteUtilisateurById(Long id) {
		utilisateurRepo.deleteById(id);
		
	}

}
