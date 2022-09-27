package main.gestionDesFormules;

public class CreerUneFormule {
    private FormuleRepository formulesRepository;

    public CreerUneFormule(FormuleRepository formulesRepository) {
        this.formulesRepository = formulesRepository;
    }

    public void execute(int id, int prix) {
        var formule = new Formule(id, prix);
        this.formulesRepository.ajouter(formule);
    }
}
