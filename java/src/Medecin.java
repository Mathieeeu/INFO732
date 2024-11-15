import java.util.ArrayList;

public class Medecin {

    //Attribut
    private static Medecin instance = null;
    private Personne personne;
    private ArrayList<Creneau> planning = new ArrayList<Creneau>();

    //Constructeur
    private Medecin(Personne personne){}

    //Getters et setters
    public static Medecin getInstance(Personne personne){
        if (instance == null){
            instance = new Medecin(personne);
        }
        return instance;
    }

    public ArrayList<Creneau> getPlanning(){
        return planning;
    }

    public void setMedecin(Personne personne){
        this.personne = personne;
    }

    //To string
    public String ToString(){
        String res = "";
        for(Creneau creneau : planning){
            res = res + creneau;
        }
        return res;
    }

    //Ajouter un RDV médical (méthode appelée par une personne)
    public Creneau ajouterRDV(){
        Creneau dernierCreneau = this.dernierCreneauOccupé();
        Creneau newCreneau = new Creneau(dernierCreneau);
        planning.add(newCreneau);
        return newCreneau;
    }

    //Renvoie le dernier creneau occupé
    public Creneau dernierCreneauOccupé(){
        Creneau lastElement = planning.get(planning.size() - 1);
        return lastElement;
    }

}
