package co.kozao.bibliotheque;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

import co.kozao.bibliotheque.database.DatabaseConnection;
import co.kozao.bibliotheque.model.Books;
import co.kozao.bibliotheque.model.Member;
import co.kozao.bibliotheque.service.LibraryService;
import co.kozao.bibliotheque.ui.ConsoleMenu;

public class Main {

	public static void main(String[] args) {
		//ouverture a la bd
		DatabaseConnection.getConnection();
		// initialisation des collection
		HashSet<Books> livre = new HashSet<>();
		TreeSet<Member> adherent = new TreeSet<>();
		HashMap<String, Books> emprunts = new HashMap<>();
	
		// creation du service
		LibraryService service = new LibraryService(livre, adherent, emprunts);
        // lancement du menu console
		ConsoleMenu console= new ConsoleMenu(service);
		console.lancer();
        //fermeture de la bd
		DatabaseConnection.closeConnection();
	}

}
