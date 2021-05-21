package main.GestionDesFormules;

public class ChangeLePrixDuneFormuleCommand {
    private final String nomDeLaFormule;
    private final Integer nouveauPrix;

    public ChangeLePrixDuneFormuleCommand(String nomDeLaFormule, Integer nouveauPrix) {

        this.nomDeLaFormule = nomDeLaFormule;
        this.nouveauPrix = nouveauPrix;
    }

    public String nomDeLaFormule() {
        return this.nomDeLaFormule;
    }

    public Integer nouveauPrix() {
        return this.nouveauPrix;
    }
}
