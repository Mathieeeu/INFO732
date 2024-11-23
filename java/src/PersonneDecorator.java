public abstract class PersonneDecorator implements Personne {
    protected Personne decoratedPersonne;

    public PersonneDecorator(Personne personne) {
        this.decoratedPersonne = personne;
    }

    public String toString() {
        return decoratedPersonne.toString();
    }
}
