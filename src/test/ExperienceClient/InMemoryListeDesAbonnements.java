package test.ExperienceClient;

import main.ExperienceClient.AbonnementAggregate;
import main.ExperienceClient.AbonnementViewModel;
import main.ExperienceClient.ListeDesAbonnements;

import java.util.HashMap;

public class InMemoryListeDesAbonnements implements ListeDesAbonnements {
    private final HashMap<Integer, AbonnementAggregate> abonnements;

    public InMemoryListeDesAbonnements(HashMap<Integer, AbonnementAggregate> abonnements) {
        this.abonnements = abonnements;
    }

    @Override
    public AbonnementViewModel chercheParId(Integer abonnementId) {
        AbonnementAggregate abonnementAggregate = this.abonnements.get(abonnementId);

        return new AbonnementViewModel(abonnementAggregate.prix());
    }
}
