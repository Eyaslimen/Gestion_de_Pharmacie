package pharmacie.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3305/gestion_de_pharmacie"; // Remplacez par le nom de votre base de données
    private static final String USER = "root"; // Remplacez par votre nom d'utilisateur
    private static final String PASSWORD = "AYAaya123."; // Remplacez par votre mot de passe
    Connection myConn;
	Statement instruction;
	

	public DatabaseConnection() {
		// TODO Auto-generated method stub
		
		try {
			myConn = DriverManager.getConnection(URL,USER,PASSWORD);
			instruction = myConn.createStatement();
			
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
    public void executeRequeteInsert(String query) {
        int résultat = -1;
		try {
			résultat = instruction.executeUpdate(query);
            if(résultat>0) {
                System.out.println("updated avec succées");
            }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   }
        public void executeRequeteDelete(String query) {
            int résultat = -1;
            try {
                résultat = instruction.executeUpdate(query);
                if(résultat>0) {
                    System.out.println("updated avec succées");
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }   }

}