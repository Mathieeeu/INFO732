public class OffreTutorat extends Offre {

    // Attributs
    private Tuteur tuteur;
    private String matiere;

    // Constructeur
    public OffreTutorat(PersonneConcret auteur, String datePublication, String description, Tuteur tuteur, String matiere) {
        super(auteur, datePublication, description);
        this.tuteur = tuteur;
        this.matiere = matiere;
    }

    // Getters et Setters
    public Tuteur getTuteur() {
        return tuteur;
    }

    public void setTuteur(Tuteur tuteur) {
        this.tuteur = tuteur;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }
}
