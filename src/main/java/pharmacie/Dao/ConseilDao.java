package pharmacie.Dao;
import java.util.Scanner;
import pharmacie.Database.DatabaseConnection;

public class ConseilDao {
static DatabaseConnection conn =new DatabaseConnection();
public static void addConseil() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Donne moi le titre");
    String PharmacienName= sc.nextLine();
    System.out.println("Donne moi le titre");
    String titre = sc.nextLine();
    System.out.println("Donne moi le contenu");
    String contenu = sc.nextLine();
    String query = "INSERT INTO Conseils (PharmacienName, titre, contenu) VALUES ('" 
    + PharmacienName + "', '" + titre + "', '" + contenu + "')";
    conn.insert(query);
}
}
