package modele;

import java.util.Collection;

public final class PersonneBuilder {

    protected String nom;
    protected String prenom;
    protected String adresse;
    protected String ville;
    protected String email;
    protected String numeroTelephone;
    protected Collection<Contact> contacts;

    public PersonneBuilder(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public PersonneBuilder adresse(String adresse) {
        this.adresse = adresse;
        return this;
    }

    public PersonneBuilder email(String email) {
        this.email = email;
        return this;
    }

    public PersonneBuilder ville(String ville) {
        this.ville = ville;
        return this;
    }

    public PersonneBuilder numeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
        return this;
    }

    public PersonneBuilder contacts(Collection contacts) {
        this.contacts = contacts;
        return this;
    }

    public Personne build(){
        return new Personne(this);
    }


}
