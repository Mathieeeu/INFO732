public interface Observer {
    void inscrireOffreManager(); // S'inscrire à la liste de diffusion de l'OffreManager 
    void update(Offre offre); // Recevoir la notification d'une nouvelle offre
}
