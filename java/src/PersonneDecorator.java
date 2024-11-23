import java.time.LocalDate;
import java.util.ArrayList;

public abstract class PersonneDecorator implements Personne {
    protected Personne decoratedPersonne;

    public PersonneDecorator(Personne personne) {
        this.decoratedPersonne = personne;
    }
    
    // Permet de récupérer la personne décorée sous un certain type (si possible)
    public <T> T getDecoratedAs(Class<T> clazz) {
        if (clazz.isInstance(this)) {
            return clazz.cast(this);
        } else if (decoratedPersonne instanceof PersonneDecorator) {
            return ((PersonneDecorator) decoratedPersonne).getDecoratedAs(clazz);
        } else if (clazz.isInstance(decoratedPersonne)) {
            return clazz.cast(decoratedPersonne);
        }
        return null;
    }

    @Override
    public String toString() {
        return decoratedPersonne.toString();
    }

    @Override
    public void demandeCreneauMedical(){
        decoratedPersonne.demandeCreneauMedical();
    }

    @Override
    public void accepterOffre(Offre offre){
        decoratedPersonne.accepterOffre(offre);
    }

    @Override
    public void proposerOffreActivite(Activite activite){
        decoratedPersonne.proposerOffreActivite(activite);
    }

    @Override
    public void proposerOffreMateriel(Materiel materiel){
        decoratedPersonne.proposerOffreMateriel(materiel);
    }

    @Override
    public void proposerOffreBonPlan(String lienSite, LocalDate dateExpiration){
        decoratedPersonne.proposerOffreBonPlan(lienSite, dateExpiration);
    }

    @Override
    public void desincrireOffre(Offre offre){
        decoratedPersonne.desincrireOffre(offre);
    }

    @Override
    public void demandeMateriel(Materiel materiel,boolean urgent){
        decoratedPersonne.demandeMateriel(materiel, urgent);
    }

    @Override
    public void update(Offre offre){
        decoratedPersonne.update(offre);
    }

    @Override
    public String getNom(){
        return decoratedPersonne.getNom();
    }

    @Override
    public void setNom(String nom){
        decoratedPersonne.setNom(nom);
    }

    @Override
    public String getPrenom(){
        return decoratedPersonne.getPrenom();
    }

    @Override
    public void setPrenom(String prenom){
        decoratedPersonne.setPrenom(prenom);
    }
    
    @Override
    public ArrayList<Materiel> getInventaire(){
        return decoratedPersonne.getInventaire();
    }

    @Override
    public void setInventaire(ArrayList<Materiel> inventaire){
        decoratedPersonne.setInventaire(inventaire);
    }

    @Override
    public Logement getLogement(){
        return decoratedPersonne.getLogement();
    }

    @Override
    public void setLogement(Logement logement){
        decoratedPersonne.setLogement(logement);
    }

    @Override
    public ArrayList<String> getFiltresOffres(){
        return decoratedPersonne.getFiltresOffres();
    }

    @Override
    public void setFiltresOffres(ArrayList<String> filtresOffres){
        decoratedPersonne.setFiltresOffres(filtresOffres);
    }

    @Override
    public void addFiltreOffre(String filtre){
        decoratedPersonne.addFiltreOffre(filtre);
    }
    
    @Override
    public void removeFiltreOffre(String filtre){
        decoratedPersonne.removeFiltreOffre(filtre);
    }

    @Override
    public ArrayList<Offre> getOffresAcceptees(){
        return decoratedPersonne.getOffresAcceptees();
    }

    @Override
    public void setOffresAcceptees(ArrayList<Offre> offresAcceptees){
        decoratedPersonne.setOffresAcceptees(offresAcceptees);
    }

    @Override
    public void addOffreAcceptee(Offre offre){
        decoratedPersonne.addOffreAcceptee(offre);
    }

    @Override
    public void removeOffreAcceptee(Offre offre){
        decoratedPersonne.removeOffreAcceptee(offre);
    }
}