package objet;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
* <h1>avecTab!</h1>
* lcette classe permet de gérer le cas ou l'utilisateur
* choisit d'utiliser un tableau
* 
* @author  Daniel NGANJIP
* @version 1.0
* @since   22023-10-12
*/

public class avecTab {

    List<Integer> donnees;

    public avecTab(){

        donnees = new ArrayList<>();
        
    }
    
     /**
   * cette méthode va remplir le tableau
   * avec les valeurs aléatoires entre 0 et 100
   * 
   * @param donnees il prends la liste crée et la remplit
   * * @return Nothing.
   */
    public void remplirTableau(List<Integer> donnees) {
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            donnees.add(random.nextInt(101)); // Valeurs aléatoires de 0 à 100
        }
    }

     /**
   * cette méthode va afficher les valeurs 
   * des cellules du tableau
   * 
   * @param donnees il prends la liste déja remplie et l'affiche
   * * @return Nothing.
   */
    public void afficherTableau(List<Integer> donnees) {
        System.out.println("Contenu du tableau :");
        for (int i = 0; i < donnees.size(); i++) {
            System.out.println("Index " + i + ": " + donnees.get(i));
        }
    }

      /**
   * cette méthode va comparer les differentes valeurs 
   * des cellules du tableau et renvoyer le plus grand et
   * son index
   * @param donnees il prends la liste remplit et compare les données des cellules
   * * @return Nothing.
   */
    public void Maximum(List<Integer> donnees) {
        int maximum = donnees.get(0);
        int indexMaximum = 0;

        for (int i = 1; i < donnees.size(); i++) {
            int valeurActuelle = donnees.get(i);
            if (valeurActuelle > maximum) {
                maximum = valeurActuelle;
                indexMaximum = i;
            }
        }

        System.out.println("La plus grande valeur est : " + maximum);
        System.out.println("Elle se trouve à l'index : " + indexMaximum);
    }
}

