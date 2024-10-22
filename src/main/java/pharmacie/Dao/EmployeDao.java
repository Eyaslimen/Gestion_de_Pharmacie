package pharmacie.Dao;

import java.util.Scanner;

import pharmacie.Database.DatabaseConnection;
import pharmacie.Services.GestionConseils;

public class EmployeDao {
static DatabaseConnection conn =new DatabaseConnection();
static Scanner sc = new Scanner(System.in);
    public static void ConsulterEmployes() {
    conn.lire("Select * from employes;", true);
    }
    public static void AjouterEmployes() {
        System.out.println("entrer le nom de l'employe");
        String nom = sc.nextLine();
        System.out.println("entrer le prenom de l'employe");
        String prenom = sc.nextLine();
        System.out.println("entrer le mot de passe pour cet employe de l'employe");
        String motDePasse = sc.nextLine();
        System.out.println("entrer le role de cet employe (Gérant? Pharmacien? Employé ? )");
        String role = sc.nextLine();
        String query = "INSERT INTO employes (nom, prenom, mot_de_passe, role) VALUES ('" 
        + nom + "', '" + prenom + "', '" + motDePasse + "', '" + role + "');";
        // Exécution de la requête
        conn.insert(query);
    }
    public static void SupprimerEmployes() {
        System.out.println("Entrer l'id de l'employe a supprimer");
        int id = sc.nextInt();
        String requete = "DELETE FROM employes WHERE EmployeID = "+id;
        conn.delete(requete);
    }
    public static void ChangerEmploye() {
    System.out.println("Donne moi l'id de l'employe a changer :");
    int id = sc.nextInt();
    sc.nextLine();
    System.out.println("Ce que vous voulez changer?");
    String colonne = sc.nextLine();
    System.out.println("Donne moi le nv valeur?");
    String valeur = sc.nextLine(); 
    String requete = "UPDATE employes SET " + colonne + " = '" + valeur + "' WHERE EmployeID = " + id + ";";
    conn.update(requete);
    }
}
