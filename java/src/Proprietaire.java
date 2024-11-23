import java.util.ArrayList;
import java.time.LocalDate;

public class Proprietaire extends PersonneDecorator {
    
    // Attributs
    private ArrayList<Logement> biens;

    // Constructeur
    public Proprietaire(Personne personne) {
        super(personne);
        this.biens = new ArrayList<Logement>();
    }

    // Getters et Setters
    public ArrayList<Logement> getBiens() {
        return biens;
    }

    public void setBiens(ArrayList<Logement> biens) {
        this.biens = biens;
    }

    public void addBien(Logement bien) {
        this.biens.add(bien);
    }

    public void removeBien(Logement bien) {
        this.biens.remove(bien);
    }

    // Méthodes
    // ToString
    public String toString() {
        return super.toString() + " (propriétaire de " + biens.size() + " logements)";
    }

    // Proposer une offre de logement
    public void proposerOffreLogement(LocalDate datePublication, String description, Logement logement) {
        OffreLogement offre = new OffreLogement(this, datePublication, description, logement);
        OffreManager.getInstance().publierOffre(offre);
        System.out.println("Offre de logement publiée");
    }
}