package com.gestionCB.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionCB.entities.Compte;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {

}

