import java.time.LocalDate;
import java.util.ArrayList;

public abstract class PersonneDecorator implements Personne {
    protected Personne decoratedPersonne;

    // Constructeur
    public PersonneDecorator(Personne personne) {
        this.decoratedPersonne = personne;
    }
    
    // Très bien
    // Permet de récupérer la personne décorée sous un certain type (si possible)
    public <T> T getDecoratedAs(Class<T> classe) {
        if (classe.isInstance(this)) {
            return classe.cast(this);
        } else if (decoratedPersonne instanceof PersonneDecorator) {
            return ((PersonneDecorator) decoratedPersonne).getDecoratedAs(classe);
        } else if (classe.isInstance(decoratedPersonne)) {
            return classe.cast(decoratedPersonne);
        }
        return null;
    }

    // Je respecte le dévouement pour tous ces Override (:
    // Blague à part aucune de ces méthodes n'ont besoin d'être override par Etudiant, Conducteur, Tuteur ou 
    // Proprietaire, il pourrait donc être plus judicieux de les enlever de la classe Personne et de soit:
    // 1) Simplement enlever les @Override dans PersonneConcret, ainsi les fonctions sont directement définies
    //    avec leur implémentation dans la classe en question
    // 2) Garder les méthodes sans définition et les mettre dans une nouvelle interface situé entre PersonneConcret
    //    et Personne (Mais PersonneDecorator implémente toujours la classe Personne)
    // Cela signifie que l'on ne pourra plus appeler les fonctions depuis Etudiant, Conducteur etc. mais on peut
    // toujours y accèder depuis PersonneConcret donc il suffit de récupérer l'istance en bas des poupées russes,
    // pourquoi pas même garder une référence vers l'instance "originelle" dans chaque décorateur.
    // Et aussi ça permet d'éviter tous ces Override!
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
    public void publierOffreActivite(Activite activite){
        decoratedPersonne.publierOffreActivite(activite);
    }

    @Override
    public void publierOffreMateriel(Materiel materiel){
        decoratedPersonne.publierOffreMateriel(materiel);
    }

    @Override
    public void publierOffreBonPlan(String lienSite, LocalDate dateExpiration){
        decoratedPersonne.publierOffreBonPlan(lienSite, dateExpiration);
    }

    @Override
    public void desinscrireOffre(Offre offre){
        decoratedPersonne.desinscrireOffre(offre);
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
    public void inscrireOffreManager(){
        decoratedPersonne.inscrireOffreManager();
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
