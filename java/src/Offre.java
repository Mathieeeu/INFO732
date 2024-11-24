import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Offre {
    // Attributs 
    private ArrayList<Personne> participants;
    private Personne auteur;
    private LocalDate datePublication;
    private String description;

    // Constructeur
    public Offre(Personne auteur, LocalDate datePublication, String description) {
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

    public void addParticipant(PersonneConcret participant) {
        this.participants.add(participant);
    }

    public void removeParticipant(PersonneConcret participant) {
        this.participants.remove(participant);
    }

    public Personne getAuteur() {
        return auteur;
    }

    public void setAuteur(PersonneConcret auteur) {
        this.auteur = auteur;
    }

    public LocalDate getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(LocalDate datePublication) {
        this.datePublication = datePublication;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //To String
    public String toString(){
        return "\t- Publiée le " + this.datePublication + "\n\t- Par " + this.auteur.getPrenom() + " " + this.auteur.getNom() + "\n\t- Description : " + this.description;
    }
}
