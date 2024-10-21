package pharmacie.Models;

public class Conseil {
    private Integer PharmacienID;
    private String titre;
    private String contenu;

    // Getters
    public Integer getPharmacienID() {
        return PharmacienID;
    }

    public String getTitre() {
        return titre;
    }

    public String getContenu() {
        return contenu;
    }

    // Setters
    public void setPharmacienID(Integer pharmacienID) {
        this.PharmacienID = pharmacienID;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }
}
