package main.GestionDesFormules;

public interface FormuleRepository {
    void ajoute(FormuleAggregate formuleAggregate);

    FormuleAggregate chercheParNom(String nomDeLaFormule);

    void metAJour(FormuleAggregate formuleAggregate);
}
