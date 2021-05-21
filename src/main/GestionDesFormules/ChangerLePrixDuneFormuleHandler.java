package main.GestionDesFormules;

public class ChangerLePrixDuneFormuleHandler {
    private final FormuleRepository formuleRepository;

    public ChangerLePrixDuneFormuleHandler(FormuleRepository formuleRepository) {

        this.formuleRepository = formuleRepository;
    }

    public void execute(ChangeLePrixDuneFormuleCommand changeLePrixDuneFormuleCommand) {
        FormuleAggregate formuleAggregate = this.formuleRepository.chercheParNom(changeLePrixDuneFormuleCommand.nomDeLaFormule());
        formuleAggregate.changeLePrix(changeLePrixDuneFormuleCommand.nouveauPrix());

        this.formuleRepository.metAJour(formuleAggregate);
    }
}
