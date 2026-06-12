package co.kozao.bibliotheque.model;

import java.util.Objects;

public class Author {
	private int idAuteur;
	private String nom;
	private String prenom;
	public int getIdAuteur() {
		return idAuteur;
	}
	public void setIdAuteur(int idAuteur) {
		this.idAuteur = idAuteur;
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
	public Author(int idAuteur, String nom, String prenom) {
		super();
		this.idAuteur = idAuteur;
		this.nom = nom;
		this.prenom = prenom;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idAuteur, nom, prenom);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		return idAuteur == other.idAuteur && Objects.equals(nom, other.nom) && Objects.equals(prenom, other.prenom);
	}
	@Override
	public String toString() {
		return "Author [idAuteur=" + idAuteur + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	

}
