package main.gestionDesFormules;

import test.gestionDesFormules.SpyFormuleRepository;

public class CreerUneFormule {
    private SpyFormuleRepository formulesRepository;

    public CreerUneFormule(SpyFormuleRepository formulesRepository) {
        this.formulesRepository = formulesRepository;
    }

    public void execute(int id) {
        var formule = new Formule(id);
        this.formulesRepository.ajouter(formule);
    }
}
