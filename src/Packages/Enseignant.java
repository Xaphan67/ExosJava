package Packages;

public class Enseignant {

    private String nom;
    private String prenom;
    private Specialite specialite;

    public Enseignant (String nom, String prenom, Specialite specialite) {
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Specialite getSpecialite() {
        return specialite;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }
}
