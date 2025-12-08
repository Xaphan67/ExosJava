import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Devinette();
    }

    // Exercice 1 : Nombre pair
    public static void Pair() {

        // Demander à l'utilisateur un nombre
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tapper un chiffre :");

        // Stocker le nombre dans une variable
        int nb = scanner.nextInt();

        // Afficher le résultat
        System.out.println(nb + " est " + (nb % 2 == 0 ? "pair" : "impair"));
    }

    // Exercice 2 : Moyenne
    public static void Moyenne() {
        Scanner scanner = new Scanner(System.in);

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
        Scanner scanner = new Scanner(System.in);

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
        Scanner scanner = new Scanner(System.in);

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
}