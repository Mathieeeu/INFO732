import java.time.LocalDate;

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

    // Proposer une offre de tutorat
    public void proposerOffreTutorat(LocalDate datePublication, String description, String matiere) {
        OffreTutorat offre = new OffreTutorat(this, datePublication, description, matiere);
        OffreManager.getInstance().publierOffre(offre);
        System.out.println("Offre de tutorat publiée !");
    }
}
