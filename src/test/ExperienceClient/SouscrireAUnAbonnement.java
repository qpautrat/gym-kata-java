package test.ExperienceClient;

import main.ExperienceClient.*;
import main.GestionDesFormules.FormuleAggregate;
import main.GestionDesFormules.ListeDesFormules;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import test.GestionDesFormules.InMemoryListeDesFormules;

import java.util.HashMap;

public class SouscrireAUnAbonnement {

    @Test
    public void souscris_a_un_abonnement() {

        // Arrange
        Integer abonnementId = 1;
        String nomDeLaFormule = "Formule All-In";
        Integer prixDeLaFormule = 3000;
        HashMap<Integer, AbonnementAggregate> abonnements = new HashMap<Integer, AbonnementAggregate>();
        ListeDesAbonnements listeDesAbonnements = new InMemoryListeDesAbonnements(abonnements);
        SouscrisAUnAbonnementCommand souscrisAUnAbonnementCommand = new SouscrisAUnAbonnementCommand(
                abonnementId,
                nomDeLaFormule
        );
        HashMap<String, FormuleAggregate> formules = new HashMap<>();
        formules.put(nomDeLaFormule, new FormuleAggregate(nomDeLaFormule, prixDeLaFormule));

        ListeDesFormules listeDesFormules = new InMemoryListeDesFormules(formules);
        AbonnementRepository abonnementRepository = new InMemoryAbonnementRepository(abonnements);
        SouscrisAUnAbonnementHandler souscrisAUnAbonnementHandler = new SouscrisAUnAbonnementHandler(
                listeDesFormules, abonnementRepository
        );

        // Act
        souscrisAUnAbonnementHandler.execute(souscrisAUnAbonnementCommand);

        // Assert
        AbonnementViewModel abonnementViewModel = listeDesAbonnements.chercheParId(abonnementId);
        Assertions.assertEquals(prixDeLaFormule, abonnementViewModel.prix());
    }
}
