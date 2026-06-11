package co.kozao.bibliotheque;

import co.kozao.bibliotheque.database.DatabaseConnection;

public class Main {

	public static void main(String[] args) {
		// on teste la connexion
        DatabaseConnection.getConnection();
        DatabaseConnection.closeConnection();

	}

}
