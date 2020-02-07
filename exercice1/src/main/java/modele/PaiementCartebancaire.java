package modele;

import org.apache.log4j.Logger;

public class PaiementCartebancaire implements MoyenPaiement {

    private String nom;
    private String noCB;
    private String crypto;
    private String expire;

    private static Logger logger = Logger.getLogger(PaiementCartebancaire.class);


    public PaiementCartebancaire(String nom, String noCB, String crypto, String expire){
        this.nom = nom;
        this.noCB = noCB;
        this.crypto = crypto;
        this.expire = expire;
    }

    public void payer(int quantite) {
        logger.info("Paiement de "+quantite+"£ par "+this.nom+" CB"+this.noCB+"/"+this.crypto+" exprire "+ this.expire);
    }
}
