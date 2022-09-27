package test.gestionDesFormules;

import main.gestionDesFormules.Formule;

public class SpyFormuleRepository {
    private Formule formule;

    public Formule recupererFormule() {
        return this.formule;
    }

    public void ajouter(Formule formule) {
        this.formule = formule;
    }
}
