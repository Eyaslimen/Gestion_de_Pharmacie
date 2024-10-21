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
      //DATABASE CONNECTION  
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

            // LIRE CONTENU D'UN TABLEAU ! 
            public void lire(String query) {
                ResultSet résultat = null;
                try {
                    résultat = instruction.executeQuery(query);
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                
                int i = 0;
                try {
                    while ( résultat.next()) {
                        int num = résultat.getInt("id");
                        String ch = résultat.getString("name");
                        System.out.println("ligne " + i + " : " + num + " , " + ch + "\n");
                        i ++;
                    }
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            
            public void insert(String query) {
                try {
                    int résultat = instruction.executeUpdate(query);
                    if(résultat>0) {
                System.out.println("Ligne ajoutée avec succées");
                }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            
            public void close() {
                try {
                    myConn.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        
        }
        