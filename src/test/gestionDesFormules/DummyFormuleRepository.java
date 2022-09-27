package test.gestionDesFormules;

import main.gestionDesFormules.Formule;
import main.gestionDesFormules.FormuleRepository;

public class DummyFormuleRepository implements FormuleRepository {
    @Override
    public void ajouter(Formule formule) {
        throw new RuntimeException("Ne doit pas être appelé.");
    }
}
