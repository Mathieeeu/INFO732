import java.time.LocalDate;

public class Conducteur extends PersonneDecorator {
    
    // Attributs
    private Voiture vehicule;

    // Constructeur
    public Conducteur(Personne personne, Voiture vehicule) {
        super(personne);
        this.vehicule = vehicule;
    }

    // Getters et Setters
    public Voiture getVehicule() {
        return vehicule;
    }

    public void setVehicule(Voiture vehicule) {
        this.vehicule = vehicule;
    }

    // Méthodes
    // ToString
    public String toString() {
        return super.toString() + " (Conducteur)";
    }

    // Proposer une offre de covoiturage, 
    public void proposerOffreCovoiturage(int nbPlaces) { 
        // Constructeur : OffreCovoiturage(PersonneConcret auteur, LocalDate datePublication, String description, Conducteur conducteur, int nbPlaces)
        OffreCovoiturage offre = new OffreCovoiturage(this, LocalDate.now(), "Covoiturage", this, nbPlaces);
        OffreManager.getInstance().publierOffre(offre);
        System.out.println("Offre de covoiturage proposée !");
    }
}
