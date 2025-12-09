import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Random;
import java.util.Scanner;

import Packages.Enseignant;
import Packages.Specialite;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*Personne cedric = new Personne("Falda", "Cédric", 38);
        System.out.println("Bonjour, je m'appelle " + cedric.getNom() + " " + cedric.getPrenom() + ", j'ai " + cedric.getAge() + " ans");*/

        Specialite java = new Specialite("JAVA/JEE");
        Specialite html = new Specialite("HTML/CSS");
        Specialite gestionProjet = new Specialite("Gestion de projet");
        Specialite js = new Specialite("JS");
        Specialite php = new Specialite("PHP");

        Enseignant enseignant1 = new Enseignant("Nom1", "Prenom1", java);
        Enseignant enseignant2 = new Enseignant("Nom2", "Prenom2", java);
        Enseignant enseignant3 = new Enseignant("Nom3", "Prenom3", php);
        Enseignant enseignant4 = new Enseignant("Nom4", "Prenom4", js);

        Specialite[] specialites = {java, html, gestionProjet, js, php};
        Enseignant[] enseignants = {enseignant1, enseignant2, enseignant3, enseignant4};

        System.out.println("Enseignants par spécialité :");
        for (Specialite specialite : specialites) {
            System.out.println(specialite.getLibelle() + " :");
            boolean vide = true;
            for (Enseignant enseignant : enseignants) {
                if (enseignant.getSpecialite() == specialite) {
                    System.out.println(enseignant.getNom() + " " + enseignant.getPrenom());
                    vide = false;
                }
            }
            if (vide) {
                System.out.println("Aucun enseignant pour la spécialité " + specialite.getLibelle());
            }
        }
    }

    // Exercice 1 : Nombre pair
    public static void Pair() {

        // Demander à l'utilisateur un nombre
        System.out.println("Tapper un chiffre :");

        // Stocker le nombre dans une variable
        int nb = scanner.nextInt();

        // Afficher le résultat
        System.out.println(nb + " est " + (nb % 2 == 0 ? "pair" : "impair"));
    }

    // Exercice 2 : Moyenne
    public static void Moyenne() {
        // Demander à l'utilisateur le nombre de notes
        System.out.println("Entrer le nombre de notes :");
        int nbNotes = scanner.nextInt();

        // Demander à l'utilisateur les notes
        double[] notes = new double[nbNotes];
        for (int i = 0; i < nbNotes; i++) {
            System.out.println("Tapper la note " + (i + 1) + " :");
            // Stocker le nombre dans une variable
            notes[i] = scanner.nextDouble();
        }

        // Calculer la moyenne
        double sommeNotes = 0;
        for (double i : notes) {
            sommeNotes += i;
        }
        double moyenne = sommeNotes / nbNotes;

        // Afficher la moyenne
        System.out.println("La moyenne des " + nbNotes + " notes est : " + moyenne);
    }

    // Exercice 3 : Table de multiplication
    public static void TableMult() {
        // Demander à l'utilisateur quelle table de multiplication afficher
        System.out.println("Entrer la table à afficher :");

        int table = scanner.nextInt();

        // Afficher la table
        System.out.println("Table de " + table + " :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(table + " x " + i + " = " + table * i);
        }
    }

    // Exercice 4 : Jeu de devinette
    public static void Devinette() {
        // Nombre secret à trouver
        Random rng = new Random();
        int nbSecret = rng.nextInt(1, 100);

        // Demander à l'utilisateur de saisir un nombre, jusqu'a ce qu'il trouve le bon
        int userInput = 0;
        int userTries = 0;
        while (userInput != nbSecret) {
            // Demander à l'utilisateur de saisir un nombre
            System.out.println("Entrer un nombre entre 1 et 100 :");
            userInput = scanner.nextInt();

            // Si le nombre n'est pas bon, guide l'utilisateur vers le bon nombre
            if (userInput != nbSecret) {
                System.out.println(userInput < nbSecret ? "Trop petit !" : "Trop grand !");
            }

            // Incrémente le nombre d'essais
            userTries++;
        }

        // Afficher un message de réussite
        System.out.println("Bravo, vous avez trouvé le bon nombre en " + userTries + " essais !");
    }

    // Exercice 5 : Tableau et calculs
    public static void TabCalc() {
        // Demander à l'utilisateur la taille du tableau
        System.out.println("Entrez le total de nombres à saisir :");
        int nbs = scanner.nextInt();

        // Déclaration du tableau
        int[] tableau = new int[nbs];

        // Demander à l'utilisateur de remplir le tableau
        for(int i = 0; i < nbs; i++) {
            System.out.println("Entrez le nombre " + (i + 1) + " :");
            tableau[i] = scanner.nextInt();
        }

        // Calcul de la somme et moyenne
        double sommeNombres = 0;
        for (int i : tableau) {
            sommeNombres += i;
        }
        double moyenne = sommeNombres / nbs;

        // Affichage des résultats
        System.out.println("Somme : " + sommeNombres + " - Moyenne : " + moyenne);
    }
    
    // Exercice 6 : Comptage de voyelles
    public static void Voyelles() {
        // Demander à l'utilisateur une phrase
        System.out.println("Entrez une phrase :");
        char[] phrase = scanner.nextLine().toLowerCase().toCharArray();

        // Déclaration du tableau des voyelles
        char[] voyelles = {'a', 'e', 'i', 'o', 'u', 'y'};

        // Comptage des voyelles
        int totalVoyelles = 0;
        for(char i : phrase) {
            for(char j : voyelles) {
                if (i == j) {
                    totalVoyelles++;
                }
            }
        }

        // Affichage des résultats
        System.out.println("La phrase contient " + totalVoyelles + " voyelles.");
    }
}