package pharmacie.Main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import pharmacie.Database.DatabaseConnection;

public class Main {
    public static void main(String[] args) {
        Connection connection = DatabaseConnection.getConnection();

        if (connection != null) {
            String sql = "INSERT INTO Clients (Nom, Prenom, Telephone) VALUES (?, ?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, "Aya");
                preparedStatement.setString(2, "Jean");
                preparedStatement.setString(3, "0123456789");

                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println(rowsAffected + " ligne(s) insérée(s) !");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
