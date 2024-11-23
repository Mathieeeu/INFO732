import java.time.LocalDate;
import java.util.ArrayList;

public interface Personne {
    public String toString();

    public void demandeCreneauMedical();

    public void accepterOffre(Offre offre);

    public void proposerOffreActivite(Activite activite);

    public void proposerOffreMateriel(Materiel materiel);

    public void proposerOffreBonPlan(String lienSite, LocalDate dateExpiration);

    public void desincrireOffre(Offre offre);

    public void demandeMateriel(Materiel materiel,boolean urgent);

    public void update(Offre offre);

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
