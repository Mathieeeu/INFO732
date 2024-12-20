import java.time.LocalDate;

public class OffreLogement extends Offre {
    
    // Attributs
    private Logement logement;

    // Constructeur
    public OffreLogement(Proprietaire auteur, LocalDate datePublication, String description, Logement logement) {
        super(auteur, datePublication, description);
        this.logement = logement;
    }

    // Getters et Setters
    public Logement getLogement() {
        return logement;
    }

    public void setLogement(Logement logement) {
        this.logement = logement;
    }

    public String toString() {
        String etat;
        if (this.getParticipants().isEmpty()) {
            etat = "(Disponible) ";
        } else {
            etat = "(Réservé) ";
        }
        return "Offre de logement "+ etat +":\n" + super.toString() + "\n\t" + logement.toString();
    }
}
