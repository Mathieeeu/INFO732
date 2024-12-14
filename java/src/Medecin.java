import java.util.ArrayList;
import java.time.LocalDate;
// ahahah
import java.time.chrono.ThaiBuddhistChronology;

public class Medecin {

    //Attribut
    private static Medecin instance = null;
    private PersonneConcret personne;
    private ArrayList<Creneau> planning = new ArrayList<Creneau>();

    //Constructeur
    private Medecin(PersonneConcret personne){
        this.personne = personne;
    }

    //Getters et setters
    public static Medecin getInstance(){
        return instance;
    }

    // Intéressant d'initialiser la personne ici
    //
    // Je comprends l'intêret d'utiliser la méthode getInstance() une fois qu'on à déjà instancié le
    // singleton puisque ça évite de passer une PersonneConcret factice ou null à la fonction ci-dessous,
    // cependant ça pourrait causer des soucis si on appele getInstance() avant getInstance(PersonneConcret)
    // (voir main ligne 7).
    // On pourrait à la place initialiser PersonneConcret directement dans l'attribut de classe (l18) et avoir
    // qu'une seule fonction getInstance pour éviter toute confusion.
    public static Medecin getInstance(PersonneConcret personne){
        if (instance == null){
            instance = new Medecin(personne);
        }
        return instance;
    }

    public ArrayList<Creneau> getPlanning(){
        return planning;
    }

    public void setMedecin(PersonneConcret personne){
        this.personne = personne;
    }

    //To string
    public String toString(){
        return(personne.toString()+" (Médecin)");
    }

    //Ajouter un RDV médical (méthode appelée par une personne)
    public Creneau ajouterRDV(){
        Creneau dernierCreneau = this.dernierCreneauOccupe();
        LocalDate date;
        int heureDebut;
        int heureFin;
        if (dernierCreneau == null){
            date = LocalDate.now().plusDays(1);
            heureDebut = 8;
            heureFin = 9; 
        }
        else if (dernierCreneau.getHeureFin()>=18){
            date = dernierCreneau.getDate().plusDays(1);
            heureDebut = 8;
            heureFin = 9;
        }
        else{
            heureDebut = dernierCreneau.getHeureFin() + 1;
            heureFin = heureDebut + 1;
            date = dernierCreneau.getDate();
        }
        Creneau newCreneau = new Creneau("Creneau n°"+Integer.toString(planning.size()+1), date, heureDebut, heureFin);
        planning.add(newCreneau);
        return newCreneau;
    }

    //Renvoie le dernier creneau occupé
    public Creneau dernierCreneauOccupe(){
        if (!planning.isEmpty()){
            Creneau lastElement = planning.get(planning.size() - 1);
            return (lastElement);
        }
        return null;  
    }

}
