package main.gestionDesFormules;

public class CreerUneFormule {
    private FormuleRepository formulesRepository;

    public CreerUneFormule(FormuleRepository formulesRepository) {
        this.formulesRepository = formulesRepository;
    }

    public void execute(CreeUneFormuleCommand creeUneFormuleCommand) {
        var formule = new Formule(creeUneFormuleCommand.id(), creeUneFormuleCommand.prix());
        this.formulesRepository.ajouter(formule);
    }
}
