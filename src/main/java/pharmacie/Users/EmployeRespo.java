package pharmacie.Users;
import pharmacie.Services.*;
import java.util.Scanner;
public class EmployeRespo {
    public EmployeRespo() 
    {
        getReponse();
    }
    public void getReponse() {
        System.out.println("\n Que souhaitez-vous faire ? \n 1-Gestion des Commandes \n 2-Gestion des produits \n 3-Gestion des factures \n 4-Retourner ");
        int y=reponse();
        switch (y) {
            case 1:
             GestionCommandes GC = new GestionCommandes(2);
            case 2:
             GestionProduits GP = new GestionProduits(2);
            case 3:
             GestionFactures GF = new GestionFactures();
            case 4:
            GestionsUtilisateurs gu = new GestionsUtilisateurs();
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


