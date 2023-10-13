package objet;
import java.util.Scanner;

/**
* <h1>PlusGrandeValeur!</h1>
* le programme c'est une application qui permet de
* créer une suite de 15 nombres aléatoires
* compris entre 0 et 100
* et renvoie la chaine, et puis le plus grand nombre
* et son index dans la chaine
* 
* @author  Daniel NGANJIP
* @version 1.0
* @since   22023-10-12
*/

public class PlusGrandeValeur {

    /**
   * Cette méthode propose de choisir entre les tableaux 
   *et les listes chainées pour stocker les fichiers
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez le type de données à utiliser :");
        System.out.println("1. Tableau ");
        System.out.println("2. Liste chaînée ");
        System.out.print("Votre choix : ");

        int choix = scanner.nextInt();

        if (choix == 1) {
            avecTab Tab = new avecTab();
            
            Tab.remplirTableau(Tab.donnees);
            Tab.afficherTableau(Tab.donnees);
            Tab.Maximum(Tab.donnees);

        } else if (choix == 2) {
            avecList List = new avecList();
            List.remplirListe(List.donnees);
            List.afficherListe(List.donnees);
            List.Maximum(List.donnees);
        } else {
            System.out.println("Choix invalide. Le programme se termine.");
            scanner.close();
            return;
        }

        

        scanner.close();
    }

   
}
