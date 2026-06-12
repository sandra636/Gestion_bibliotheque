package co.kozao.bibliotheque.ui;
import java.util.Scanner;
import co.kozao.bibliotheque.service.LibraryService;

public class ConsoleMenu {
	public static void main(String[]args) {
    private final LibraryService service;
    private final Scanner scanner;

    public ConsoleMenu(LibraryService service) {
        this.service = service;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        // boucle principale
    }

    private void ajouterLivre() {} //pour appeler la  

    private void ajouterMembre() {}

    private void emprunterLivre() {}

    private void retournerLivre() {}

    private void reserverLivre() {}

    private void afficherLivres() {}

    private void afficherMembres() {}
}