package test.gestionDesFormules;

import main.gestionDesFormules.CreeUneFormuleCommand;
import main.gestionDesFormules.CreerUneFormule;
import main.gestionDesFormules.Formule;
import main.gestionDesFormules.PrixNegatifException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreerUneFormuleTest {

    @Test
    public void creerUneFormule() {
        // Given
        int id = 1;
        int prix = 100;
        SpyFormuleRepository formulesRepository = new SpyFormuleRepository();
        var creerUneFormule = new CreerUneFormule(formulesRepository);
        CreeUneFormuleCommand creeUneFormuleCommand = new CreeUneFormuleCommand(id, prix);

        // When
        creerUneFormule.execute(creeUneFormuleCommand);

        // Then
        Formule formule = formulesRepository.recupererFormule();
        Assertions.assertEquals(formule.id(), id);
        Assertions.assertEquals(formule.prix(), prix);
    }
    @Test
    public void nePeutPasCreerUneFormuleAvecUnPrixNegatif() {
        // Given
        int id = 1;
        int prix = -100;
        DummyFormuleRepository formulesRepository = new DummyFormuleRepository();
        var creerUneFormule = new CreerUneFormule(formulesRepository);
        CreeUneFormuleCommand creeUneFormuleCommand = new CreeUneFormuleCommand(id, prix);

        // When & Then
        Assertions.assertThrows(PrixNegatifException.class, () -> creerUneFormule.execute(creeUneFormuleCommand));
    }
}
