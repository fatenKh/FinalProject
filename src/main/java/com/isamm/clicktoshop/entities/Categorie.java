package com.isamm.clicktoshop.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class Categorie implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idcategorie ;
	@NotEmpty
	@Size(min=4,max=20)
	private String nomCategorie ;
	private String description ;
	@OneToMany(mappedBy="categorie")
	private Collection<Produit> produits ;
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categorie(String nomCategorie, String description, byte[] photo, String nomPhoto,
			Collection<Produit> produits) {
		this.nomCategorie = nomCategorie;
		this.description = description;
		this.produits = produits;
	}
	public Long getIdcategorie() {
		return idcategorie;
	}
	public void setIdcategorie(Long idcategorie) {
		this.idcategorie = idcategorie;
	}
	public String getNomCategorie() {
		return nomCategorie;
	}
	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Collection<Produit> getProduits() {
		return produits;
	}
	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}
	
	

}
