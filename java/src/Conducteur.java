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

    // publier une offre de covoiturage, 
    public void publierOffreCovoiturage(String description, int nbPlaces) { 
        // Constructeur : OffreCovoiturage(PersonneConcret auteur, LocalDate datePublication, String description, Conducteur conducteur, int nbPlaces)
        OffreCovoiturage offre = new OffreCovoiturage(this, LocalDate.now(), description, this, nbPlaces);
        System.out.println("Offre de covoiturage publiée par "+this.getPrenom()+" "+this.getNom()+"!");
        OffreManager.getInstance().publierOffre(offre);
    }
}
