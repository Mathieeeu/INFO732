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

    // Proposer une offre de covoiturage, renvoie true si l'offre a été ajoutée, false sinon
    public boolean proposerOffreCovoiturage(String datePublication, String description, String villeDepart, String villeArrivee, String dateDepart, int nbPlaces) {
        // TODO
        return false;
    }


}
