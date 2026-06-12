package co.kozao.bibliotheque.model;

public class Librarian {
private int idLibrarian;
private String nom;
private  String prenom;
private  String motDepasse ;
private  String email ;
public int getIdLibrarian() {
	return idLibrarian;
}
public void setIdLibrarian(int idLibrarian) {
	this.idLibrarian = idLibrarian;
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
public String getMotDepasse() {
	return motDepasse;
}
public void setMotDepasse(String motDepasse) {
	this.motDepasse = motDepasse;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Librarian(int idLibrarian, String nom, String prenom, String motDepasse, String email) {
	super();
	this.idLibrarian = idLibrarian;
	this.nom = nom;
	this.prenom = prenom;
	this.motDepasse = motDepasse;
	this.email = email;
}
@Override
public String toString() {
	return "Librarian [idLibrarian=" + idLibrarian + ", nom=" + nom + ", prenom=" + prenom + ", motDepasse="
			+ motDepasse + ", email=" + email + "]";
}


} 
