package modele;

import modele.Fruit.Fruit;
import org.apache.log4j.Logger;


public class Hobbit {
    private String nom;
    private static org.apache.log4j.Logger Logger = org.apache.log4j.Logger.getLogger(Hobbit.class);

    public Hobbit(String merry) {
        this.nom = merry;
    }

    public void mange(Fruit fruit) {
        Logger.info(nom + " mange " + fruit);
    }
}
