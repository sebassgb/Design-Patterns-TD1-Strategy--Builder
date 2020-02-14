package modele_point_3;

public class FabriqueAnimaux {
    private Animal animal;

    public FabriqueAnimaux(Animal animal) {
        this.animal = animal;
    }

    public Animal creerChien() {
        return animal.clone();
    }

    public Animal creerChat() {
        return animal.clone();
    }

}