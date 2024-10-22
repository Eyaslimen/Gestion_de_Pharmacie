package pharmacie.Services;

import pharmacie.Users.GerantRespo;
import pharmacie.Users.PharmacienRespo;
import java.util.*;
public class GestionsUtilisateurs {
    public GestionsUtilisateurs() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Bonjour au notre systéme de gestion de Pharmacie , quelle est votre position ? \n 1 - Gerant \n 2 - Pharmacien \n 3 - Employe \n 4 - Client");
        int choix1=myObj.nextInt();
        switch(choix1) {
        case 1:
            GerantRespo GerantResponsabilite = new GerantRespo();
            break;
        case 2:
            PharmacienRespo PharmacienResponsabilite= new PharmacienRespo();
            break;
        case 3:
            System.out.println("vous etes un client");
            break;
        case 4:
        System.out.println("vous etes un client");
        break;
        default:
            System.out.println("vous n'etes pas un gerant, un pharmacien ou un client");
        
        } 
    }
}
