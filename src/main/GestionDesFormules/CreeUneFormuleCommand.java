package main.GestionDesFormules;

public class CreeUneFormuleCommand {
    private final String nom;
    private final Integer prix;

    public CreeUneFormuleCommand(String nom, Integer prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public Integer prix() {
        return this.prix;
    }

    public String nom() {
        return this.nom;
    }
}
