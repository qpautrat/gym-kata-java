package test.GestionDesFormules;

import main.GestionDesFormules.FormuleAggregate;
import main.GestionDesFormules.FormuleRepository;

import java.util.HashMap;

public class InMemoryFormuleRepository implements FormuleRepository {
    private final HashMap<String, FormuleAggregate> formules;

    public InMemoryFormuleRepository(HashMap<String, FormuleAggregate> formules) {
        this.formules = formules;
    }

    @Override
    public void ajoute(FormuleAggregate formuleAggregate) {
        this.formules.put(formuleAggregate.nom(), formuleAggregate);
    }

    @Override
    public FormuleAggregate chercheParNom(String nomDeLaFormule) {
        return this.formules.get(nomDeLaFormule);
    }

    @Override
    public void metAJour(FormuleAggregate formuleAggregate) {
        this.formules.put(formuleAggregate.nom(), formuleAggregate);
    }
}
