package co.kozao.bibliotheque.model;

import java.awt.print.Book;
import java.time.LocalDate;

public class Books {
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

// equals/hashCode : basés sur reference 
@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Book)) return false;
    Book book = (Book) o;
    return reference.equals(book.reference);
}

}
