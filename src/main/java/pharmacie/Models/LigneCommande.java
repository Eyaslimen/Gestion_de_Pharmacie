package pharmacie.Models;

public class LigneCommande {
    private Integer CommandeID;
    private Integer ProduitID;
    private int Quantite;
    private float PrixUnitaire;
     
    public LigneCommande(Integer CommandeID , Integer ProduitId, int Quantite , int PrixUnitaire) {
        this.CommandeID = CommandeID;
        this.ProduitID = ProduitID;
        this.Quantite = Quantite;
        this.PrixUnitaire = PrixUnitaire;  
    } 
    // Getters and Setters
    public Integer getCommandeID() {
        return CommandeID;
    }

    public void setCommandeID(Integer commandeID) {
        this.CommandeID = commandeID;
    }

    public Integer getProduitID() {
        return ProduitID;
    }

    public void setProduitID(Integer produitID) {
        this.ProduitID = produitID;
    }

    public int getQuantite() {
        return Quantite;
    }

    public void setQuantite(int quantite) {
        this.Quantite = quantite;
    }

    public float getPrixUnitaire() {
        return PrixUnitaire;
    }

    public void setPrixUnitaire(float prixUnitaire) {
        this.PrixUnitaire = prixUnitaire;
    }
}
