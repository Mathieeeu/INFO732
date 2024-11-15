public abstract class Offre {
    // Attributs 
    private ArrayList<Personne> participants;
    private Personne auteur;
    private String datePublication;
    private String description;

    // Constructeur
    public Offre(Personne auteur, String datePublication, String description) {
        this.auteur = auteur;
        this.datePublication = datePublication;
        this.description = description;
        this.participants = new ArrayList<Personne>();
    }

    // Getters et Setters
    public ArrayList<Personne> getParticipants() {
        return participants;
    }

    public void setParticipants(ArrayList<Personne> participants) {
        this.participants = participants;
    }

    public void addParticipant(Personne participant) {
        this.participants.add(participant);
    }

    public void removeParticipant(Personne participant) {
        this.participants.remove(participant);
    }

    public Personne getAuteur() {
        return auteur;
    }

    public void setAuteur(Personne auteur) {
        this.auteur = auteur;
    }

    public String getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(String datePublication) {
        this.datePublication = datePublication;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
