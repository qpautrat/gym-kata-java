package main.ExperienceClient;

public class AbonnementViewModel {
    private final Integer prix;

    public AbonnementViewModel(Integer prix) {

        this.prix = prix;
    }

    public Integer prix() {
        return this.prix;
    }
}
