package main.ExperienceClient;

import main.GestionDesFormules.FormuleViewModel;
import main.GestionDesFormules.ListeDesFormules;

public class SouscrisAUnAbonnementHandler {
    private ListeDesFormules listeDesFormules;
    private AbonnementRepository abonnementRepository;

    public SouscrisAUnAbonnementHandler(ListeDesFormules listeDesFormules, AbonnementRepository abonnementRepository) {
        this.listeDesFormules = listeDesFormules;
        this.abonnementRepository = abonnementRepository;
    }

    public void execute(SouscrisAUnAbonnementCommand souscrisAUnAbonnementCommand) {
        FormuleViewModel formuleViewModel = this.listeDesFormules.chercherParNom(souscrisAUnAbonnementCommand.nomDeLaFormule());
        AbonnementAggregate abonnementAggregate = new AbonnementAggregate(
                souscrisAUnAbonnementCommand.abonnementId(),
                formuleViewModel.prix()
        );

        this.abonnementRepository.ajoute(abonnementAggregate);
    }
}
