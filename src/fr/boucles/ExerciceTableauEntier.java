package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tableau = {1,2,3,4,5,6,7,8,9,10}; // Declaration du tableau
		
		System.out.println(tableau[0]);			// Affichage du 1er élément du tableau
		
		System.out.println(tableau.length);		// Affiche la longueur du tableau
		
		System.out.println(tableau[tableau.length-1]); // Affiche le dernier élément du tableau
		
		tableau[4] = 8; //Modifie la valeur de l'index 4 
	}

}
