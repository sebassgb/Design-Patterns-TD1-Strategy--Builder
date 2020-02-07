package modele.Arbres;

public class FabriqueArbreFrutier {

    public ArbreFrutier creer(String arbre) throws ArbreFruitierNonGereException {

        switch (arbre){
            case "Pommier": return new Pommier();
            case "Poirier": return new Poirier();
        }

        throw new ArbreFruitierNonGereException();

    }
}
