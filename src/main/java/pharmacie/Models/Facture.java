package pharmacie.Models;

import java.sql.Date;

public class Facture {
    private Integer CommandeID;
    private Date DateFacture; 
    private float MontantTotal;

    public Facture(Integer CommandeID,Date DateFacture,float MontantTotal) {
        this.CommandeID = CommandeID;
        this.DateFacture = DateFacture;
        this.MontantTotal = MontantTotal;
    }
// getters and setters :
public Integer getCommandeID() {
    return CommandeID;
}

public Date getDateFacture() {
    return DateFacture;
}

public float getMontantTotal() {
    return MontantTotal;
}
public void setCommandeID(Integer CommandeID) {
    this.CommandeID = CommandeID;
}

public void setDateFacture(Date DateFacture) {
    this.DateFacture = DateFacture;
}

public void setMontantTotal(float MontantTotal) {
    this.MontantTotal = MontantTotal;
}
}
