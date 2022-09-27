package test.gestionDesFormules;

import main.gestionDesFormules.Formule;
import main.gestionDesFormules.FormuleRepository;

public class SpyFormuleRepository implements FormuleRepository {
    private Formule formule;

    public Formule recupererFormule() {
        return this.formule;
    }

    public void ajouter(Formule formule) {
        this.formule = formule;
    }
}
