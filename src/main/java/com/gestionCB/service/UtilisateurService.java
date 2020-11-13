package com.gestionCB.service;

import java.util.List;
import java.util.Optional;

import com.gestionCB.entities.Utilisateur;

public interface UtilisateurService {

	
		//Find All
		public List<Utilisateur> findAllUtilisateurs();
		
		//Find One By Id
		public Optional<Utilisateur> findUtilisateurById(Long id);
		
		//Save & Update
		public Utilisateur saveUtilisateur(Utilisateur utilisateur);
			
		//Delete
		public void deleteUtilisateurById(Long id);

}
