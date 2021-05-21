package main.GestionDesFormules.infrastructure;

import main.GestionDesFormules.FormuleAggregate;
import main.GestionDesFormules.FormuleRepository;

public class PostgresFormuleRepository implements FormuleRepository {
    @Override
    public void ajoute(FormuleAggregate formuleAggregate) {

    }

    @Override
    public FormuleAggregate chercheParNom(String nomDeLaFormule) {
        return null;
    }

    @Override
    public void metAJour(FormuleAggregate formuleAggregate) {

    }
}
