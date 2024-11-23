import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n\t\033[43m\033[1;35m-- CAMPUS SIMULATOR 2024 --\033[0m\n\n");

        // Créer les variables globales (medecin, offreManager)
        OffreManager offreManager = OffreManager.getInstance();
        Medecin medecin = Medecin.getInstance(new PersonneConcret("Champion", "Maurice"));
        System.out.println(medecin);

        // Créer un étudiant non-conducteur
        Personne personne1 = new PersonneConcret("Doe", "John");
        personne1 = new Etudiant(personne1, 123456, "Polytech Orléans");
        System.out.println(personne1);
        
        // Créer un étudiant et conducteur
        Personne personne2 = new Conducteur(new Etudiant(new PersonneConcret("Doe", "Jane"), 123457, "Polytech Orléans"), new Voiture("Peugeot 208", "456 DEF 78"));
        personne2.addFiltreOffre("OffreActivite");
        OffreManager.getInstance().inscrire(((Observer)personne2));
        System.out.println(personne2);

        // Créer un conducteur et propriétaire
        Personne personne3 = new Proprietaire(new Conducteur(new PersonneConcret ("Doe", "Jack"), new Voiture("Peugeot 208", "456 DEF 78")));
        System.out.println(personne3);

        // Créer un conducteur et propriétaire et tuteur
        Personne personne4 = new Tuteur(new Proprietaire(new Conducteur(new PersonneConcret ("Trois", "John"), new Voiture("Peugeot 208", "456 DEF 78"))));
        
        // Ajouter un bien à un propriétaire (un peu galère comme il y a plusieurs décorateurs)
        Proprietaire proprietaire = ((PersonneDecorator) personne4).getDecoratedAs(Proprietaire.class);
        if (proprietaire != null) {
            Logement logement = new Logement("Appartement", "1 rue de la paix", 500, "Trop bien", true, 50, proprietaire);
            proprietaire.addBien(logement);
            
        } else {
            System.out.println("personne4 n'est pas un Proprietaire");
        }
        System.out.println(personne4);
        System.out.println(proprietaire.getBiens());

        //Prise de RDV
        personne1.demandeCreneauMedical();

        //Offre
        Creneau creneau = new Creneau("Maintenant", LocalDate.of(2024,11,27), 13, 17);
        Activite activite = new Activite(creneau, "Oral", "Polyteh", personne1);
        personne1.proposerOffreActivite(activite);
        OffreBonPlan offre2 = new OffreBonPlan(personne1, LocalDate.of(2023,11,20), "Offre trop bien", "www.clique.com", LocalDate.of(2024,01,12));

        personne2.accepterOffre(offreManager.getListeOffres().get(0));
        personne2.accepterOffre(offre2);
    }
}