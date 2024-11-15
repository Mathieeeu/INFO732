public class Conducteur {
    
    // Attributs
    private Personne personne;
    private Voiture vehicule;

    // Constructeur
    public Conducteur(Personne personne, Voiture vehicule) {
        this.personne = personne;
        this.vehicule = vehicule;
    }

    // Getters et Setters
    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public Voiture getVehicule() {
        return vehicule;
    }

    public void setVehicule(Voiture vehicule) {
        this.vehicule = vehicule;
    }

    // Méthodes
    // ToString
    public String toString() {
        return personne.toString() + " (Conducteur)";
    }

    // Proposer une offre de covoiturage, renvoie true si l'offre a été ajoutée, false sinon
    public boolean proposerOffreCovoiturage(String datePublication, String description, String villeDepart, String villeArrivee, String dateDepart, int nbPlaces) {
        // TODO
        return false;
    }


}
