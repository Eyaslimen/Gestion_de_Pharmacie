package pharmacie.Services;

import java.util.Scanner;

import pharmacie.Dao.FactureDao;
import pharmacie.Dao.QuestionDao;
import pharmacie.Users.EmployeRespo;
import pharmacie.Users.PharmacienRespo;

public class GestionFactures {
    Scanner sc = new Scanner(System.in);
    public GestionFactures() {
        getResponse();
    }
    public void getResponse() {
        System.out.println("\n Merci de choisir une option valide \n 1-Voir Factures \n 2-Annuler une facture \n 3-Ajouter une facture \n 4-Retourner");
        int y=sc.nextInt();
        switch(y) {
            case 1 :
                FactureDao.ConsulterFactures();
                System.out.println("Avez-vous besoin d'un autre service ?");
                getResponse();
                break;
            case 2 :
                FactureDao.SupprimerFacture();
                System.out.println("Avez-vous besoin d'un autre service ?");
                getResponse();
                break;
            case 3 :
                FactureDao.AjouterFacture();
                System.out.println("Avez-vous besoin d'un autre service ?");
                getResponse();
            case 4 :
                EmployeRespo er= new EmployeRespo();
            default :
                System.out.println("Veuillez choisir une option valide");
                getResponse();
    } 

    }
}
