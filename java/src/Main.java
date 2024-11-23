public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n\t\033[43m\033[1;35m-- CAMPUS SIMULATOR 2024 --\033[0m\n\n");

        // Créer les variables globales (medecin, offreManager)
        OffreManager offreManager = OffreManager.getInstance();
        Medecin medecin = Medecin.getInstance(new PersonneConcret("Champion", "Maurice"));
        System.out.println(medecin);

        // Créer des étudiants non-conducteurs
        Personne personne1 = new PersonneConcret("Doe", "John");
        personne1 = new Etudiant(personne1, 123456, "Polytech Orléans");
        personne1 = new Conducteur(personne1, new Voiture("Renault Clio", "123 ABC 45"));
        personne1 = new Tuteur(personne1);
        personne1 = new Proprietaire(personne1);
        System.out.println(personne1);

        // Créer des étudiants et conducteurs
    }
}