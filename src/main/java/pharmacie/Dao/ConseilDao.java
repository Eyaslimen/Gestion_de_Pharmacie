package pharmacie.Dao;
import java.util.Scanner;
import pharmacie.Database.DatabaseConnection;
import pharmacie.Services.GestionConseils;
import pharmacie.Models.Conseil;
public class ConseilDao {
static DatabaseConnection conn =new DatabaseConnection();
static Scanner sc = new Scanner(System.in);
//ajouter un conseil
public static void ajouterConseil() {
    System.out.println("Donne moi le titre");
    String PharmacienName= sc.nextLine();
    System.out.println("Donne moi le titre");
    String titre = sc.nextLine();
    System.out.println("Donne moi le contenu");
    String contenu = sc.nextLine();
    Conseil conseil= new Conseil(PharmacienName,titre,contenu);
    String query = "INSERT INTO Conseils (PharmacienName, titre, contenu) VALUES ('" 
    + conseil.getPharmacienName() + "', '" + conseil.getTitre() + "', '" + conseil.getContenu() + "')";
    conn.insert(query);
    System.out.println("Conseil ajoutée avec succées!");
    GestionConseils gc=new GestionConseils();

}
//Lire tt les conseils
public static void ConsulterConseils() {
    conn.lire("Select * from conseils;",true);
    GestionConseils gc=new GestionConseils();
}

// supprimer un conseil
public static void supprimerConseil() { 
    System.out.println("Donne moi l'id de conseil à supprimer");
    int id = sc.nextInt();
    String requete = "DELETE FROM Conseils WHERE ConseilID = "+id;
    conn.delete(requete);
    System.out.println("Conseil supprimée avec succées!");
    GestionConseils gc=new GestionConseils();
}
public static void changerConseil() {
    System.out.println("Donne moi l'id de conseil a changer?");
    int id = sc.nextInt();
    System.out.println("Ce que vous voulez changer?");
    String reponse = sc.next();
    String valeur="hi";
    if(reponse!=null) {System.out.println("Donne moi le nv valeur?");
     valeur = sc.next(); }
    String requete = "UPDATE Conseils"
				+ " SET "+reponse+"=" + valeur
				+ " WHERE ConseilID =" + id + ";";
    conn.update(requete);
    System.out.println("Conseil modifiée avec succées!");
    GestionConseils gc=new GestionConseils();
}
}
