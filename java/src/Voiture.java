public class Voiture {

    // Attributs
    private String modele;
    private String immatriculation;
    private Conducteur proprietaire;

    // Constructeur
    public Voiture(String modele, String immatriculation, Conducteur proprietaire) {
        this.modele = modele;
        this.immatriculation = immatriculation;
        this.proprietaire = proprietaire;
    }

    // Getters et Setters
    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public Conducteur getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Conducteur proprietaire) {
        this.proprietaire = proprietaire;
    }
}