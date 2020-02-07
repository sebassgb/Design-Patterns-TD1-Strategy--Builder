package modele;

public class FabriqueMoyenPaiement {

    public MoyenPaiement paiementPaypal(String email, String noAutorisation) {
        return new PaiementPaypal(email, noAutorisation);
    }


    public MoyenPaiement paiementCartebancaire(String nom, String noCB, String crypto, String expire) {
        return new PaiementCartebancaire(nom, noCB, crypto, expire);
    }
}
