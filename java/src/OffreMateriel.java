import java.time.LocalDate;

public class OffreMateriel extends Offre {
    
    // Attributs
    private Materiel materiel;

    // Constructeur
    public OffreMateriel(Personne auteur, LocalDate datePublication, String description, Materiel materiel) {
        super(auteur, datePublication, description);
        this.materiel = materiel;
    }

    // Getters et Setters
    public Materiel getMateriel() {
        return materiel;
    }

    public void setMateriel(Materiel materiel) {
        this.materiel = materiel;
    }
}
