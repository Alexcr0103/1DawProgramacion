package capitulo03_bucles.bloque03;

import java.util.Scanner;

public class Ejercicio02medianosuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numusu, suma=0, cont=0;
		Scanner sc= new Scanner(System.in);
		
		do {
			System.out.println("Introduce un número");
			numusu=sc.nextInt();
			suma += numusu;
			cont+=1;
			
		}while (numusu!=0);
		System.out.println("La media de todos los números introducidos es " + suma/cont);
		
	}

}
