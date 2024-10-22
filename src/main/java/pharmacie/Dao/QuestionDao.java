package pharmacie.Dao;
import java.util.Scanner;
import pharmacie.Database.DatabaseConnection;
import pharmacie.Services.GestionQuestions;

public class QuestionDao {
    static DatabaseConnection conn =new DatabaseConnection();
    static Scanner sc = new Scanner(System.in);
    public static void ConsulterQuestions() {
        conn.lire("Select * from questions;",true);
        System.out.println("Avez-vous besoin d'autre services ?");
        GestionQuestions GQ = new GestionQuestions();
    }
    public static void RepondreQuestions() {
        System.out.println("Voiçi les questions qui restent sans réponse :");
         conn.lire("SELECT * FROM questions WHERE reponse IS NULL;",false);
         System.out.println("quel est l'id de question que vous pouvez repondre ?");
         int id = sc.nextInt();
         sc.nextLine();
         System.out.println("donne moi votre nom");
         String nom = sc.nextLine();
         System.out.println("donne moi votre reponse");
         String reponse = sc.nextLine();
         conn.update("UPDATE questions SET reponse = '" + reponse + "', GerantName = '" + nom + "' WHERE QuestionID = " + id+";");
         System.out.println("Avez-vous besoin d'autre services ?");
         GestionQuestions GQ = new GestionQuestions();
         
     }
     private static int reponse() {
        Scanner myObj = new Scanner(System.in);
        int y = myObj.nextInt();
        return y;
    }
}