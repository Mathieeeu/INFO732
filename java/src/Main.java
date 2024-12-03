import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n\t\033[43m\033[1;35m-- CAMPUS SIMULATOR 2024 --\033[0m\n\n");

        Medecin medecin = Medecin.getInstance();
        System.out.println(medecin); // renvoie null

        // Créer le medecin (singleton et "variable globale")
        System.out.print("\033[38;5;210m");
        medecin = Medecin.getInstance(new PersonneConcret("Champion", "Maurice"));
        System.out.println(medecin);
        System.out.println("---\033[0m\n");

        // Créer un étudiant non-conducteur
        System.out.print("\033[38;5;153m");
        Personne personne1 = new PersonneConcret("Doe", "John");
        personne1 = new Etudiant(personne1, 123456, "Polytech Orléans");
        System.out.println(personne1);
        System.out.println("---\033[0m\n");
        
        // Créer un étudiant et conducteur
        System.out.print("\033[38;5;84m");
        Personne personne2 = new Conducteur(new Etudiant(new PersonneConcret("Doe", "Jane"), 123457, "Polytech Orléans"), new Voiture("Peugeot 208", "456 DEF 78"));
        System.out.println(personne2);
        System.out.println("---\033[0m\n");

        // Inscrire un étudiant à la liste de diffusion des offres de covoiturage et activité
        System.out.print("\033[38;5;137m");
        personne2.inscrireOffreManager();
        personne2.addFiltreOffre("OffreActivite");
        personne2.addFiltreOffre("OffreLogement");
        System.out.println("---\033[0m\n");

        // Créer un conducteur et propriétaire, qui reçoit toutes les offres
        System.out.print("\033[38;5;84m");
        Personne personne3 = new Proprietaire(new Conducteur(new PersonneConcret ("Doe", "Jack"), new Voiture("Peugeot 208", "456 DEF 78")));
        System.out.println(personne3);
        personne3.inscrireOffreManager();
        System.out.println("---\033[0m\n");

        // Créer un conducteur et propriétaire et tuteur, qui reçoit les offres de tutorat, covoiturage et activité
        System.out.print("\033[38;5;172m");
        Personne personne4 = new Tuteur(new Proprietaire(new Conducteur(new PersonneConcret ("Trois", "John"), new Voiture("Peugeot 208", "456 DEF 78"))));   
        // Ajouter un bien à un propriétaire (un peu galère comme il y a plusieurs décorateurs)
        Proprietaire proprietaire = ((PersonneDecorator) personne4).getDecoratedAs(Proprietaire.class);
        if (proprietaire != null) {
            Logement logement = new Logement("Appartement", "1 rue de la paix", 500, "Trop bien", true, 50, proprietaire);
            proprietaire.addBien(logement);
            Logement logement2 = new Logement("Maison", "2 rue de la guerre", 1000, "Pittoyable", true, 100, proprietaire);
            proprietaire.addBien(logement2);
        } else {
            System.out.println("personne4 n'est pas un Proprietaire");
        }
        System.out.println(personne4);
        personne4.inscrireOffreManager();
        personne4.addFiltreOffre("OffreTutorat");
        personne4.addFiltreOffre("OffreCovoiturage");
        personne4.addFiltreOffre("OffreActivite");
        proprietaire.afficherBiens();
        System.out.println("---\033[0m\n");

        //Prise de RDV
        System.out.print("\033[38;5;210m");
        personne1.demandeCreneauMedical();
        System.out.println("---\033[0m\n");

        // Création d'une offre
        System.out.print("\033[38;5;93m");
        Creneau creneau = new Creneau("Maintenant", LocalDate.of(2024,11,27), 13, 17);
        Activite activite = new Activite(creneau, "Oral", "Polyteh", personne1);
        personne1.publierOffreActivite(activite);
        System.out.println("---\033[0m\n");

        // Création d'une offre
        System.out.print("\033[38;5;250m");
        personne2.publierOffreBonPlan("www.pasunearnaque.com", LocalDate.of(2024,01,12));
        System.out.println("---\033[0m\n");

        //Offre de covoiturage
        System.out.print("\033[38;5;84m");
        Conducteur conducteur = ((PersonneDecorator) personne3).getDecoratedAs(Conducteur.class);
        conducteur.publierOffreCovoiturage("Trajet Lyon-Marseille", 1);
        System.out.println("---\033[0m\n");

        // Récupération de la liste des offres
        System.out.print("\033[38;5;137m");
        OffreManager.getInstance().afficherOffres();
        System.out.println("---\033[0m\n");

        // Inscription à une offre
        System.out.print("\033[38;5;137m");
        personne2.accepterOffre(OffreManager.getInstance().getListeOffres().get(0));
        personne2.accepterOffre(OffreManager.getInstance().getListeOffres().get(2));
        System.out.println("---\033[0m\n");

        // Récupération de la liste des offres
        System.out.print("\033[38;5;137m");
        OffreManager.getInstance().afficherOffres();
        System.out.println("---\033[0m\n");

        // Désinscription d'une offre
        System.out.print("\033[38;5;137m");
        personne2.desinscrireOffre(personne2.getOffresAcceptees().get(0));
        System.out.println("---\033[0m\n");

        // Récupération de la liste des offres
        System.out.print("\033[38;5;137m");
        OffreManager.getInstance().afficherOffres();
        System.out.println("---\033[0m\n");
    }
}
