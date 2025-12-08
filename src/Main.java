import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Moyenne();
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
}