package pharmacie.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3305/gestion_de_pharmacie"; // Remplacez par le nom de votre base de données
    private static final String USER = "root"; // Remplacez par votre nom d'utilisateur
    private static final String PASSWORD = "AYAaya123."; // Remplacez par votre mot de passe
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connexion réussie à la base de données !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
