package main.gestionDesFormules;

public class CreerUneFormule {
    private FormuleRepository formulesRepository;

    public CreerUneFormule(FormuleRepository formulesRepository) {
        this.formulesRepository = formulesRepository;
    }

    public void execute(CreeUneFormuleCommand creeUneFormuleCommand) {
        if (creeUneFormuleCommand.prix() < 0) {
            throw new IllegalStateException();
        }
        var formule = new Formule(creeUneFormuleCommand.id(), creeUneFormuleCommand.prix());
        this.formulesRepository.ajouter(formule);
    }
}
