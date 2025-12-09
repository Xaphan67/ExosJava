package Packages;

public class Etudiant {

    private String nom;
    private String prenom;
    private Filiere filiere;

    public Etudiant (String nom, String prenom, Filiere filiere) {
        this.nom = nom;
        this.prenom = prenom;
        this.filiere = filiere;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }
}
