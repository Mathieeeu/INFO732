import java.util.ArrayList;

public class Personne implements Observer {
    
    //Attributs
    private String nom;
    private String prenom;
    private ArrayList<Materiel> inventaire;
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

    //Getters et Setters
    public String getNom(){
        return this.nom;
    }

    public void setNom(String nom){
        this.nom=nom;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public void setPrenom(String prenom){
        this.prenom=prenom;
    }

    public ArrayList<Materiel> getInventaire(){
        return this.inventaire;
    }

    public void setInventaire(ArrayList<Materiel> inventaire){
        this.inventaire=inventaire;
    }

    public Logement getLogement(){
        return this.logement;
    }

    public void setLogement(Logement logement){
        this.logement=logement;
    }

    public ArrayList<String> getFiltresOffres(){
        return this.filtresOffres;
    }

    public void setFiltresOffres(ArrayList<String> filtresOffres){
        this.filtresOffres=filtresOffres;
    }

    public void addFiltreOffre(String filtre){
        this.filtresOffres.add(filtre);
    }

    public void removeFiltreOffre(String filtre){
        this.filtresOffres.remove(filtre);
    }

    public ArrayList<Offre> getOffresAcceptees(){
        return this.offresAcceptees;
    }

    public void setOffresAcceptees(ArrayList<Offre> offresAcceptees){
        this.offresAcceptees=offresAcceptees;
    }

    public void addOffreAcceptee(Offre offre){
        this.offresAcceptees.add(offre);
    }

    public void removeOffreAcceptee(Offre offre){
        this.offresAcceptees.remove(offre);
    }

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
