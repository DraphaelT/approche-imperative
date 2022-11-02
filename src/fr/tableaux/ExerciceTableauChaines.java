package fr.tableaux;

public class ExerciceTableauChaines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] villes = {"Paris","Nante","Montpellier","Bordeaux","Libourne" };
		for(int a=0;villes.length-1>=a;a++) {
			System.out.println(villes[a]);
		}
		System.out.println(villes.length);
		villes[3] = "Reims"; 				//Modifiez l’élément d’index 3 avec "Reims"
		for(int a=0;villes.length-1>=a;a++) {
			System.out.println(villes[a]);
		}
		
	}

}
