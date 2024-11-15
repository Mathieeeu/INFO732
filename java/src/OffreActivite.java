public class OffreActivite extends Offre {
    
    // Attributs
    private Activite activite;

    // Constructeur
    public OffreActivite(Personne auteur, String datePublication, String description, Activite activite) {
        super(auteur, datePublication, description);
        this.activite = activite;
    }

    // Getters et Setters
    public Activite getActivite() {
        return activite;
    }

    public void setActivite(Activite activite) {
        this.activite = activite;
    }
}
