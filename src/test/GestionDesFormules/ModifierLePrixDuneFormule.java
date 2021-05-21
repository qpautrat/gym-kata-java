package test.GestionDesFormules;

import main.GestionDesFormules.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class ModifierLePrixDuneFormule {

    @Test
    public void modifie_le_prix_dune_formule() {

        // Arrange
        String nomDeLaFormule = "Formule All-In";
        Integer prix = 3000;
        FormuleAggregate formuleAggregate = new FormuleAggregate(nomDeLaFormule, prix);
        HashMap<String, FormuleAggregate> formules = new HashMap<>();
        FormuleRepository formuleRepository = new InMemoryFormuleRepository(formules);
        formuleRepository.ajoute(formuleAggregate);
        Integer nouveauPrix = 4000;
        ListeDesFormules listeDesFormules = new InMemoryListeDesFormules(formules);
        ChangeLePrixDuneFormuleCommand changeLePrixDuneFormuleCommand = new ChangeLePrixDuneFormuleCommand(
                nomDeLaFormule,
                nouveauPrix
        );
        ChangerLePrixDuneFormuleHandler changerLePrixDuneFormuleHandler = new ChangerLePrixDuneFormuleHandler(formuleRepository);

        // Act
        changerLePrixDuneFormuleHandler.execute(changeLePrixDuneFormuleCommand);

        // Assert
        FormuleViewModel formuleViewModel = listeDesFormules.chercherParNom(nomDeLaFormule);
        Assertions.assertEquals(nouveauPrix, formuleViewModel.prix());
    }
}
