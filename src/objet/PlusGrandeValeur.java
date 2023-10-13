import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PlusGrandeValeur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez le type de données à utiliser :");
        System.out.println("1. Tableau (ArrayList)");
        System.out.println("2. Liste chaînée (LinkedList)");
        System.out.print("Votre choix : ");
        int choix = scanner.nextInt();

        List<Integer> donnees;

        if (choix == 1) {
            donnees = new ArrayList<>();
        } else if (choix == 2) {
            donnees = new LinkedList<>();
        } else {
            System.out.println("Choix invalide. Le programme se termine.");
            scanner.close();
            return;
        }

        remplirTableauOuListe(donnees);
        afficherTableauOuListe(donnees);
        trouverPlusGrandeValeur(donnees);

        scanner.close();
    }

    // Remplir le tableau ou la liste avec des valeurs aléatoires
    public static void remplirTableauOuListe(List<Integer> donnees) {
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            donnees.add(random.nextInt(101)); // Valeurs aléatoires de 0 à 100
        }
    }

    // Afficher le tableau ou la liste
    public static void afficherTableauOuListe(List<Integer> donnees) {
        System.out.println("Contenu du tableau ou de la liste :");
        for (int i = 0; i < donnees.size(); i++) {
            System.out.println("Index " + i + ": " + donnees.get(i));
        }
    }

    // Trouver la plus grande valeur et son index
    public static void trouverPlusGrandeValeur(List<Integer> donnees) {
        int plusGrandeValeur = donnees.get(0);
        int indexPlusGrandeValeur = 0;

        for (int i = 1; i < donnees.size(); i++) {
            int valeurActuelle = donnees.get(i);
            if (valeurActuelle > plusGrandeValeur) {
                plusGrandeValeur = valeurActuelle;
                indexPlusGrandeValeur = i;
            }
        }

        System.out.println("La plus grande valeur est : " + plusGrandeValeur);
        System.out.println("Elle se trouve à l'index : " + indexPlusGrandeValeur);
    }
}