public class Voiture {

    // Attributs
    private String modele;
    private String immatriculation;

    // Constructeur
    public Voiture(String modele, String immatriculation) {
        this.modele = modele;
        this.immatriculation = immatriculation;
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
}