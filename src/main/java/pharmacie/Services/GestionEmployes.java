package pharmacie.Services;
import pharmacie.Dao.EmployeDao;
import java.util.Scanner;
import pharmacie.Users.GerantRespo;
public class GestionEmployes {
    public GestionEmployes() {
        getResponse();
    }

    public void getResponse() {
        System.out.println("1-Consulter Employés \n 2-Ajouter un employe \n 3-Supprimer un Employe \n 4-Changer un Employe \n 5-Retourner ");
        int x = reponse();
        switch (x) {
            case 1:
            EmployeDao.ConsulterEmployes();
            System.out.println("Avez-vous besoin d'autre service?");
            getResponse();
            break;
            case 2:
            EmployeDao.AjouterEmployes();
            System.out.println("Avez-vous besoin d'autre service?");
            getResponse();
            break;
            case 3:
            EmployeDao.SupprimerEmployes();
            System.out.println("Avez-vous besoin d'autre service?");
            getResponse();
            break;
            case 4:
            EmployeDao.ChangerEmploye();
            System.out.println("Avez-vous besoin d'autre service?");
            getResponse();
            case 5:
            GerantRespo gr = new GerantRespo();
            break;
            default:
            System.out.println("Veuillez choisir une option valide");
            getResponse();
        }
    }
    private int reponse() {
        Scanner myObj = new Scanner(System.in);
        int y = myObj.nextInt();
        return y;
    }

}
