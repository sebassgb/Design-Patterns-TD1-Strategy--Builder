package modele;

import java.util.Collection;

public class Personne {
    private String nom;
    private String prenom;
    private String adresse;
    private String ville;
    private String email;
    private String numeroTelephone;
    private Collection<Contact> contacts;

    protected Personne(PersonneBuilder personneBuilder) {
        this.nom = personneBuilder.nom;
        this.prenom = personneBuilder.prenom;
        this.adresse = personneBuilder.adresse;
        this.ville = personneBuilder.ville;
        this.email = personneBuilder.email;
        this.numeroTelephone = personneBuilder.numeroTelephone;
        this.contacts = personneBuilder.contacts;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public Collection<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Collection<Contact> contacts) {
        this.contacts = contacts;
    }


}
