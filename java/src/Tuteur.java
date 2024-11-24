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

    // publier une offre de tutorat
    public void publierOffreTutorat(LocalDate datePublication, String description, String matiere) {
        OffreTutorat offre = new OffreTutorat(this, datePublication, description, matiere);
        System.out.println("Offre de tutorat publiée !");
        OffreManager.getInstance().publierOffre(offre);
    }
}
