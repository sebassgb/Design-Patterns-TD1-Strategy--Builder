package modele.Arbres;

import modele.Arbres.ArbreFrutier;
import modele.Fruit.FabriquePomme;

public class Pommier extends ArbreFrutier {

public static final String POMMIER = "Pommier";

Pommier(){
    super(new FabriquePomme(), POMMIER);
}

}
