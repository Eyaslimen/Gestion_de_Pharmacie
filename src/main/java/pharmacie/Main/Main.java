package pharmacie.Main;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import pharmacie.Database.DatabaseConnection;
import pharmacie.Users.Gerant;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Bonjour au notre systéme de gestion de Pharmacie , quelle est votre position ? \n 1 - Gerant \n - Pharmacien \n -Client");
        int choix1=myObj.nextInt();
        switch(choix1) {
        case 1:
            Gerant gestionGerant = new Gerant();
            break;
        case 2:
            System.out.println("vous etes un pharmacien");
            break;
        case 3:
            System.out.println("vous etes un client");
            break;
        default:
            System.out.println("vous n'etes pas un gerant, un pharmacien ou un client");
        }

        // DatabaseConnection connection = new DatabaseConnection();
        // String sql = "INSERT INTO Clients (Nom, Prenom, Telephone) VALUES ('Aya', 'Slimen', '24923967')";
        // connection.executeRequeteInsert(sql);
    }
}
