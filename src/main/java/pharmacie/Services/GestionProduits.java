package pharmacie.Services;

import java.util.Scanner;

import pharmacie.Dao.ProduitDao;
import pharmacie.Dao.ProduitDao;
import pharmacie.Users.GerantRespo;

public class GestionProduits {
    public GestionProduits() {
        getResponse();
    }
    public void getResponse() {
        System.out.println("1-Acceder au produits \n 2-Ajouter un produit \n 3-Supprimer un Produit \n 4-Changer un Profile \n 5-Chercher un Produit  \n 6-Consulter les produits en tendance \n 7-Consulter les produits en repture de stock \n 8-Retourner ");
        int y=reponse();
        switch(y) {
            case 1 :
                ProduitDao.ConsulterProduits();
                System.out.println("Avez-vous besoin d'autre service?");
                getResponse();
                break;
            case 2 :
                ProduitDao.AjouterProduit();
                System.out.println("Avez-vous besoin d'autre service?");
                getResponse();
                break;
            case 3 :
                ProduitDao.SupprimerProduit();
                System.out.println("Avez-vous besoin d'autre service?");
                getResponse();
                break;
            case 4 :
                ProduitDao.ChangerProduit();
                System.out.println("Avez-vous besoin d'autre service?");
                getResponse();
                break;
            case 5 :
                ProduitDao.ChercherProduit();
                System.out.println("Avez-vous besoin d'autre service?");
                getResponse();
                break;
            case 6 :
                ProduitDao.Consulter_tendance_Produits();
                System.out.println("Avez-vous besoin d'autre service?");
                getResponse();
                break;
            case 7 :
                ProduitDao.Consulter_repture_Produits();
                System.out.println("Avez-vous besoin d'autre service?");
                getResponse();
                break;
            case 8 :
                GerantRespo pr = new GerantRespo();

            default :
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
