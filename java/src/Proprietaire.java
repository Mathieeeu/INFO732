import java.util.ArrayList;

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

    // Proposer une offre de logement, renvoie true si l'offre a été ajoutée, false sinon
    public boolean proposerOffreLogement(String datePublication, String description, Logement logement) {
        // TODO
        return false;
    }
}