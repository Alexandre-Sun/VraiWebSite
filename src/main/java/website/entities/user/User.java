package website.entities.user;



import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import jakarta.persistence.*;
import java.util.*;

import javax.management.relation.Role;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class User {
	
	/* Création de l'objet "User" avec tous les paramètres qui défini un compte et leurs getters/setters.
	*/
	
	
	
	User(Long id, String nom, String prenom, String civilite, String pays, String adresseMail, String motDePasse,
			String dateDeNaissance) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.civilite = civilite;
		this.pays = pays;
		this.adresseMail = adresseMail;
		this.motDePasse = motDePasse;
		this.dateDeNaissance = dateDeNaissance;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getCivilite() {
		return civilite;
	}
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getAdresseMail() {
		return adresseMail;
	}
	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public String getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(String dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name="id")
	public Long id;
	@NotNull
	public String nom;
	@NotNull
	public String prenom;
	@NotNull
	public String civilite;
	@NotNull
	public String pays;
	@NotNull
	public String adresseMail;
	@NotNull
	public String motDePasse;
	@NotNull
	public String dateDeNaissance;
	
}
