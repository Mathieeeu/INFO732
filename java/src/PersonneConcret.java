import java.time.LocalDate;
import java.util.ArrayList;

public class PersonneConcret implements Observer, Personne {
    
    //Attributs
    private String nom;
    private String prenom;
    private ArrayList<Materiel> inventaire;
    private Logement logement;
    private ArrayList<String> filtresOffres;
    private ArrayList<Offre> offresAcceptees;
    
    //Constructeur
    public PersonneConcret(String nom, String prenom){
        this.nom=nom;
        this.prenom=prenom;
        this.inventaire=new ArrayList<>();
        this.logement=null;
        this.filtresOffres=new ArrayList<>();
        this.offresAcceptees=new ArrayList<>();
    }

    //Getters et Setters
    @Override
    public String getNom(){
        return this.nom;
    }

    @Override
    public void setNom(String nom){
        this.nom=nom;
    }

    @Override
    public String getPrenom(){
        return this.prenom;
    }

    @Override
    public void setPrenom(String prenom){
        this.prenom=prenom;
    }
    
    @Override
    public ArrayList<Materiel> getInventaire(){
        return this.inventaire;
    }

    @Override
    public void setInventaire(ArrayList<Materiel> inventaire){
        this.inventaire=inventaire;
    }

    @Override
    public Logement getLogement(){
        return this.logement;
    }

    @Override
    public void setLogement(Logement logement){
        this.logement=logement;
    }

    @Override
    public ArrayList<String> getFiltresOffres(){
        return this.filtresOffres;
    }

    @Override
    public void setFiltresOffres(ArrayList<String> filtresOffres){
        this.filtresOffres=filtresOffres;
    }

    @Override
    public void addFiltreOffre(String filtre){
        this.filtresOffres.add(filtre);
    }
    
    @Override
    public void removeFiltreOffre(String filtre){
        this.filtresOffres.remove(filtre);
    }

    @Override
    public ArrayList<Offre> getOffresAcceptees(){
        return this.offresAcceptees;
    }

    @Override
    public void setOffresAcceptees(ArrayList<Offre> offresAcceptees){
        this.offresAcceptees=offresAcceptees;
    }

    @Override
    public void addOffreAcceptee(Offre offre){
        this.offresAcceptees.add(offre);
    }
    
    @Override
    public void removeOffreAcceptee(Offre offre){
        this.offresAcceptees.remove(offre);
    }

    //Methode 

    //To string
    public String toString(){
        return (this.prenom + " " + this.nom);
    }

    @Override
    public void accepterOffre(Offre offre){
        switch(offre.getClass().getSimpleName()) {
            case "OffreCovoiturage":
                if (offre.getParticipants().size() >= ((OffreCovoiturage) offre).getNbPlaces()) {
                    System.out.println("Voiture déjà complète");
                }
                else if (offre.getParticipants().contains(this)) {
                    System.out.println("Vous êtes déjà inscrit à cette offre");
                } 
                else {
                    offre.addParticipant(this);
                    this.offresAcceptees.add(offre);
                    System.out.println("Offre acceptée");
                }
                break;

            case "OffreBonPlan":
                if (LocalDate.now().isAfter(((OffreBonPlan) offre).getDateExpiration())) {
                    System.out.println("Bon plan expiré");
                } 
                else if (!offre.getParticipants().isEmpty()) {
                    System.out.println("Offre déjà complète");
                }
                else{
                    offre.addParticipant(this);
                    this.offresAcceptees.add(offre);
                    System.out.println("Offre acceptée");
                }
                break;
            case "OffreActivite":
                if (offre.getParticipants().contains(this)){
                    System.out.println("Vous êtes déjà inscrit à cette offre");
                }
                else{
                    offre.addParticipant(this);
                    this.offresAcceptees.add(offre);
                    System.out.println("Offre acceptée");
                }
                break;
            default:
                if (offre.getParticipants().contains(this)){
                    System.out.println("Vous êtes déjà inscrit à cette offre");
                }
                else if (!offre.getParticipants().isEmpty()){
                    System.out.println("Offre déjà complète");
                }
                else{
                    offre.addParticipant(this);
                    this.offresAcceptees.add(offre);
                    System.out.println("Offre acceptée");
                }
                break;
        }
    }

    @Override
    public void proposerOffreMateriel(Materiel materiel){
        // Vérifier si le matériel est bien dans l'inventaire de la personne
        if (!this.inventaire.contains(materiel)){
            System.out.println("Erreur - Vous ne possédez pas ce matériel");
        }
        else {
            OffreMateriel offre = new OffreMateriel(this, LocalDate.now(), "Offre de prêt de " + materiel.getNom(), materiel);
            OffreManager.getInstance().publierOffre(offre);
            System.out.println("Offre de prêt de " + materiel.getNom() + " publiée par " + this.prenom + " " + this.nom);
        }
    }

    @Override
    public void proposerOffreActivite(Activite activite){
        OffreActivite offre = new OffreActivite(this, LocalDate.now(), "Offre d'activité", activite);
        OffreManager.getInstance().publierOffre(offre);
        System.out.println("Offre d'activité publiée par " + this.prenom + " " + this.nom);
    }

    @Override
    public void proposerOffreBonPlan(String lienSite, LocalDate dateExpiration){
        OffreBonPlan offre = new OffreBonPlan(this, LocalDate.now(), "Offre de bon plan", lienSite, dateExpiration);
        OffreManager.getInstance().publierOffre(offre);
        System.out.println("Offre de bon plan publiée par " + this.prenom + " " + this.nom);
    }


    @Override
    public void demandeMateriel(Materiel materiel,boolean urgent){
        //TODO
        
    }

    @Override
    public void update(Offre offre){
        for (String filtre : this.filtresOffres){
            if (filtre == offre.getClass().getName()){
                System.out.println("Offre reçu par "+this.prenom+" "+this.prenom);
            }
        }
        
    }

    @Override
    public void desincrireOffre(Offre offre){
        offre.removeParticipant(this);
        this.offresAcceptees.remove(offre);
    }

    @Override
    public void demandeCreneauMedical(){
        Creneau creneau = Medecin.getInstance().ajouterRDV();
        System.out.println("RDV médical réservé pour "+this.prenom+" "+this.nom+"\n"+creneau);
    }
}