package programme;

import modele.Corrige;
import modele.FabriqueMoyenPaiement;
import modele.MoyenPaiement;
import modele.Panier;

import java.util.Scanner;

public class Main {


    private static MoyenPaiement choix(){
        FabriqueMoyenPaiement fabriqueMoyenPaiement = new FabriqueMoyenPaiement();
        System.out.println("Choisissez un moyen de paiement : ");
        Scanner scanner = new Scanner(System.in);
        int choix = scanner.nextInt();

        switch (choix){
            case 1:
                System.out.println("Donnez votre adresse mail");
                scanner = new Scanner(System.in);
                String email = scanner.next();
                System.out.println("Donnez le no d'autorisation");
                String noAutorisation = scanner.next();
                return fabriqueMoyenPaiement.paiementPaypal(email,noAutorisation);

            case 2:
                scanner = new Scanner(System.in);
                System.out.println("Donnez votre nom");
                String nom = scanner.next();
                System.out.println("Donnez le no de CB");
                String noCB = scanner.next();

                System.out.println("Donnez votre crypto");
                String crypto = scanner.next();
                System.out.println("Donnez la date d'expiration");
                String expire = scanner.next();
                return fabriqueMoyenPaiement.paiementCartebancaire(nom,noCB, crypto, expire);
            default:
                throw new RuntimeException("moyen de paiement non pris en compte");

        }

    }

    public static void main(String[] args) {
        
        MoyenPaiement moyenPaiement = choix();

        Panier panier = new Panier(moyenPaiement);
        panier.addItem(new Corrige() {
            @Override
            public int getPrice() {
                return 10;
            }
        });

        panier.addItem(new Corrige() {
            @Override
            public int getPrice() {
                return 30;
            }
        });
        
        panier.pay();

        }


}
