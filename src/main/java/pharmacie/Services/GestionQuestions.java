package pharmacie.Services;
import java.util.Scanner;
import pharmacie.Dao.QuestionDao;
import pharmacie.Users.ClientRespo;
import pharmacie.Users.PharmacienRespo;

public class GestionQuestions {
    public GestionQuestions(int i) {
        if(i==2) {
            getReponse_pharmacien(); }
        else {
            getReponse_client();
        }
    }
    public void getReponse_pharmacien() {
        System.out.println("\n Merci de choisir une option valide \n 1-Acceder au questions \n 2-Repondre aux questions sans réponse \n 3-Retourner");
        int y=reponse();
        switch(y) {
            case 1 :
                QuestionDao.ConsulterQuestions();
                System.out.println("Avez-vous besoin d'un autre service ?");
                getReponse_pharmacien();
                break;
            case 2 :
                QuestionDao.RepondreQuestions();
                System.out.println("Avez-vous besoin d'un autre service ?");
                getReponse_pharmacien();
                break;
            case 3 :
                PharmacienRespo pr = new PharmacienRespo();
                System.out.println("Avez-vous besoin d'un autre service ?");
                getReponse_pharmacien();
            default :
                System.out.println("Veuillez choisir une option valide");
                getReponse_pharmacien();
    } 
    }
    public void getReponse_client() {
        System.out.println("\n Merci de choisir une option valide \n 1-Acceder a vos questions \n 2-Poser un question \n 3-Retourner");
        int y=reponse();
        switch(y) {
            case 1 :
                QuestionDao.Acceder_mes_questions();
                System.out.println("Avez-vous besoin d'un autre service ?");
                getReponse_client();
                break;
            case 2 :
                QuestionDao.ajouterQuestion();
                System.out.println("Avez-vous besoin d'un autre service ?");
                getReponse_client();
                break;
            case 3 :
                ClientRespo pr = new ClientRespo();
                System.out.println("Avez-vous besoin d'un autre service ?");
                getReponse_client();
            default :
                System.out.println("Veuillez choisir une option valide");
                getReponse_client();
    } 
    }




    private int reponse() {
        Scanner myObj = new Scanner(System.in);
        int y = myObj.nextInt();
        return y;
    }
}
