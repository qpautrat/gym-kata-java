package test.GestionDesFormules;

import main.GestionDesFormules.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class CreerUneFormule {

    @Test
    public void cree_une_formule() {

        // Arrange
        String nom = "Formule All-In";
        Integer prix = 3000;
        HashMap<String, FormuleAggregate> formules = new HashMap<>();
        ListeDesFormules listeDesFormules = new InMemoryListeDesFormules(formules);
        CreeUneFormuleCommand creeUneFormuleCommand = new CreeUneFormuleCommand(nom, prix);
        FormuleRepository formuleRepository = new InMemoryFormuleRepository(formules);
        CreerUneFormuleHandler creerUneFormuleHandler = new CreerUneFormuleHandler(formuleRepository);

        // Act
        creerUneFormuleHandler.execute(creeUneFormuleCommand);

        // Assert
        FormuleViewModel formuleViewModel = listeDesFormules.chercherParNom(nom);
        Assertions.assertEquals(prix, formuleViewModel.prix());
    }
}
