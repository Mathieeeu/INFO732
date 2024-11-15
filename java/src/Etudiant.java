public class Etudiant {
    
    // Attributs
    private Personne personne;
    private int numeroEtudiant;
    private String composante;

    // Constructeur
    public Etudiant(Personne personne, int numeroEtudiant, String composante) {
        this.personne = personne;
        this.numeroEtudiant = numeroEtudiant;
        this.composante = composante;
    }

    // Getters et Setters
    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public int getNumeroEtudiant() {
        return numeroEtudiant;
    }

    public void setNumeroEtudiant(int numeroEtudiant) {
        this.numeroEtudiant = numeroEtudiant;
    }

    public String getComposante() {
        return composante;
    }

    public void setComposante(String composante) {
        this.composante = composante;
    }

    // Méthodes
    // ToString
    public String toString() {
        return personne.toString() + " (Etudiant à " + composante + ")";
    }

    // Proposer une offre de covoiturage, renvoie true si l'offre a été ajoutée, false sinon
    public boolean proposerOffreCovoiturage(String datePublication, String description, String villeDepart, String villeArrivee, String dateDepart, int nbPlaces) {
        // TODO
        return false;
    }


}
