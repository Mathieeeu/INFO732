import java.util.ArrayList;
import java.util.List;

public class OffreManager {
    // Attributs
    private List<Observer> observers = new ArrayList<>();
    private List<Offre> offres = new ArrayList<>();

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
}