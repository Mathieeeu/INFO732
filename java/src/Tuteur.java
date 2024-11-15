public class Tuteur {

    // Attributs
    private Personne personne;
    
    // Constructeur
    public Tuteur(Personne personne) {
        this.personne = personne;
    }

    // Getters et Setters
    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    // Méthodes
    // ToString 
    public String toString() {
        return personne.toString() + " (Tuteur)";
    }

    // Proposer une offre de tutorat, renvoie true si l'offre a été ajoutée, false sinon
    public boolean proposerOffreTutorat(String datePublication, String description, String matiere) {
        // TODO
        return false;
    }

}
