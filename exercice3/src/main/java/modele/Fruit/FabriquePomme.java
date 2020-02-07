package modele.Fruit;

public class FabriquePomme implements FabriqueFruit {

    public Fruit creer() {
        return new Pomme();
    }
}
