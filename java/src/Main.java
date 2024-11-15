public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n\t\033[43m\033[1;35m-- CAMPUS SIMULATOR 2024 --\033[0m\n\n");

        // Créer les variables globales (medecin, offreManager)
        OffreManager offreManager = OffreManager.getInstance();
        Medecin medecin = Medecin.getInstance(new Personne("Champion", "Maurice"));
        System.out.println(medecin);

        Personne persone = new Personne("A","B");

        System.out.println(medecin.ajouterRDV());
    }
}