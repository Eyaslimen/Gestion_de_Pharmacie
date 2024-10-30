package pharmacie.Services;

import java.util.Scanner;

import pharmacie.Dao.ProduitDao;
import pharmacie.Dao.ProduitDao;
import pharmacie.Users.EmployeRespo;
import pharmacie.Users.GerantRespo;

public class GestionProduits {
    public GestionProduits(int i) {
        getResponse(i);
    }
    
    public void getResponse(int i) {
        System.out.println("\n Merci de choisir une option valide. \n 1-Acceder au produits \n 2-Ajouter un produit \n 3-Supprimer un Produit \n 4-Changer un Produit \n 5-Chercher un Produit  \n 6-Consulter les produits en tendance \n 7-Consulter les produits en repture de stock \n 8-Retourner ");
        int y=reponse();
        switch(y) {
            case 1 :
                ProduitDao.ConsulterProduits(true);
                System.out.println("Avez-vous besoin d'un autre service ?");
                getResponse(i);
                break;
            case 2 :
                ProduitDao.AjouterProduit();
                System.out.println("Avez-vous besoin d'un autre service ?");
                getResponse(i);
                break;
            case 3 :
                ProduitDao.SupprimerProduit();
                System.out.println("Avez-vous besoin d'un autre service ?");
                getResponse(i);
                break;
            case 4 :
                ProduitDao.ChangerProduit();
                System.out.println("Avez-vous besoin d'un autre service ?");
                getResponse(i);
                break;
            case 5 :
                ProduitDao.ChercherProduit();
                System.out.println("Avez-vous besoin d'un autre service ?");
                getResponse(i);
                break;
            case 6 :
                ProduitDao.Consulter_tendance_Produits();
                System.out.println("Avez-vous besoin d'un autre service ?");
                getResponse(i);
                break;
            case 7 :
                ProduitDao.Consulter_repture_Produits();
                System.out.println("Avez-vous besoin d'un autre service ?");
                getResponse(i);
                break;
            case 8 :
                if(i==1) {GerantRespo pr = new GerantRespo(); }
                else {
                    EmployeRespo er= new EmployeRespo();
                }

            default :
                System.out.println("Veuillez choisir une option valide");
                getResponse(i);
    }
    }
        private int reponse() {
        Scanner myObj = new Scanner(System.in);
        int y = myObj.nextInt();
        return y;
    }
}