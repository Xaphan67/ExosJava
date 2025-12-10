import java.util.*;

import Packages.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static ArrayList<Livre> livres = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("\nBienvenue dans la bibliothèque. Que voulez-vous faire ?");
        System.out.println("1 - Ajouter des livres\n2 - Voir les informations\n3 - Quitter");
        int choix = 0;
        if (scanner.hasNextInt()) {
            choix = scanner.nextInt();
            scanner.nextLine();
        }
        else {
            System.out.println("Choix non valide.");
            scanner.nextLine();
            main(null);
        }

        if (choix > 0 && choix <= 2) {
            if (choix == 1) {
                ajouterLivres();
            }
            else {
                afficherInfos();
            }
            main(null);
        }
        else {
            if ((choix != 3)) {
                System.out.println("Choix non valide.");
                main(null);
            }
        }
    }

    // Ajoute un ou plusieurs livres dans la bibliothèque
    public static void ajouterLivres() {
        // Demande le nombre de livres à ajouter
        System.out.println("\nCombien de livres ajouter dans la bibliothèque ?");
        int totalLivres = 0;
        if (scanner.hasNextInt()) {
            totalLivres = scanner.nextInt();
            scanner.nextLine();
        }
        else {
            System.out.println("Merci de saisir un nombre entier...");
            scanner.nextLine();
            ajouterLivres();
        }

        // Ajoute les livres
        for (int i = 0; i < totalLivres; i++) {
            livres.add(new Livre(scanner));
        }
    }

    // Affiche le nombre de livres, le total des prix des livres et la liste complète des livres de la bibliothèque
    public static void afficherInfos() {
        // Affiche le nombre de livres et le prix total
        System.out.println("\nLa bibliothèque contient " + livres.size() + " livre(s).");
        System.out.print("Le total du prix des livres est :");
        double total = 0;
        for (Livre livre : livres) {
            total += livre.getPrix();
        }
        System.out.println(total + "€");

        // Liste les livres
        if (!livres.isEmpty()) {
            System.out.println("\nListe des livres de la bibliothèque :");
            for(Livre livre : livres) {
                System.out.println(livre.getTitre() + " écrit par " + livre.getAuteur() + " - Prix : " + livre.getPrix() + "€");
            }
        }
    }
}