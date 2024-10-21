package pharmacie.Services;
import java.util.Scanner;
import pharmacie.Dao.ConseilDao;
import pharmacie.Dao.ConseilDao;
import pharmacie.Database.DatabaseConnection;
public class GestionConseils {
    DatabaseConnection conn= new DatabaseConnection();
    public GestionConseils() {
        System.out.println("1-Voir Conseils \n 2-Supprimer un Conseil \n 3-Modifier un Conseil \n 4-Ajouter un Conseil");
        int x1=reponse();
        switch(x1) {
            case 1:
             conn.lire("Select * from Conseils;");
            case 2:
             System.out.println("2");
            case 3:
             System.out.println("3");
             case 4:
             ConseilDao.addConseil();

        }
    }

    private int reponse() {
        Scanner myObj = new Scanner(System.in);
        int x = myObj.nextInt();
        return x;
    }


}
