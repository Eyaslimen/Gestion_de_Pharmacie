package pharmacie.Users;
import pharmacie.Dao.*;
import pharmacie.Services.*;
import java.util.Scanner;
public class ClientRespo {
    public ClientRespo() 
    {
        getReponse();
    }
    public void getReponse() {
        System.out.println("1-Consulter les produits \n 2-Passer une commande \n 3-Retourner ");
        int y=reponse();
        switch (y) {
            case 1:
             ProduitDao.ConsulterProduits();
             System.out.println("Avez-vous besoin d'autre service ?");
             getReponse();
            case 2:
            CommandeDao.passerCommande();
            break;
            case 3:
            GestionsUtilisateurs gu = new GestionsUtilisateurs();
            break;
            default:
            System.out.println("Veuillez choisir une option valide");
            getReponse();
            } }
    public int reponse() {
        Scanner myObj = new Scanner(System.in);
        int x = myObj.nextInt();
        return x;
    }
}


