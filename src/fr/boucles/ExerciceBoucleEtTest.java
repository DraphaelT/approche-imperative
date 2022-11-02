package fr.boucles;

public class ExerciceBoucleEtTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
		
		for(int loop=1;loop<=array.length;loop++) {	// Affiche l'ensemble du tableau
			System.out.println(array[loop]);
		}
		
		for(int loop=array.length;loop<=0;loop--) {	// Affiche l'ensemble du tableau a l'envers
			System.out.println(array[loop]);
		}
		
		
	}

}
