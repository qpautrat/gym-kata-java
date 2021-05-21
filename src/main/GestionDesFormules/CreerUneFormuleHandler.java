package main.GestionDesFormules;

import java.util.HashMap;

public class CreerUneFormuleHandler {
    private FormuleRepository formuleRepository;

    public CreerUneFormuleHandler(FormuleRepository formuleRepository) {
        this.formuleRepository = formuleRepository;
    }

    public void execute(CreeUneFormuleCommand creeUneFormuleCommand) {
        FormuleAggregate formuleAggregate = new FormuleAggregate(
                creeUneFormuleCommand.nom(),
                creeUneFormuleCommand.prix()
        );

        this.formuleRepository.ajoute(formuleAggregate);
    }
}
