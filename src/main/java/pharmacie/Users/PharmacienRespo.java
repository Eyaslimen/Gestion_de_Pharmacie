package pharmacie.Users;
import java.util.*;
import pharmacie.Services.GestionConseils;
import pharmacie.Services.GestionQuestions;
import pharmacie.Services.GestionsUtilisateurs;

public class PharmacienRespo {
   public PharmacienRespo() {
    getResponse();
 }
    public void getResponse() {
        System.out.println(
            " \n Que souhaitez-vous faire ? \n 1-Gestion des Questions \n 2-Gestion des Conseils \n 3-Retourner"); 
        int y = reponse();
        switch (y) {
            case 1:
            GestionQuestions gestionquestions = new GestionQuestions(2);
               break;
            case 2:
            GestionConseils gestionconseil = new GestionConseils();
            break;
            case 3:
            GestionsUtilisateurs Gu= new GestionsUtilisateurs();
            default:
            System.out.println("Veuillez choisir une option valide");
            getResponse();
    }
    }
    public int reponse() {
        Scanner myObj = new Scanner(System.in);
        int x = myObj.nextInt();
        return x;
    }
}