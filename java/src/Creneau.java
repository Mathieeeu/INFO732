import java.time.LocalDate;

public class Creneau {

    //Attributs
    private String nom;
    private LocalDate date; //format aaaa-mm-jj
    private int heureDebut;
    private int heureFin;

    //Constructeur
    public Creneau(String nom, LocalDate date, int heureDebut,int heureFin){
        this.nom = nom;
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
    }

    //Getters et setters
    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public LocalDate getDate(){
        return date;
    }

    public void setDate(LocalDate date){
        this.date = date;
    }

    public int getHeureDebut(){
        return heureDebut;
    }

    public void setHeureDebut(int heure){
        this.heureDebut = heure;
    }

    public int getHeureFin(){
        return heureFin;
    }

    public void setHeureFin(int heure){
        this.heureFin = heure;
    }

    //To string
    public String toString(){
        return (nom+" - "+date+" ( "+heureDebut+"h - "+heureFin+"h )");

    }
    
}
