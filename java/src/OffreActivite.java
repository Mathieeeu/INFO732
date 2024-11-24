import java.time.LocalDate;

public class OffreActivite extends Offre {
    
    // Attributs
    private Activite activite;

    // Constructeur
    public OffreActivite(Personne auteur, LocalDate datePublication, String description, Activite activite) {
        super(auteur, datePublication, description);
        this.activite = activite;
    }

    // Getters et Setters
    public Activite getActivite() {
        return activite;
    }

    public void setActivite(Activite activite) {
        this.activite = activite;
    }

    public String toString() {
        return "Offre d'activité :\n\t- Nombre d'inscrits : " + this.getParticipants().size() + "\n" + super.toString();
    }
}
