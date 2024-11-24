public class Materiel {

    // Attributs
    private String nom;
    private String description;

    // Constructeur
    public Materiel(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return this.nom + " (" + this.description + ")";
    }
}
