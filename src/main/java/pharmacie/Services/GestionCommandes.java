package pharmacie.Services;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import pharmacie.Dao.CommandeDao;
import pharmacie.Dao.ProduitDao;
import pharmacie.Users.ClientRespo;
import pharmacie.Users.EmployeRespo;

public class GestionCommandes {
    Scanner sc = new Scanner(System.in);
    private int x=0;
    private Map<Integer, Integer> produitsQuantites = new HashMap<>();

    public GestionCommandes(int i ) {
        if(i==1) {
            getResponse_Client(); }
        else {
            getResponse_Employe();
        }
    }
    // Gestion des commandes coté employé
    private void getResponse_Employe() {
        CommandeDao.ConsulterCommandes_employe();
        System.out.println("Pouvez vous valider une commande? \n 1-Oui \n 2-Retourner");
        int x = sc.nextInt();
        switch(x) {
            case 1:
            ValiderCommande();
            break;
            case 2:
            EmployeRespo er= new EmployeRespo();
            break;
            default:
            System.out.println("Veuillez choisir une option valide");
            getResponse_Employe();
        }
    }

    private void ValiderCommande() {
        System.out.println("Veuillez entrer l'ID de la commande à valider :");
        int x = sc.nextInt();
        CommandeDao.ValiderCommande(x);
        AutreCommande();
        }

    private void AutreCommande() {
        System.out.println("Pouvez vous valider une autre commande ? \n 1-Oui \n 2-Retourner ");
        int y = sc.nextInt();
        switch(y) {
            case 1:
            ValiderCommande();
            break;
            case 2:
            EmployeRespo er = new EmployeRespo();
            break;
            default:
            System.out.println("Veuillez choisir une option valide");
            AutreCommande();
    } }
    // Gestion des commandes coté Client
    public void getResponse_Client() {
        System.out.println("Voiçi l'ensemble des produits ainsi que leurs détails :");
        ProduitDao.ConsulterProduits_client(false);
        AjouterProduit();
        System.out.println("Voiçi Votre commande :");
        for (Integer i : produitsQuantites.keySet() ) {
                System.out.println("Produit ID : "+i+" Quantité : "+produitsQuantites.get(i));
        }
        System.out.println("______________");
        System.out.println("Total : " +total());
        PasserCommande();
        System.out.println("Entrer votre id :");
        int Clientid = sc.nextInt();

        int cmdId=CommandeDao.AjouterCommande(Clientid ,total());
        System.out.println("Commande ajoutée avec succès");
        ClientRespo cr = new ClientRespo();
    }
    public void AjouterProduit() {
        this.x++;
        if(x>1) {System.out.println("\n Merci de choisir une option valide. \n 1-Ajouter un Produit \n 2-Retourner \n 3-Passer la commande"); }
        else {
            System.out.println("\n Merci de choisir une option valide. \n  1-Ajouter un Produit \n 2-Retourner");
        }
        int choix = sc.nextInt();
        switch (choix) {
            case 1:
            System.out.println("Veuillez entrer le numéro du produit que vous souhaitez commander :");
            int idProduit = sc.nextInt();
            System.out.println("Veuillez entrer la quantité que vous souhaitez commander :");
            int quantite = sc.nextInt();
            produitsQuantites.put(idProduit, quantite);
            System.out.println(" \n Produit ajoutée avec succées");
            AjouterProduit();
            break;
            case 2:
            ClientRespo cr = new ClientRespo();
            produitsQuantites.clear();
            break;
            case 3:
            if(produitsQuantites.size()>0) {
                break;
            }
            else {
            System.out.println("Veuillez choisir une option valide");
            AjouterProduit();
            }
            default:
            System.out.println("Veuillez choisir une option valide");
            AjouterProduit();

        }
    }
    public void PasserCommande() {
        System.out.println("Etes-vous sûr de Passer cette commande?");
        System.out.println("1-Oui \n 2-Supprimer un Produit \n 3-Changer la quantité d'un produit \n 4-Annuler la commande");
        int choix = sc.nextInt();
        switch(choix) {
            case 1:
            System.out.println("commande a passer");
            break;
            case 2:
            SupprimerProduit();
            break;
            case 3:
            ChangerQuantite();
            break;
            case 4:
            System.out.println("Votre commande est annulée");
            ClientRespo cr = new ClientRespo();
            break;
            default:
            System.out.println("Veuillez choisir une option valide");
            PasserCommande();
        }

    }
    private void ChangerQuantite() {
        System.out.println("Entrez l'ID du produit dont vous souhaitez modifier la quantité.");
        int id = sc.nextInt();
        System.out.println("Taper la nouvelle quantité");
        int quantite = sc.nextInt();
        produitsQuantites.put(id, quantite);
        System.out.println("Quantité changée avec succées");
        PasserCommande();
    }
    private void SupprimerProduit() {
        System.out.println("Entrez l'ID du produit que vous souhaitez supprimer");
        int id = sc.nextInt();
        produitsQuantites.remove(id);
        System.out.println("Produit supprimeé avec succées");
        PasserCommande();
    }
    public float total() {
        float total=0;
        for (Integer i : produitsQuantites.keySet() ) {
        total+=produitsQuantites.get(i)*ProduitDao.VoirPrix(i);
        } 
        return total;
    }


}
