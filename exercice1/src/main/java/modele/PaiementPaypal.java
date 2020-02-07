package modele;

import org.apache.log4j.Logger;

public class PaiementPaypal implements MoyenPaiement {

    private static Logger logger = Logger.getLogger(PaiementPaypal.class);
    private String email;
    private String noAutorisation;

    public PaiementPaypal(String email, String noAutorisation){
        this.email = email;
        this.noAutorisation = noAutorisation;
    }

    public void payer(int quantite) {
        logger.info("Paiement de "+quantite+" PayPal dont avec les infos suivantes:\n\t - email: "+this.email+"\n\t -numero d'autorisation: "+this.noAutorisation);

    }
}
