package modele_point_3;

public class Main {
    public static void main(String args[])
    {
        Animal          chienTemp = null;
        Animal          chatTemp = null;
        Animal        toto       = new Chien("toto");
        Animal        titi       = new Chat("titi");
        FabriqueAnimaux forestDesAnimaux = new FabriqueAnimaux(toto);
        FabriqueAnimaux forestDesAnimaux2 = new FabriqueAnimaux(titi);

        for (int i=0; i<10; i++)//création des clonnes
        {
            chienTemp = forestDesAnimaux.creerChien();
            chatTemp = forestDesAnimaux2.creerChat();
        }
    }
}
