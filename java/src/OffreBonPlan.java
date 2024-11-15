public class OffreBonPlan extends Offre {

    // Attributs
    private String lienSite;
    private String dateExpiration;

    // Constructeur
    public OffreBonPlan(Personne auteur, String datePublication, String description, String lienSite, String dateExpiration) {
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

    public String getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(String dateExpiration) {
        this.dateExpiration = dateExpiration;
    }
}
