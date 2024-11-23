import java.util.ArrayList;

public abstract class Offre {
    // Attributs 
    private ArrayList<PersonneConcret> participants;
    private PersonneConcret auteur;
    private String datePublication;
    private String description;

    // Constructeur
    public Offre(PersonneConcret auteur, String datePublication, String description) {
        this.auteur = auteur;
        this.datePublication = datePublication;
        this.description = description;
        this.participants = new ArrayList<PersonneConcret>();
    }

    // Getters et Setters
    public ArrayList<PersonneConcret> getParticipants() {
        return participants;
    }

    public void setParticipants(ArrayList<PersonneConcret> participants) {
        this.participants = participants;
    }

    public void addParticipant(PersonneConcret participant) {
        this.participants.add(participant);
    }

    public void removeParticipant(PersonneConcret participant) {
        this.participants.remove(participant);
    }

    public PersonneConcret getAuteur() {
        return auteur;
    }

    public void setAuteur(PersonneConcret auteur) {
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
