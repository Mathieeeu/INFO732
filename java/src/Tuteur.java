public class Tuteur extends PersonneDecorator {

    // Constructeur
    public Tuteur(Personne personne) {
        super(personne);
    }

    // Méthodes
    // ToString 
    public String toString() {
        return super.toString() + " (Tuteur)";
    }

    // Proposer une offre de tutorat, renvoie true si l'offre a été ajoutée, false sinon
    public boolean proposerOffreTutorat(String datePublication, String description, String matiere) {
        // TODO
        return false;
    }
}
