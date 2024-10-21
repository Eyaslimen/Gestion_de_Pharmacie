package pharmacie.Users;
import java.util.Scanner;

import pharmacie.Services.GestionQuestions;
public class Gerant {
    public Gerant() {
        System.out.println(
            "Bonjour , Comment nous allons vous aide aujourd'hui ? \n 1-Gestion des Questions \n 2- Gestion des Conseils \n"); 
        int y = repondre();
        switch (y) {
            case 1:
            GestionQuestions gestionquestions = new GestionQuestions();
               break;
            case 2:
            System.out.println("conseils");
            break;
    } }
    public int repondre() {
        Scanner myObj = new Scanner(System.in);
        int x = myObj.nextInt();
        return x;
    }
}


