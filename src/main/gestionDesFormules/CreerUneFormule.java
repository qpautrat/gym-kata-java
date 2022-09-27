package main.gestionDesFormules;

public class CreerUneFormule {
    private FormuleRepository formulesRepository;

    public CreerUneFormule(FormuleRepository formulesRepository) {
        this.formulesRepository = formulesRepository;
    }

    public void execute(int id) {
        var formule = new Formule(id);
        this.formulesRepository.ajouter(formule);
    }
}
