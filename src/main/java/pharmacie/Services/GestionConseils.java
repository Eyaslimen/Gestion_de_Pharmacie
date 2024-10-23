package pharmacie.Services;
import java.util.Scanner;
import pharmacie.Dao.ConseilDao;
import pharmacie.Database.DatabaseConnection;
import pharmacie.Users.PharmacienRespo;
public class GestionConseils {
    public GestionConseils() {
        getReponse();
    }
    public void getReponse() {
        System.out.println("\n Merci de choisir une option valide. \n 1-Voir Conseils \n 2-Supprimer un Conseil \n 3-Modifier un Conseil \n 4-Ajouter un Conseil \n 5-Retourner");
        int x1=reponse();
        switch(x1) {
            case 1:
             ConseilDao.ConsulterConseils();
             System.out.println("Avez-vous besoin d'un autre service ?");
             getReponse();
             break;
            case 2:
             ConseilDao.supprimerConseil();
             System.out.println("Avez-vous besoin d'autre service ?");
             getReponse();
             break;
            case 3:
             ConseilDao.changerConseil();
             System.out.println("Avez-vous besoin d'autre service ?");
             getReponse();
             break;
             case 4:
             ConseilDao.ajouterConseil();
             System.out.println("Avez-vous besoin d'autre service ?");
             getReponse();
             break;
             case 5:
             PharmacienRespo pharmacienresp = new PharmacienRespo();
             default:
             System.out.println("Veuillez choisir une option valide");
             getReponse();
        }
    }
    private int reponse() {
        Scanner myObj = new Scanner(System.in);
        int x = myObj.nextInt();
        return x;
    }
}