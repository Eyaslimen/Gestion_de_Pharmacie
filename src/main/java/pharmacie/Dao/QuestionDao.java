package pharmacie.Dao;
import java.util.Scanner;
import pharmacie.Database.DatabaseConnection;
import pharmacie.Models.Conseil;
import pharmacie.Services.GestionConseils;
import pharmacie.Services.GestionQuestions;

public class QuestionDao {
    static DatabaseConnection conn =new DatabaseConnection();
    static Scanner sc = new Scanner(System.in);
    public static void ConsulterQuestions() {
        conn.lire("Select * from questions;",true);
    }
     public static void ajouterQuestion() {
    System.out.println("Donne moi votre nom");
    String ClientNom= sc.nextLine();
    System.out.println("Donne moi le question que vous pouvez poser ");
    String question = sc.nextLine();
    String query = "INSERT INTO questions (ClientName, question, dateQuestion) VALUES ('" 
    + ClientNom + "', '" + question+ "', '" + new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date()) + "')";
    conn.insert(query);
    System.out.println("question ajoutée avec succées!");
 }
 public static void Acceder_mes_questions() {
    System.out.println("Donne moi votre nom");
    String ClientNom = sc.nextLine();
    String query = "SELECT * FROM questions WHERE ClientName = '" + ClientNom + "'";
    System.out.println("Voiçi les questions que vous avez posées :");
    conn.lire(query, false);
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
        // Formatage de la date actuelle
        String dateReponse = new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date());
        // Mise à jour avec la date de réponse
        conn.update("UPDATE questions SET reponse = '" + reponse + "', GerantName = '" + nom + "', dateReponse = '" + dateReponse + "' WHERE QuestionID = " + id + ";");
         System.out.println("Reponse ajoutée avec succés");
         System.out.println("Avez-vous besoin d'autre services ?");
         GestionQuestions GQ = new GestionQuestions(2);
     }
     private static int reponse() {
        Scanner myObj = new Scanner(System.in);
        int y = myObj.nextInt();
        return y;
    }
}