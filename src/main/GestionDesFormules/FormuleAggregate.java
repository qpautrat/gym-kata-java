package main.GestionDesFormules;

public class FormuleAggregate {
    private final String nom;
    private Integer prix;

    public FormuleAggregate(String nom, Integer prix) {

        this.nom = nom;
        this.prix = prix;
    }

    public Integer prix() {
        return this.prix;
    }

    public String nom() {
        return this.nom;
    }

    public void changeLePrix(Integer nouveauPrix) {

        if (nouveauPrix < 0) {
            throw new IllegalArgumentException();
        }
        this.prix = nouveauPrix;
    }
}
