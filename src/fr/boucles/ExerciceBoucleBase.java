package fr.boucles;

/**
 * @author Thomas
 *
 */

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int a=1;a<=10;a++) {
			System.out.println(a);  // Affichez tous les nombres de 1 à 10
		}
		int b=1 ;
		while(b<=20) {				// Affichez 20 fois votre nom et votre préno
			System.out.print("Thomas");
			System.out.println("Bonte");
			b++;
		}
		for(int c=2;c<=100;c=c+2) {
			System.out.println(c);  // Affichez les éléments pairs 
		}
		for(int c=1;c<=100;c=c+2) {
			System.out.println(c);  // Affichez les éléments impair 
		}
		
		
	}

}
