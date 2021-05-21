package test.GestionDesFormules;

import main.GestionDesFormules.FormuleAggregate;
import main.GestionDesFormules.FormuleViewModel;
import main.GestionDesFormules.ListeDesFormules;

import java.util.HashMap;

public class InMemoryListeDesFormules implements ListeDesFormules {
    private final HashMap<String, FormuleAggregate> formules;

    public InMemoryListeDesFormules(HashMap<String, FormuleAggregate> formules) {
        this.formules = formules;
    }

    @Override
    public FormuleViewModel chercherParNom(String nom) {
        FormuleAggregate formuleAggregate = this.formules.get(nom);

        return new FormuleViewModel(formuleAggregate.nom(), formuleAggregate.prix());
    }
}
