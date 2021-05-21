package test.ExperienceClient;

import main.ExperienceClient.AbonnementAggregate;
import main.ExperienceClient.AbonnementRepository;

import java.util.HashMap;

public class InMemoryAbonnementRepository implements AbonnementRepository {
    private final HashMap<Integer, AbonnementAggregate> abonnements;

    public InMemoryAbonnementRepository(HashMap<Integer, AbonnementAggregate> abonnements) {
        this.abonnements = abonnements;
    }

    @Override
    public void ajoute(AbonnementAggregate abonnementAggregate) {
        this.abonnements.put(abonnementAggregate.id(), abonnementAggregate);
    }
}
