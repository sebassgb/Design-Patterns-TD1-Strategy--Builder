package modele;

import modele.Corrige;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class Panier {
    private static Logger logger = Logger.getLogger(Panier.class);

    private MoyenPaiement moyenPaiement;

    List<Corrige> corriges;
    public Panier(MoyenPaiement moyenPaiement){
        this.corriges = new ArrayList<Corrige>();
        this.moyenPaiement = moyenPaiement;
    }

    public void addItem(Corrige corrige){
        this.corriges.add(corrige);
    }
    public void removeItem(Corrige corrige){
        this.corriges.remove(corrige);
    }

    public int calculerTotal(){
        int sum = 0;
        for(Corrige corrige : corriges){
            sum += corrige.getPrice();
        }
        return sum;
    }

    public void pay(){
       this.moyenPaiement.payer(this.calculerTotal());
    }
}