package test.gestionDesFormules;

import main.gestionDesFormules.CreerUneFormule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreerUneFormuleTest {

    @Test
    public void creerUneFormule() {
        // Given
        int id = 1;
        var creerUneFormule = new CreerUneFormule();

        // When
        var formule = creerUneFormule.execute(id);

        // Then
        Assertions.assertEquals(formule.id(), id);
    }
}
