package com.gestionCB.entities;

public class CompteCourant {
	
	private double decouvert;

	@Override
	public String toString() {
		return "CompteEpargne [decouvert=" + decouvert + "]";
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	public CompteCourant(double decouvert) {
		super();
		this.decouvert = decouvert;
	}

	public CompteCourant() {
		super();
	}
	
	
}
