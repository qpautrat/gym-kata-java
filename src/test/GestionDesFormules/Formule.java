package test.GestionDesFormules;

import main.GestionDesFormules.FormuleAggregate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Formule {

    @Test
    public void on_ne_peut_pas_changer_le_prix_avec_un_prix_negatif() {
        // Arrange
        Integer nouveauPrix = -1000;
        FormuleAggregate formuleAggregate = new FormuleAggregate("test", 1000);

        // Act & Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            formuleAggregate.changeLePrix(nouveauPrix); });
    }
}
