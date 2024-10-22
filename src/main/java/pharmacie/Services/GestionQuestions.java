package pharmacie.Services;

import java.util.Scanner;

import pharmacie.Dao.QuestionDao;
import pharmacie.Users.PharmacienRespo;

public class GestionQuestions {
    private int x=0;
    public GestionQuestions() {
        getReponse();

    }
    public void getReponse() {
       this.x++;
        if(x>1) { System.out.println("Merci de Vérifier votre choix ! "); }
        System.out.println("1-Acceder au questions \n 2-Repondre aux questions sans réponse \n 3-Retourner");
        int y=reponse();
        switch(y) {
            case 1 :
                QuestionDao.lireQuestions();
                break;
            case 2 :
                System.out.println("ok2");
                break;
            case 3 :
                PharmacienRespo pr = new PharmacienRespo();
            default :
                getReponse();
    } 
    }
    private int reponse() {
        Scanner myObj = new Scanner(System.in);
        int y = myObj.nextInt();
        return y;
    }
}
