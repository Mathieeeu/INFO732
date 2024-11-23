import java.time.LocalDate;

public class OffreBonPlan extends Offre {

    // Attributs
    private String lienSite;
    private LocalDate dateExpiration;

    // Constructeur
    public OffreBonPlan(Personne auteur, LocalDate datePublication, String description, String lienSite, LocalDate dateExpiration) {
        super(auteur, datePublication, description);
        this.lienSite = lienSite;
        this.dateExpiration = dateExpiration;
    }

    // Getters et Setters
    public String getLienSite() {
        return lienSite;
    }

    public void setLienSite(String lienSite) {
        this.lienSite = lienSite;
    }

    public LocalDate getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(LocalDate dateExpiration) {
        this.dateExpiration = dateExpiration;
    }
}
