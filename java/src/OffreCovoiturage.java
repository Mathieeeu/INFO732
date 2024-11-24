import java.time.LocalDate;

public class OffreCovoiturage extends Offre {
    
    // Attributs
    private Conducteur conducteur;
    private int nbPlaces;

    // Constructeur
    public OffreCovoiturage(Conducteur auteur, LocalDate datePublication, String description, Conducteur conducteur, int nbPlaces) {
        super(auteur, datePublication, description);
        this.conducteur = conducteur;
        this.nbPlaces = nbPlaces;
    }

    // Getters et Setters
    public Conducteur getConducteur() {
        return conducteur;
    }

    public void setConducteur(Conducteur conducteur) {
        this.conducteur = conducteur;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public String toString() {
        String etat;
        if (this.getParticipants().size() == this.nbPlaces) {
            etat = "(Complet) ";
        } else {
            etat = "(Disponible) ";
        }
        return "Offre de covoiturage " + etat + ":\n" + super.toString() + "\n\t- Conducteur : " + conducteur.getPrenom() + " " + conducteur.getNom() + "\n\t- Places occupées : " + this.getParticipants().size() + "/" + nbPlaces;
    }
}
