package test.gestionDesFormules;

import main.gestionDesFormules.CreerUneFormule;
import main.gestionDesFormules.Formule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreerUneFormuleTest {

    @Test
    public void creerUneFormule() {
        // Given
        int id = 1;
        SpyFormuleRepository formulesRepository = new SpyFormuleRepository();
        var creerUneFormule = new CreerUneFormule(formulesRepository);
        int prix = 100;

        // When
        creerUneFormule.execute(id, prix);

        // Then
        Formule formule = formulesRepository.recupererFormule();
        Assertions.assertEquals(formule.id(), id);
        Assertions.assertEquals(formule.prix(), prix);
    }
}
