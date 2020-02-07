package modele.Fruit;

public class FabriquePoire implements FabriqueFruit {
    public Fruit creer() {
        return new Poire();
    }
}
