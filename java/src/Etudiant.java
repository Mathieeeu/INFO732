public class Etudiant extends PersonneDecorator{
    
    // Attributs
    private int numeroEtudiant;
    private String composante;

    // Constructeur
    public Etudiant(Personne personne, int numeroEtudiant, String composante) {
        super(personne);
        this.numeroEtudiant = numeroEtudiant;
        this.composante = composante;
    }

    // Getters et Setters
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
        return super.toString() + " (Etudiant)";
    }

    // Demander une offre de tutorat, renvoie true si la demande a été ajoutée, false sinon
    public boolean demanderOffreTutorat(String datePublication, String description, String matiere) {
        // TODO
        return false;
    }
}
