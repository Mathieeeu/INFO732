import java.time.LocalDate;

public class OffreTutorat extends Offre {

    // Attributs
    private Tuteur tuteur;
    private String matiere;

    // Constructeur
    public OffreTutorat(Tuteur auteur, LocalDate datePublication, String description, String matiere) {
        super(auteur, datePublication, description);
        this.matiere = matiere;
    }

    // Getters et Setters
    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public String toString() {
        String etat;
        if (this.getParticipants().isEmpty()) {
            etat = "(Disponible) ";
        } else {
            etat = "(Complet) ";
        }
        return "Offre de tutorat " + etat + ":\n" + super.toString() + "\n\t- Tuteur : " + tuteur.getPrenom() + " " + tuteur.getPrenom() + "\n\t- Matière : " + matiere;
    }
}
