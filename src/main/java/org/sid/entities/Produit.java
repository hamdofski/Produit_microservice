package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


 @Entity
public class Produit implements Serializable {
	 
	 @Id @GeneratedValue
	private Long idProduct;
	private String nomProduit;
	private double prixProduit;
	
	
	
	public Produit(String nomProduit, double prixProduit) {
		super();
		this.nomProduit = nomProduit;
		this.prixProduit = prixProduit;
	}
	
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getIdProduct() {
		return idProduct;
	}


	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}


	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public double getPrixProduit() {
		return prixProduit;
	}
	public void setPrixProduit(double prixProduit) {
		this.prixProduit = prixProduit;
	}
	
	
	
	

}
