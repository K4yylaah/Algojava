/* 
public class Tableau {
 
        //TP 01        
        
        public static void main(String[] args) {
                // Déclaration et initialisation d'un tableau d'entiers de taille 5
                int[] tableau = new int[5];

                // Remplissage du tableau avec des valeurs
                for (int i = 0; i < tableau.length; i++) {
                        tableau[i] = i * 10; // Remplit le tableau avec des multiples de 10
                }

                // Affichage des valeurs du tableau
                System.out.println("Les valeurs du tableau sont :");
                for (int i = 0; i < tableau.length; i++) {
                        System.out.println("tableau[" + i + "] = " + tableau[i]);
                }

        }
}

// #TP 02

public class ScoreUtils {

        // Fonction pour afficher le contenu du tableau des scores
        public static void afficherScores(int[] scores) {
                System.out.println("Contenu du tableau des scores :");
                for (int score : scores) {
                        System.out.print(score + " ");
                }
                System.out.println(); // Pour passer à la ligne suivante
        }

        // Fonction pour renvoyer le plus grand score du tableau
        public static int trouverPlusGrandScore(int[] scores) {
                if (scores.length == 0) {
                        throw new IllegalArgumentException("Le tableau des scores est vide.");
                }

                int plusGrandScore = scores[0];
                for (int score : scores) {
                        if (score > plusGrandScore) {
                                plusGrandScore = score;
                        }
                }
                return plusGrandScore;
        }

        // Fonction pour vérifier si le tableau contient au moins une valeur inférieure à 10
        public static boolean contientValeurInferieureA10(int[] scores) {
                for (int score : scores) {
                        if (score < 10) {
                                return true; // Retourne vrai si une valeur inférieure à 10 est trouvée
                        }
                }
                return false; // Retourne faux si aucune valeur inférieure à 10 n'est trouvée
        }

        // Méthode principale pour tester les fonctions
        public static void main(String[] args) {
                        int[] scores = {12, 15, 8, 20, 5, 18};
           
                        // Afficher les scores
                        afficherScores(scores);
           
                        // Trouver et afficher le plus grand score
                        int plusGrandScore = trouverPlusGrandScore(scores);
                        System.out.println("Le plus grand score est : " + plusGrandScore);
           
                        // Vérifier si le tableau contient une valeur inférieure à 10
                        boolean contientInferieurA10 = contientValeurInferieureA10(scores);
                        System.out.println("Le tableau contient une valeur inférieure à 10 : " + contientInferieurA10);
                }
}
*/

import java.util.Random;

public class Main {
        public static void main(String[] args) {

                // Déclarer tableau de scores
                // On déclare un tableau de int nommé tabScore d'une taille de 7 cases
                int[] tabScore = new int[7];

                // Remplir le tableau de valeurs
                // Assigner la valeur 43 la 1ère case du tableau (indice 0)
                tabScore[0] = 43;
                tabScore[1] = 41;
                tabScore[2] = 17;
                tabScore[3] = 5;
                tabScore[4] = 95;
                tabScore[5] = 94;
                tabScore[6] = 29;

                // Afficher le contenu du tableau
                Random random = new Random(); 
                for (int i = 0; i < tabScore.length; i++) {
                        // On tire un nombre aléatoire dans le tableau jusqu'à 100 inclu 
                        // et on assigne ce nombre a la variable number
                        int number = random.nextInt(101); 

                        tabScore[i] = number; 
                }

                // Parcourir toutes les cases
                // For (depart ; condition d'arret ; increment) {...}
                for (int i = 0; i < tabScore.length; i++) {
                        // Afficher chaque case
                        int score = tabScore[i];
                        System.out.println(score);
                }

                // Calculer et afficher la moyenne
                float moyenne = 0;

                // Parcours de tabScore et ajout de chaque valeur dans somme
                for (int i = 0; i < tabScore.length; i++) {
                        moyenne = moyenne + tabScore[i];
                }

                moyenne = moyenne / tabScore.length;
                
        }
        
}