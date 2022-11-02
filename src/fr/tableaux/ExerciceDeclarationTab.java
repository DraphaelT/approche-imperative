package fr.tableaux;

public class ExerciceDeclarationTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] tableau1 = {8, -7, 12, 1, -2, 14, 17, 9};
		
		System.out.println(tableau1[0]);    	// Affichez l’élément du tableau d’index 0 du tableau
		System.out.println(tableau1.length);	// Affichez la longueur du tableau
		System.out.println(tableau1[tableau1.length-1]);		// Affichez l’entier positionné au dernier index du tablea
		System.out.println(tableau1[10]);		/* Affichez l’entier d’index 10. 
												 * Cela echoue car il n'y a que 8 case dans ce tableau
												 */
	}

}
