package co.kozao.bibliotheque.model;

import java.time.LocalDate;

public class Books implements Comparable<Books>{
private int id;
private String nom;
private String reference;
private LocalDate anneePublication;
private String genre;
private boolean disponible;
private int idAdherent;
private int idAuteur;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getReference() {
	return reference;
}
public void setReference(String reference) {
	this.reference = reference;
}
public LocalDate getAnneePublication() {
	return anneePublication;
}
public void setAnneePublication(LocalDate anneePublication) {
	this.anneePublication = anneePublication;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public boolean isDisponible() {
	return disponible;
}
public void setDisponible(boolean disponible) {
	this.disponible = disponible;
}
public int getIdAdherent() {
	return idAdherent;
}
public void setIdAdherent(int idAdherent) {
	this.idAdherent = idAdherent;
}
public int getIdAuteur() {
	return idAuteur;
}
public void setIdAuteur(int idAuteur) {
	this.idAuteur = idAuteur;
}
public Books(int id, String nom, String reference, LocalDate anneePublication, String genre, boolean disponible,
		int idAdherent, int idAuteur) {
	super();
	this.id = id;
	this.nom = nom;
	this.reference = reference;
	this.anneePublication = anneePublication;
	this.genre = genre;
	this.disponible = disponible;
	this.idAdherent = idAdherent;
	this.idAuteur = idAuteur;
}
//Comparable : tri naturel par nom
@Override
public int compareTo(Books other) {
    return this.nom.compareTo(other.nom);
}
//equals : deux livres identiques si même référence
@Override
public boolean equals(Object o) {
 if (this == o) return true;
 if (!(o instanceof Books)) return false;
 Books book = (Books) o;
 return reference.equals(book.reference);
}

//hashCode : code de recherche rapide basé sur référence
@Override
public int hashCode() {
 return reference.hashCode();
}
@Override
public String toString() {
	return "Books [id=" + id + ", nom=" + nom + ", reference=" + reference + ", anneePublication=" + anneePublication
			+ ", genre=" + genre + ", disponible=" + disponible + ", idAdherent=" + idAdherent + ", idAuteur="
			+ idAuteur + "]";
}

}

