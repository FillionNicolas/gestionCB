package com.gestionCB.entities;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Compte {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCompte;
	private Date dateCreation;
	private double solde;
	public Long getIdCompte() {
		return idCompte;
	}
	public void setIdCompte(Long idCompte) {
		this.idCompte = idCompte;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Compte(Long idCompte, Date dateCreation, double solde) {
		super();
		this.idCompte = idCompte;
		this.dateCreation = dateCreation;
		this.solde = solde;
	}
	public Compte() {
		super();
	}
	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + ", dateCreation=" + dateCreation + ", solde=" + solde + "]";
	}
	
	

}
