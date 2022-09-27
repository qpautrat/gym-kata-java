package test.gestionDesFormules;

import main.gestionDesFormules.CreerUneFormule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreerUneFormuleTest {

    @Test
    public void creerUneFormule() {
        // Given
        int id = 1;
        SpyFormuleRepository formulesRepository = new SpyFormuleRepository();
        var creerUneFormule = new CreerUneFormule(formulesRepository);

        // When
        creerUneFormule.execute(id);

        // Then
        Assertions.assertEquals(formulesRepository.recupererFormule().id(), id);
    }
}
