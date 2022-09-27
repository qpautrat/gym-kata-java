package main.gestionDesFormules;

public class Formule {
    private final int id;
    private int prix;

    public Formule(int id, int prix) {
        if (prix < 0) {
            throw new IllegalStateException();
        }
        this.id = id;
        this.prix = prix;
    }

    public int id() {
        return this.id;
    }

    public int prix() {
        return this.prix;
    }
}
