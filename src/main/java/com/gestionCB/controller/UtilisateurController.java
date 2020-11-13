package com.gestionCB.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestionCB.entities.Utilisateur;
import com.gestionCB.service.UtilisateurService;

@CrossOrigin
@RestController
public class UtilisateurController {
	
	@Autowired
	UtilisateurService utilisateurService;

	//@GetMapping("/utilisateurs")
		@RequestMapping(value="/utilisateurs",method=RequestMethod.GET)
		public List<Utilisateur> findAll(){
		return utilisateurService.findAllUtilisateurs();
	}
		

	//@GetMapping("/utilisateurs/{id}")
	@RequestMapping(value="/utilisateurs/{id}",method=RequestMethod.GET)
	public Optional<Utilisateur> findOneById(@PathVariable("id") Long id){
		return utilisateurService.findUtilisateurById(id);
	}
		
	//@PostMapping("/utilisateurs")
	@RequestMapping(value="/utilisateurs",method=RequestMethod.POST)
	public Utilisateur saveOrUpdate(@RequestBody Utilisateur utilisateur) {
		return utilisateurService.saveUtilisateur(utilisateur);
	}
		
	//@DeleteMapping("/utilisateurs/{id}")
	@RequestMapping(value="/utilisateurs/{id}",method=RequestMethod.DELETE)
	public void deleteOneByID(@PathVariable("id") Long id) {
		utilisateurService.deleteUtilisateurById(id);
	}
}
