package co.kozao.bibliotheque.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    //  Paramètres de connexion 
    private static final String URL      = "jdbc:mysql://localhost:3306/bibliotheque";
    private static final String USER     = "root";
    private static final String PASSWORD = ""; 

    //  Instance unique (Singleton)
    private static Connection connection = null;

    //  Constructeur privé : empêche l'instanciation
    private DatabaseConnection() {}

    //  Obtenir la connexion 
    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("✓ Connexion à la base de données réussie");
            }
        } catch (SQLException e) {
            System.out.println("✗ Erreur de connexion : " + e.getMessage());
        }
        return connection;
    }

    //  Fermer la connexion 
    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("✓ Connexion fermée");
            }
        } catch (SQLException e) {
            System.out.println("✗ Erreur fermeture : " + e.getMessage());
        }
    }
}