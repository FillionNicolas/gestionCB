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

import com.gestionCB.entities.Compte;
import com.gestionCB.service.CompteService;

@CrossOrigin
@RestController
public class CompteController {
	
	@Autowired
	CompteService compteService;

	//@GetMapping("/comptes")
		@RequestMapping(value="/comptes",method=RequestMethod.GET)
		public List<Compte> findAll(){
		return compteService.findAllComptes();
	}
		

	//@GetMapping("/comptes/{id}")
	@RequestMapping(value="/comptes/{id}",method=RequestMethod.GET)
	public Optional<Compte> findOneById(@PathVariable("id") Long id){
		return compteService.findCompteById(id);
	}
		
	//@PostMapping("/comptes")
	@RequestMapping(value="/comptes",method=RequestMethod.POST)
	public Compte saveOrUpdate(@RequestBody Compte compte) {
		return compteService.saveCompte(compte);
	}
		
	//@DeleteMapping("/comptes/{id}")
	@RequestMapping(value="/comptes/{id}",method=RequestMethod.DELETE)
	public void deleteOneByID(@PathVariable("id") Long id) {
		compteService.deleteCompteById(id);
	}
	
	

}
