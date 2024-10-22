package pharmacie.Dao;
import java.math.BigDecimal;
import java.util.Scanner;
import pharmacie.Database.DatabaseConnection;

public class ProduitDao {
    static DatabaseConnection conn =new DatabaseConnection();
    static Scanner sc = new Scanner(System.in);

    public static void ConsulterProduits() {
        conn.lire("Select * from produits;", true);
        }
    public static void AjouterProduit() {
            System.out.println("entrer le nom du produit");
            String nom = sc.nextLine();
            System.out.println("donner la description de ce produit");
            String description = sc.nextLine();
            System.out.println("entrer le prix de ce produit");
            String prixStr = sc.nextLine();
            // Convertir la chaîne en BigDecimal
            BigDecimal prix = new BigDecimal(prixStr);
            System.out.println("entrer la quantité dispo de ce produit");
            int stock = sc.nextInt();
            String requete = "INSERT INTO produits (nom, description, prix, stock) VALUES ('" + nom + "', '" + description + "', " + prix + ", " + stock + ");";
            // Exécution de la requête
            conn.insert(requete);
        }
        public static void SupprimerProduit() {
            System.out.println("Entrer l'id du produit a supprimer");
            int id = sc.nextInt();
            String requete = "DELETE FROM produits WHERE ProduitID = "+id;
            conn.delete(requete);
        }
        public static void ChangerProduit() {
        System.out.println("Donne moi l'id de produit :");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Ce que vous voulez changer?");
        String colonne = sc.nextLine();
        System.out.println("Donne moi le nv valeur?");
        String valeur = sc.nextLine(); 
        String requete = "UPDATE produits SET " + colonne + " = '" + valeur + "' WHERE ProduitID = " + id + ";";
        conn.update(requete);
        }
        public static void ChercherProduit() {
            System.out.println("Entrer le nom du produit a chercher");
            String P_a_rechercher=sc.nextLine();
            System.out.println("Voiçi la resultat du recherche");
            conn.lire("Select * from produits where nom Like'%"+P_a_rechercher+"%';",false);
        }
    
        public static void Consulter_tendance_Produits() {
            System.out.println("Voiçi les produits les plus achetées");
            conn.lire("Select * from produits ORDER BY stock ASC Limit 20;",false);
        }
        public static void Consulter_repture_Produits() {
            System.out.println("Voiçi les produits qui sont en repture de stock");
            conn.lire("Select * from produits Where stock = 0;", false);
        }
}
