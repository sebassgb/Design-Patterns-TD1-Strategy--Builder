package modele.Arbres;

import modele.Arbres.ArbreFrutier;
import modele.Fruit.FabriqueFruit;
import modele.Fruit.FabriquePomme;

public class Poirier extends ArbreFrutier {

    public static final String POIRIER = "Poirier";

    Poirier(){
        super(new FabriquePomme(), POIRIER);
    }

    public Poirier(FabriqueFruit arbre, String Poirier) {
        super(arbre, Poirier);
    }
}