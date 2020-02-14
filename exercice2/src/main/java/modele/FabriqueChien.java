package modele;

public class FabriqueChien extends FabriqueAnimaux {
    public Animal creer() {
        return new Chien();
    }
}