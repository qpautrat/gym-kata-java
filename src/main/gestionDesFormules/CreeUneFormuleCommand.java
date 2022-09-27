package main.gestionDesFormules;

public class CreeUneFormuleCommand {
    private int id;
    private int prix;

    public CreeUneFormuleCommand(int id, int prix) {
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
