package main.ExperienceClient;

public class SouscrisAUnAbonnementCommand {
    private final Integer abonnementId;
    private final String nomDeLaFormule;

    public SouscrisAUnAbonnementCommand(Integer abonnementId, String nomDeLaFormule) {
        this.abonnementId = abonnementId;
        this.nomDeLaFormule = nomDeLaFormule;
    }

    public String nomDeLaFormule() {
        return this.nomDeLaFormule;
    }

    public Integer abonnementId() {
        return this.abonnementId;
    }
}
