import java.time.LocalDate;
import java.util.ArrayList;

public interface Personne extends Observer {
    public String toString();

    public void demandeCreneauMedical();

    public void accepterOffre(Offre offre);

    public void publierOffreActivite(Activite activite);

    public void publierOffreMateriel(Materiel materiel);

    public void publierOffreBonPlan(String lienSite, LocalDate dateExpiration);

    public void desinscrireOffre(Offre offre);

    public void demandeMateriel(Materiel materiel,boolean urgent);

    public void update(Offre offre);

    public void inscrireOffreManager();

    public String getNom();

    public void setNom(String nom);

    public String getPrenom();

    public void setPrenom(String prenom);

    public ArrayList<Materiel> getInventaire();

    public void setInventaire(ArrayList<Materiel> inventaire);

    public Logement getLogement();

    public void setLogement(Logement logement);

    public ArrayList<String> getFiltresOffres();

    public void setFiltresOffres(ArrayList<String> filtresOffres);

    public void addFiltreOffre(String filtre);
    
    public void removeFiltreOffre(String filtre);

    public ArrayList<Offre> getOffresAcceptees();

    public void setOffresAcceptees(ArrayList<Offre> offresAcceptees);

    public void addOffreAcceptee(Offre offre);

    public void removeOffreAcceptee(Offre offre);
}
