package main.GestionDesFormules;

public class FormuleViewModel {
    private final String nom;
    private final Integer prix;

    public FormuleViewModel(String nom, Integer prix) {

        this.nom = nom;
        this.prix = prix;
    }

    public Integer prix() {
        return this.prix;
    }
}
