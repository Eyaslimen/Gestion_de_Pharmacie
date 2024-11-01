package pharmacie.Services;

import pharmacie.Users.ClientRespo;
import pharmacie.Users.EmployeRespo;
import pharmacie.Users.GerantRespo;
import pharmacie.Users.PharmacienRespo;
import java.util.*;
public class GestionsUtilisateurs {
    public GestionsUtilisateurs() {
        getReponse();
    }
    
    public void getReponse() {
        Scanner myObj = new Scanner(System.in);
        System.out.println(" \n  Bonjour et bienvenue dans notre système de gestion de pharmacie. \n Pourriez-vous s'il vous plaît indiquer votre rôle ? \n 1 - Gerant \n 2 - Pharmacien \n 3 - Employe \n 4 - Client ");
        int choix1=myObj.nextInt();
        switch(choix1) {
        case 1:
            GerantRespo GerantResponsabilite = new GerantRespo();
            break;
        case 2:
            PharmacienRespo PharmacienResponsabilite= new PharmacienRespo();
            break;
        case 3:
            EmployeRespo ER = new EmployeRespo();
            break;
        case 4:
            ClientRespo CR = new ClientRespo();
        break;
        default:
        System.out.println("Veuillez choisir une option valide");
        getReponse();
        } 
    }
}
