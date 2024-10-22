package pharmacie.Services;
import java.util.Scanner;
import pharmacie.Dao.ConseilDao;
import pharmacie.Dao.ConseilDao;
import pharmacie.Database.DatabaseConnection;
import pharmacie.Users.PharmacienRespo;
public class GestionConseils {
    public GestionConseils() {
        System.out.println("1-Voir Conseils \n 2-Supprimer un Conseil \n 3-Modifier un Conseil \n 4-Ajouter un Conseil \n 5-Retourner");
        int x1=reponse();
        switch(x1) {
            case 1:
             ConseilDao.lireConseils();
             break;
            case 2:
             ConseilDao.supprimerConseil();
             break;
            case 3:
             ConseilDao.changerConseil();
             break;
             case 4:
             ConseilDao.ajouterConseil();
             break;
             case 5:
             PharmacienRespo pharmacienresp = new PharmacienRespo();
        }
    }

    private int reponse() {
        Scanner myObj = new Scanner(System.in);
        int x = myObj.nextInt();
        return x;
    }


}
