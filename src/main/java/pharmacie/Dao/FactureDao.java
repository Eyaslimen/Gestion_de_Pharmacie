package pharmacie.Dao;

import java.math.BigDecimal;
import java.util.Scanner;

import pharmacie.Database.DatabaseConnection;

public class FactureDao {
    static DatabaseConnection conn =new DatabaseConnection();
    static Scanner sc = new Scanner(System.in);

    public static void ConsulterFactures() {
        System.out.println("Voiçi l'ensemble des factures :");
        conn.lire("Select * from factures",false);
    }
    public static void AjouterFacture() {
        System.out.println("Veuillez entrer le numéro de la commande :");
        int CommandeId = sc.nextInt();
        System.out.println("Veuillez entrer le montant de la facture :");
        BigDecimal total = sc.nextBigDecimal();
        String requete = "INSERT INTO factures (CommandeID, DateFacture, MontantTotal) VALUES (" 
        + CommandeId + 
        ",'" + new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date()) + "',"
        + total + ");";
        conn.insert(requete);
        System.out.println("Facture générée avec succès!");
    }
    public static void SupprimerFacture() {
        System.out.println("Veuillez entrer le numéro de la facture à supprimer :");
        int FactureId = sc.nextInt();
        String requete = "DELETE FROM factures WHERE FactureID = " + FactureId;
        conn.delete(requete);
        System.out.println("Facture annulée avec succès!"); 
    }

    
}
