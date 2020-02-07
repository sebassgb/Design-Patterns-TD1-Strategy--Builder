package programme;

import modele.Arbres.ArbreFruitierNonGereException;
import modele.Arbres.ArbreFrutier;
import modele.Arbres.FabriqueArbreFrutier;
import modele.Hobbit;

public class Main {
    public static void main(String[] args) throws ArbreFruitierNonGereException {
        FabriqueArbreFrutier fabriqueArbreFrutier = new FabriqueArbreFrutier();
        ArbreFrutier Pommier =  fabriqueArbreFrutier.creer("Pommier");
        ArbreFrutier Poirier =  fabriqueArbreFrutier.creer("Poirier");
        Hobbit maraudeur = new Hobbit("Merry");
        maraudeur.mange(Pommier.cueille());
        maraudeur.mange(Poirier.cueille());
    }

}