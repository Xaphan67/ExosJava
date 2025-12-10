import Packages.Enseignant;
import Packages.Etudiant;
import Packages.Filiere;
import Packages.Specialite;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ExosSerie1
{
    private static Scanner scanner = new Scanner(System.in);

    public static void serie1() {
        /*Personne cedric = new Personne("Falda", "Cédric", 38);
        System.out.println("Bonjour, je m'appelle " + cedric.getNom() + " " + cedric.getPrenom() + ", j'ai " + cedric.getAge() + " ans");*/

        // Déclaration des classes
        Specialite java = new Specialite("JAVA/JEE");
        Specialite html = new Specialite("HTML/CSS");
        Specialite gestionProjet = new Specialite("Gestion de projet");
        Specialite js = new Specialite("JS");
        Specialite php = new Specialite("PHP");

        Enseignant charles = new Enseignant("Montgomery Burns", "Charles", java);
        Enseignant zack = new Enseignant("Kas", "Zack", java);
        Enseignant karim = new Enseignant("Belabour", "Karim", php);
        Enseignant marie = new Enseignant("Paradise", "Marie", js);

        Filiere cda = new Filiere("CDA", "");
        Filiere marketing = new Filiere("Marketing", "");
        Filiere assistance = new Filiere("Assistance de vie", "");

        Etudiant homer = new Etudiant("Simpson", "Homer", cda);
        Etudiant bart = new Etudiant("Simpson", "bart", cda);
        Etudiant vanessa = new Etudiant("Sultan", "Vanessa", marketing);
        Etudiant marge = new Etudiant("Simpson", "Marge", marketing);
        Etudiant lisa = new Etudiant("Simpson", "Lisa", marketing);

        Specialite[] specialites = {java, html, gestionProjet, js, php};
        Enseignant[] enseignants = {charles, zack, karim, marie};
        Filiere[] filieres = {cda, marketing, assistance};
        Etudiant[] etudiants = {homer, bart, vanessa, marge, lisa};

        // Ajout des filières par enseignant
        charles.setFilieres(cda, marketing);
        zack.setFilieres(marketing);
        karim.setFilieres(cda, marketing, assistance);
        marie.setFilieres(assistance);

        // Appel des fonctions pour les exercices
        // Pair();
        // Moyenne();
        // TableMult();
        // Devinette();
        // TabCalc();
        // Voyelles();
        // PooExercice1(specialites, enseignants);
        // PooExercice2(filieres, etudiants);
        // PooExercice3(filieres, enseignants, etudiants);
        // PooExercice4(enseignants, filieres, etudiants);
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

    // POO - Exercice 1 : Enseignants par spécialité
    public static void PooExercice1(Specialite[] specialites, Enseignant[] enseignants) {
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

    // POO - Exercice 2 : Étudiants par filière
    public static void PooExercice2(Filiere[] filieres, Etudiant[] etudiants) {
        System.out.println("\nListe des étudiants par filière :");
        for (Filiere filiere : filieres) {
            System.out.println("Filière : " + filiere.getLibelle());
            boolean vide = true;
            int index = 1;
            for (Etudiant etudiant : etudiants) {
                if (etudiant.getFiliere() == filiere) {
                    System.out.println(index + "- " + etudiant.getNom() + " " + etudiant.getPrenom());
                    vide = false;
                    index++;
                }
            }
            if (vide) {
                System.out.println("Pas d'inscrit");
            }
        }
    }

    // POO - Exercice 3 : Étudiants et enseignants par filière
    public static void PooExercice3(Filiere[] filieres, Enseignant[] enseignants, Etudiant[] etudiants) {
        System.out.println("\nListe des étudiants et formateurs par filière :");
        boolean vide;
        int index = 1;
        for (Filiere filiere : filieres) {
            System.out.println("\n" + filiere.getLibelle());
            System.out.println("Formateur(s) : ");
            vide = true;
            index = 1;
            for (Enseignant enseignant : enseignants) {
                if (enseignant.getFilieres() != null) {
                    for (Filiere filiereEnseignant : enseignant.getFilieres()) {
                        if (filiereEnseignant == filiere) {
                            System.out.println(index + "- " + enseignant.getNom() + " " + enseignant.getPrenom());
                            vide = false;
                            index++;
                        }
                    }
                }
            }
            if (vide) {
                System.out.println("Aucun");
            }
            System.out.println("Étudiant(s) : ");
            vide = true;
            index = 1;
            for (Etudiant etudiant : etudiants) {
                if (etudiant.getFiliere() == filiere) {
                    System.out.println(index + "- " + etudiant.getNom() + " " + etudiant.getPrenom());
                    vide = false;
                    index++;
                }
            }
            if (vide) {
                System.out.println("Pas d'inscrit");
            }
        }
    }

    // POO - Exercice 4 : Affichage des infos d'un enseignant ou une filière
    public static void PooExercice4(Enseignant[] enseignants, Filiere[] filieres, Etudiant[] etudiants) {
        System.out.println("\nQue recherchez-vous ? (1 - Formateur / 2- Filière) :");
        String userTypeRecherche = scanner.nextLine();

        // Exécute la bonne méthode en fonction de la saisie utilisateur
        if (userTypeRecherche.toLowerCase().contains("formateur") || userTypeRecherche.equalsIgnoreCase("1")) {
            System.out.println("\nSaisissez le prénom d'un formateur :");
            InfosFormateur(scanner.nextLine(), enseignants, etudiants);
        }
        else if (userTypeRecherche.toLowerCase().contains("filière") || userTypeRecherche.equalsIgnoreCase("2")) {
            System.out.println("\nSaisissez le libéllé d'une filière :");
            InfosFiliere(scanner.nextLine(), enseignants, filieres, etudiants);
        }
        else {
            System.out.println("Saisie incorrecte");
            PooExercice4(enseignants, filieres, etudiants);
        }
    }

    // POO - Exercice 4 : Affiche les informations du formateur entré par l'utilisateur
    public static void InfosFormateur(String saisieUtilisateur, Enseignant[] enseignants, Etudiant[] etudiants) {

        // Recherche le formateur correspondant à la saisie de l'utilisateur
        Enseignant enseignantRecherche = null;
        for (Enseignant enseignant : enseignants) {
            if (enseignant.getPrenom().toLowerCase().contains(saisieUtilisateur.toLowerCase())) {
                enseignantRecherche = enseignant;
                break;
            }
        }

        // Récupère et affiche les informations correspondantes
        if (enseignantRecherche != null) {
            if (enseignantRecherche.getFilieres() != null) {

                // Pour chaque filière correspondant à l'enseignant…
                for (Filiere filiere : enseignantRecherche.getFilieres()) {

                    // Récupère les étudiants correspondants à la filière
                    ArrayList<Etudiant> etudiantsFiliere = new ArrayList<>();
                    for (Etudiant etudiant : etudiants) {
                        if (etudiant.getFiliere() == filiere) {
                            etudiantsFiliere.add(etudiant);
                        }
                    }

                    // Affiche les informations
                    System.out.println("\n" + enseignantRecherche.getPrenom() + " anime la formation " + filiere.getLibelle() + " avec " + etudiantsFiliere.toArray().length + " étudiants :");
                    for (Etudiant e : etudiantsFiliere) {
                        System.out.println(e.getNom() + " " + e.getPrenom());
                    }
                }
            }
            else {
                System.out.println("Ce formateur n'a aucune filière qui lui est affectée !");
            }
        }
        else {
            System.out.println("Formateur non trouvé !");
        }
    }

    // POO - Exercice 4 : Affiche les informations d'une filière entrée par l'utilisateur
    public static void InfosFiliere(String saisieUtilisateur, Enseignant[] enseignants, Filiere[] filieres, Etudiant[] etudiants) {

        // Recherche la filière correspondante à la saisie de l'utilisateur
        Filiere filiereRecherche = null;
        for (Filiere filiere : filieres) {
            if (filiere.getLibelle().toLowerCase().contains(saisieUtilisateur.toLowerCase())) {
                filiereRecherche = filiere;
                break;
            }
        }

        // Récupère et affiche les informations correspondantes
        if (filiereRecherche != null) {

            // Récupère les enseignants correspondants à la filière
            ArrayList<Enseignant> enseignantsFiliere = new ArrayList<>();
            for (Enseignant enseignant : enseignants) {
                if (enseignant.getFilieres() != null) {
                    for (Filiere filiere : enseignant.getFilieres()) {
                        if (filiere == filiereRecherche) {
                            enseignantsFiliere.add(enseignant);
                        }
                    }
                }
            }

            // Récupère les étudiants correspondants à la filière
            ArrayList<Etudiant> etudiantsFiliere = new ArrayList<>();
            for (Etudiant etudiant : etudiants) {
                if (etudiant.getFiliere() == filiereRecherche) {
                    etudiantsFiliere.add(etudiant);
                }
            }

            // Affiche les informations
            if (!enseignantsFiliere.isEmpty()) {
                StringBuilder strEnseignants = new StringBuilder();
                for (int i = 0; i < enseignantsFiliere.size(); i ++) {
                    strEnseignants.append(i > 0 ? (i < (enseignantsFiliere.size() - 1) ? ", " : " et ") : "").append(enseignantsFiliere.get(i).getNom()).append(" ").append(enseignantsFiliere.get(i).getPrenom());
                }
                System.out.println("\n" + filiereRecherche.getLibelle() + " est animée par " + strEnseignants + " avec " + etudiantsFiliere.toArray().length + " étudiants :");
                for (Etudiant e : etudiantsFiliere) {
                    System.out.println(e.getNom() + " " + e.getPrenom());
                }
            }
            else {
                System.out.println("Aucun formateur n'anime cette filière !");
            }
        }
        else {
            System.out.println("Filière non trouvée !");
        }
    }
}
