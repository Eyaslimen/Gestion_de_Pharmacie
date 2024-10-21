package pharmacie.Models;

public class Client {
    private String Nom;
    private String Prenom;
    private String Telephone;
    // Getters
public String getNom() {
    return Nom;
}

public String getPrenom() {
    return Prenom;
}

public String getTelephone() {
    return Telephone;
}
// Setters
public void setNom(String nom) {
    this.Nom = nom;
}

public void setPrenom(String prenom) {
    this.Prenom = prenom;
}

public void setTelephone(String telephone) {
    this.Telephone = telephone;
}
}
