package pharmacie.Dao;

import java.math.BigDecimal;
import java.util.Scanner;

import pharmacie.Database.DatabaseConnection;

public class CommandeDao {
static DatabaseConnection conn =new DatabaseConnection();
static Scanner sc = new Scanner(System.in);
       //Ajouter une commande par un client
    public static synchronized int AjouterCommande(int Clientid , float total) {
        Object x = conn.lireValeur("SELECT MAX(CommandeID) FROM commandes;");
        int CommandeID = (int) x;
        CommandeID+=1;
        String requete = "INSERT INTO commandes (CommandeID, ClientID, DateCommande, Etat, TotalCommande) VALUES (" 
        + CommandeID + ", " 
        + Clientid + ", '" 
        + new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date()) + "', '" 
        + "En_attente" + "', " 
        + total + ");";
        conn.insert(requete);
        System.out.println("Commande ajoutée avec succées!");
        return CommandeID;
    }

    // Acceder au commandes d'un client 
     public static void ConsulterCommandes_client(int ClientID) {
        System.out.println("Voici les commandes que vous avez passées :");
        conn.lire("Select * From Commandes where ClientID="+ClientID,false);
     }

     //Acceder au commandes Employe 
     public static void ConsulterCommandes_employe() {
        System.out.println("Voici l'ensemble des commandes à valider");
        conn.lire("SELECT * FROM Commandes WHERE Etat = 'En_attente';", false);
    }

     public static void ValiderCommande(int CommandeId) {
        conn.update("UPDATE commandes SET Etat = 'Validée' WHERE CommandeID = "+CommandeId+";");
        System.out.println("Commande validée!");
        Object total_dec = conn.lireValeur("Select TotalCommande from commandes where CommandeID = "+CommandeId);
        BigDecimal totalDecimal = (BigDecimal) total_dec;
        float total = totalDecimal.floatValue();
        String requete = "INSERT INTO factures (CommandeID, DateFacture, MontantTotal) VALUES (" 
        + CommandeId + 
        ",'" + new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date()) + "',"
        + total + ");";
        conn.insert(requete);
        System.out.println("Facture générée avec succès");
     }

}
