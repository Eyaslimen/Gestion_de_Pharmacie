package pharmacie.Services;
import java.util.Scanner;
import pharmacie.Dao.QuestionDao;
import pharmacie.Users.PharmacienRespo;

public class GestionQuestions {
    public GestionQuestions() {
        getReponse();

    }
    public void getReponse() {
        System.out.println("\n Merci de choisir une option valide \n 1-Acceder au questions \n 2-Repondre aux questions sans réponse \n 3-Retourner");
        int y=reponse();
        switch(y) {
            case 1 :
                QuestionDao.ConsulterQuestions();
                System.out.println("Avez-vous besoin d'un autre service ?");
                getReponse();
                break;
            case 2 :
                QuestionDao.RepondreQuestions();
                System.out.println("Avez-vous besoin d'un autre service ?");
                getReponse();
                break;
            case 3 :
                PharmacienRespo pr = new PharmacienRespo();
                System.out.println("Avez-vous besoin d'un autre service ?");
                getReponse();
            default :
                System.out.println("Veuillez choisir une option valide");
                getReponse();
    } 
    }
    private int reponse() {
        Scanner myObj = new Scanner(System.in);
        int y = myObj.nextInt();
        return y;
    }
}
