import java.util.ArrayList;
public class Personne implements Observer {
    
    //Attributs
    private String nom;
    private String prenom;
    private ArrayList<String> inventaire;
    private Logement logement;
    private ArrayList<String> filtresOffres;
    private ArrayList<Offre> offresAcceptees;
    
    //Constructeur
    public Personne(String nom, String prenom){
        this.nom=nom;
        this.prenom=prenom;
        this.inventaire=new ArrayList<>();
        this.logement=null;
        this.filtresOffres=new ArrayList<>();
        this.offresAcceptees=new ArrayList<>();
    }

    //Getter et Setter 

    //Methode 
    public void accepterOffre(Offre offre){
        //TODO 
        if(offre.getClass().getName()=="OffreCovoiturage"){
            
        }

        else {
            offre.addParticipant(this);
            this.offresAcceptees.add(offre);
        }
        
    }

    public void proposerOffre(){
        //TODO
        
    }

    public void proposerOffreActivite(){
        //TODO
        
    }

    public void proposerOffreBonPlan(){
        //TODO
        
    }

    public void demandeMateriel(Materiel materiel,boolean urgent){
        //TODO
        
    }

    public void update(Offre offre){
        //TODO
        
    }

    public void desincrireOffre(Offre offre){
        //TODO
        
    }

    public void demandeCreneauMedical(Medecin medecin){
        //TODO
        
    }
}
