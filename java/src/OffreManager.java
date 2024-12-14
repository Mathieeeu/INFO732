import java.util.ArrayList;
import java.util.List;

// Très bien
public class OffreManager {
    // Attributs
    private static OffreManager instance; // Instance unique de OfferManager
    private List<Observer> observers = new ArrayList<>();
    private List<Offre> offres = new ArrayList<>();

    // Constructeur privé pour empêcher l'instanciation directe
    private OffreManager() {}

    // Méthode toString()
    @Override
    public String toString() {
        String res = "Liste des observers : ";
        for (int i = 0; i < observers.size(); i++) {
            res += observers.get(i);
        }

        res += "\n Liste des offres : ";
        for (int i = 0; i < offres.size(); i++) {
            res += offres.get(i);
        }
        res += "\n";
        return res;
    }


    // Getters et Setters
    public List<Observer> getListeObservers() {
        return observers;
    }

    public List<Offre> getListeOffres() {
        return offres;
    }

    public void viderListeObservers() {
        observers = new ArrayList<>();
    }

    public void viderListeOffres() {
        offres = new ArrayList<>();
    }


    // Méthodes

    // Bien
    // Obtenir l'instance unique
    public static OffreManager getInstance() {
        if (instance == null) {
            instance = new OffreManager();
        }
        return instance;
    }

    // Inscrire un observateur
    public void inscrire(Observer observer) {
        observers.add(observer);
    }

    // Désinscrire un observateur
    public void desinscrire(Observer observer) {
        observers.remove(observer);
    }

    // Publier une nouvelle offre
    public void publierOffre(Offre offre) {
        offres.add(offre);
        notifierObservers(offre);
    }

    // Notifier les observateurs concernés
    private void notifierObservers(Offre offre) {
        for (Observer observer : observers) {
            observer.update(offre);
        }
    }

    // Afficher la liste des offres
    public void afficherOffres() {
        System.out.println("Liste des offres : ");
        int i = 0;
        for (Offre offre : offres) {
            System.out.println("[" + i + "] - " + offre);
            i++;
        }
    }
}
