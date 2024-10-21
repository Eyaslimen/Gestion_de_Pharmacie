package pharmacie.Models;

import java.sql.Date;

import pharmacie.Enums.Etat;

public class Commande {
    public Commande() {}
    private Date DateCommande;
    private Etat etat;
    private float TotalCommande;

    //Getters and Setters 
    public Date getDateCommande() {
        return DateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.DateCommande = dateCommande;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public float getTotalCommande() {
        return TotalCommande;
    }

    public void setTotalCommande(float totalCommande) {
        this.TotalCommande = totalCommande;
    }


    }


