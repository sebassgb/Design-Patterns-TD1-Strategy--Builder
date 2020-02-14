package programme;

import modele.Animal;
import modele.Chien;
import modele.FabriqueAnimaux;
import modele.FabriqueChien;

public class Main {
    public static void main(String[] args) {

        FabriqueAnimaux fabriqueAnimaux = new FabriqueAnimaux();
        Animal toto = fabriqueAnimaux.creer();
    }
}
