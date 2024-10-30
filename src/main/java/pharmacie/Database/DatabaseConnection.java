package pharmacie.Database;
import java.sql.*;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3305/gestion_de_pharmacie"; // Remplacez par le nom de votre base de données
    private static final String USER = "root"; // Remplacez par votre nom d'utilisateur
    private static final String PASSWORD = "AYAaya123."; // Remplacez par votre mot de passe
    Connection myConn;
	Statement instruction;
      //DATABASE CONNECTION  
	public DatabaseConnection() {		
		try {
			myConn = DriverManager.getConnection(URL,USER,PASSWORD);
			instruction = myConn.createStatement();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
    //Lire tt les colonnes d'un table donnée
    public void lire(String requete,boolean message) {
        ResultSet résultat = null;
        try {
        résultat = instruction.executeQuery(requete);
        } catch (SQLException e) {
        e.printStackTrace();
        }
        try {
        ResultSetMetaData metaData = (ResultSetMetaData) résultat.getMetaData();
        int columnCount = metaData.getColumnCount();  
        int i = 0;
        if(message) {System.out.println("Voiçi les informations que vous avez cherché :");   }
        System.out.println("___________________________________________");  
        while (résultat.next()) {
            System.out.print("ligne " + i + " : \n");
            
            // Parcourir toutes les colonnes
            for (int j = 1; j <= columnCount; j++) {
                String columnName = metaData.getColumnName(j);  // Obtenir le nom de la colonne
                Object value = résultat.getObject(j);  // Obtenir la valeur de la colonne

                System.out.print(columnName + " = " + value + " ;\n");
            }
            System.out.println("___________________________________________");  // Passer à la ligne suivante
            i++;
        }
        } 
        catch (SQLException e) {
        e.printStackTrace();
        }
    }
        // lire valeur a partir d'une requete
   public Object lireValeur(String requete) {
    ResultSet resultat = null;
    Object valeur = null; 
    try {
        // Exécuter la requête
        resultat = instruction.executeQuery(requete);

        // Vérifier si le ResultSet a des résultats
        if (resultat.next()) {
            // Récupérer la valeur de la première colonne (1-indexé)
            valeur = resultat.getObject(1); // ou getString(1), getInt(1), etc. selon le type attendu
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Gérer l'exception
    } 
    return valeur; // Retourner la valeur trouvée, ou null si aucune valeur n'a été trouvée
                                        }



    //inserer une ligne dans un table donnée
    public void insert(String query) {
                try {
                    int résultat = instruction.executeUpdate(query);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                }
            
    // Supprimer une ligne d'un table : 
    public void delete(String requete) {
    try {
        int résultat = instruction.executeUpdate(requete);
    } catch (SQLException e) {
        e.printStackTrace();
    }
    }
    //modifier une ligne du table : 
    public void update(String requete) {
        try {
            int résultat = instruction.executeUpdate(requete);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//Fermer la connexion établi
    public void close() {
                try {
                    myConn.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
    }
        }
        