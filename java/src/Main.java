import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n\t\033[43m\033[1;35m-- CAMPUS SIMULATOR 2024 --\033[0m\n\n");

        // Créer le medecin (singleton et "variable globale")
        Medecin medecin = Medecin.getInstance(new PersonneConcret("Champion", "Maurice"));
        System.out.println(medecin);
        System.out.println("---\n");

        // Créer un étudiant non-conducteur
        Personne personne1 = new PersonneConcret("Doe", "John");
        personne1 = new Etudiant(personne1, 123456, "Polytech Orléans");
        System.out.println(personne1);
        System.out.println("---\n");
        
        // Créer un étudiant et conducteur
        Personne personne2 = new Conducteur(new Etudiant(new PersonneConcret("Doe", "Jane"), 123457, "Polytech Orléans"), new Voiture("Peugeot 208", "456 DEF 78"));
        System.out.println(personne2);
        System.out.println("---\n");

        // Inscrire un étudiant à la liste de diffusion des offres de covoiturage et activité
        personne2.inscrireOffreManager();
        personne2.addFiltreOffre("OffreActivite");
        personne2.addFiltreOffre("OffreLogement");
        System.out.println("---\n");

        // Créer un conducteur et propriétaire, qui reçoit toutes les offres
        Personne personne3 = new Proprietaire(new Conducteur(new PersonneConcret ("Doe", "Jack"), new Voiture("Peugeot 208", "456 DEF 78")));
        System.out.println(personne3);
        personne3.inscrireOffreManager();
        System.out.println("---\n");

        // Créer un conducteur et propriétaire et tuteur, qui reçoit les offres de tutorat, covoiturage et activité
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
        System.out.println("---\n");

        //Prise de RDV
        personne1.demandeCreneauMedical();
        System.out.println("---\n");

        // Création d'une offre
        Creneau creneau = new Creneau("Maintenant", LocalDate.of(2024,11,27), 13, 17);
        Activite activite = new Activite(creneau, "Oral", "Polyteh", personne1);
        personne1.publierOffreActivite(activite);
        System.out.println("---\n");
        //OffreBonPlan offre2 = new OffreBonPlan(personne1, LocalDate.of(2023,11,20), "Offre trop bien", "www.clique.com", LocalDate.of(2024,01,12));
        personne2.publierOffreBonPlan("www.pasunearnaque.com", LocalDate.of(2024,01,12));
        System.out.println("---\n");
        //Offre de covoiturage
        Conducteur conducteur = ((PersonneDecorator) personne3).getDecoratedAs(Conducteur.class);
        conducteur.publierOffreCovoiturage("Trajet Lyon-Marseille", 1);
        System.out.println("---\n");

        // Récupération de la liste des offres
        OffreManager.getInstance().afficherOffres();
        System.out.println("---\n");

        // Inscription à une offre
        personne2.accepterOffre(OffreManager.getInstance().getListeOffres().get(0));
        personne2.accepterOffre(OffreManager.getInstance().getListeOffres().get(2));
        System.out.println("---\n");

        // Récupération de la liste des offres
        OffreManager.getInstance().afficherOffres();
        System.out.println("---\n");
    }
}