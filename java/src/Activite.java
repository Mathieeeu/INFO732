import java.util.ArrayList;

public class Activite {
    
    // Attributs
    private Creneau creneau;
    private String description;
    private ArrayList<Personne> participants;
    private String lieu;
    private Personne organisateur;

    // Constructeur
    public Activite(Creneau creneau, String description, String lieu, Personne organisateur) {
        this.creneau = creneau;
        this.description = description;
        this.lieu = lieu;
        this.organisateur = organisateur;
        this.participants = new ArrayList<Personne>();
    }

    // Getters et Setters
    public Creneau getCreneau() {
        return creneau;
    }

    public void setCreneau(Creneau creneau) {
        this.creneau = creneau;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Personne> getParticipants() {
        return participants;
    }

    public void setParticipants(ArrayList<Personne> participants) {
        this.participants = participants;
    }

    public void addParticipant(PersonneConcret participant) {
        this.participants.add(participant);
    }

    public void removeParticipant(PersonneConcret participant) {
        this.participants.remove(participant);
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Personne getOrganisateur() {
        return organisateur;
    }

    public void setOrganisateur(PersonneConcret organisateur) {
        this.organisateur = organisateur;
    }
}
