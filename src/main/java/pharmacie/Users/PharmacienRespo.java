package pharmacie.Users;
import java.util.*;
import pharmacie.Services.GestionConseils;
import pharmacie.Services.GestionQuestions;
import pharmacie.Services.GestionsUtilisateurs;

public class PharmacienRespo {
   public PharmacienRespo() {
        System.out.println(
            "Bonjour , Comment nous allons vous aide aujourd'hui ? \n 1-Gestion des Questions \n 2-Gestion des Conseils \n 3-Retourner"); 
        int y = reponse();
        switch (y) {
            case 1:
            GestionQuestions gestionquestions = new GestionQuestions();
               break;
            case 2:
            GestionConseils gestionconseil = new GestionConseils();
            break;
            case 3:
            GestionsUtilisateurs Gu= new GestionsUtilisateurs();

    } }

    public int reponse() {
        Scanner myObj = new Scanner(System.in);
        int x = myObj.nextInt();
        return x;
    }
}