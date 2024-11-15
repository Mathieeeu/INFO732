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
    //Méthode qui permet d'accepeté toute les type d'offre sauf les offre de covoiturage 
    public void accepterOffre(Offre offre){ 
            offre.addParticipant(this);
            this.addOffreAcceptee(offre);
            System.out.println("vus avez été ajouté a la liste des participants");
    }

    //Offre qui permet d'accepter les offre de covoiturage et verifiant que la voiture n'est pas deja pleines
    public void accepterOffre(OffreCovoiturage offre){ 
      
        if(offre.getNbPlaces()>offre.getParticipants().size()){
            offre.addParticipant(this);
            this.addOffreAcceptee(offre);
            System.out.println("vous avez été ajouté a la voiture");
        }
        else{
            System.out.println("la voiture est deja complete ");
        }
        
    }

    //methode qui permet de cree des nouvelle offre 
    public void proposerOffreMateriel(String date, String desc,Materiel mat){
        OffreMateriel offre=new OffreMateriel(this,date,desc,mat);
        OffreManager offreManager = OffreManager.getInstance(); // Accéder à l'instance unique
        offreManager.publierOffre(offre); // Appeler la méthode de publication
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
        //TODO on se retire de l'offre soit liste des personne et de la liste des offre dans personne 
        
    }

    public void demandeCreneauMedical(Medecin medecin){
        //TODO
        
    }
}
