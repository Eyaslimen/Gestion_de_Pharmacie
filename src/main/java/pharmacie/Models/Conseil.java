package pharmacie.Models;

public class Conseil {
    private String PharmacienName;
    private String titre;
    private String contenu;
    public Conseil(String pharmacienName,String titre,String contenu ) {
        this.PharmacienName=pharmacienName;
        this.titre=titre;
        this.contenu=contenu;
    }
    // Getters
    public String getPharmacienName() {
        return PharmacienName;
    }

    public String getTitre() {
        return titre;
    }

    public String getContenu() {
        return contenu;
    }

    // Setters
    public void setPharmacienID(String PharmacienName) {
        this.PharmacienName = PharmacienName;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }
}
