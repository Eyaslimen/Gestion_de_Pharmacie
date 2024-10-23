package pharmacie.Users;
import java.util.Scanner;
import pharmacie.Services.GestionConseils;
import pharmacie.Services.GestionEmployes;
import pharmacie.Services.GestionProduits;
import pharmacie.Services.GestionQuestions;
import pharmacie.Services.GestionsUtilisateurs;

public class GerantRespo {
    public GerantRespo() {
        getReponse();
        }
    public void getReponse() {
        System.out.println("\n Que souhaitez-vous faire ? \n 1-Gestion des employes \n 2-Gestion des produits \n 3-Retourner ");
        int y=reponse();
        switch (y) {
            case 1:
             GestionEmployes GE = new GestionEmployes();
            case 2:
             GestionProduits GP = new GestionProduits();
            case 3:
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


