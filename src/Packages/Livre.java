package Packages;

import java.util.Scanner;

public class Livre {

    private String titre;
    private String auteur;
    private double prix;

    public Livre(Scanner scanner) {
        System.out.println("Saisir le nom du livre :");
        titre = scanner.nextLine();
        System.out.println("Saisir l'auteur du livre :");
        auteur = scanner.nextLine();
        System.out.println("Saisir le prix du livre :");
        boolean prixValide = false;
        while (!prixValide) {
            if (scanner.hasNextDouble()) {
                prix = scanner.nextDouble();
                prixValide = true;
            } else {
                System.out.println("Prix non valide. Veuillez re-essayer :");
            }
            scanner.nextLine();
        }

        System.out.println("Livre '" + titre + "' par '" + auteur + "' ajouté. Prix: " + prix + "€");
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public double getPrix() {
        return prix;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
