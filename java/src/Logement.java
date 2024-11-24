import java.util.ArrayList;

public class Logement {

    // Attributs
    private String type;
    private String adresse;
    private int loyer;
    private String description;
    private boolean meuble;
    private int surface;
    private Proprietaire proprietaire;
    private ArrayList<PersonneConcret> habitants;

    // Constructeur
    public Logement(String type, String adresse, int loyer, String description, boolean meuble, int surface, Proprietaire proprietaire) {
        this.type = type;
        this.adresse = adresse;
        this.loyer = loyer;
        this.description = description;
        this.meuble = meuble;
        this.surface = surface;
        this.proprietaire = proprietaire;
        this.habitants = new ArrayList<PersonneConcret>();
    }

    // Getters et Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getLoyer() {
        return loyer;
    }

    public void setLoyer(int loyer) {
        this.loyer = loyer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isMeuble() {
        return meuble;
    }

    public void setMeuble(boolean meuble) {
        this.meuble = meuble;
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public Proprietaire getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Proprietaire proprietaire) {
        this.proprietaire = proprietaire;
    }

    public ArrayList<PersonneConcret> getHabitants() {
        return habitants;
    }

    public void setHabitants(ArrayList<PersonneConcret> habitants) {
        this.habitants = habitants;
    }

    public void addHabitant(PersonneConcret habitant) {
        this.habitants.add(habitant);
    }

    public void removeHabitant(PersonneConcret habitant) {
        this.habitants.remove(habitant);
    }

    //To String
    public String toString(){
        return "Logement :\n\t- " + this.type + " :\n\t- " + this.adresse + "\n\t- " + this.proprietaire.getPrenom() + " " + this.proprietaire.getNom() + "\n\t- Loyer : " + loyer + "\n\t- Description :" + description + "\n";
    }
}
