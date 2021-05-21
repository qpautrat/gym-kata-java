package main.ExperienceClient;

public class AbonnementAggregate {
    private final Integer abonnementId;
    private final Integer prix;

    public AbonnementAggregate(Integer abonnementId, Integer prix) {
        this.abonnementId = abonnementId;
        this.prix = prix;
    }

    public Integer prix() {
        return this.prix;
    }

    public Integer id() {
        return this.abonnementId;
    }
}
