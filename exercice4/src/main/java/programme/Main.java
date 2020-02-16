package programme;

import modele.Contact;
import modele.Personne;
import modele.PersonneBuilder;

import java.util.Collection;

public class Main {
    public static void main(String[] args)  {

        PersonneBuilder Yohan = new PersonneBuilder("BOICHUT", "Yohan")
                .adresse("8 rue Maurice Roy")
                .email("yohan.boichut@univ-orleans.fr")
                .numeroTelephone("0648329743")
                .ville("Orléans")
                .contacts((Collection) new Contact(Contact.SocialNetwork.LINKEDIN,"https://www.linkedin.com/in/yohan-boichut-b0695b24/"));

        PersonneBuilder Frederic = new PersonneBuilder("MOAL", "Frédéric")
                .adresse("68 Boulevard Lahitolle")
                .email("frederic.moal@univ-orleans.fr")
                .numeroTelephone("0648329741")
                .ville("Orléans")
                .contacts((Collection) new Contact(Contact.SocialNetwork.TWITTER,"FredericMoal"))
                .contacts((Collection) new Contact(Contact.SocialNetwork.LINKEDIN,"https://www.linkedin.com/in/frédéric-moal-146437b/"));

    }
}
