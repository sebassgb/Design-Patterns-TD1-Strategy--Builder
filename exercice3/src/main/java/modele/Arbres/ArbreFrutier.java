package modele.Arbres;

import modele.Fruit.FabriqueFruit;
import modele.Fruit.Fruit;

public class ArbreFrutier {
    private FabriqueFruit fabriqueFruit;
    private String type;

    public ArbreFrutier(FabriqueFruit arbre, String pommier)
    {
     this.fabriqueFruit = fabriqueFruit;
     this.type = type;
    }

    public Fruit cueille(){
        return fabriqueFruit.creer();
    }
}
