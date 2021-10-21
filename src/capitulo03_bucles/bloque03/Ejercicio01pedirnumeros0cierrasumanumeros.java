package capitulo03_bucles.bloque03;

import java.util.Scanner;

public class Ejercicio01pedirnumeros0cierrasumanumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numusu, suma=0;
		Scanner sc= new Scanner(System.in);
		
		do {
			System.out.println("Introduce un número");
			numusu=sc.nextInt();
			suma += numusu;
		}while (numusu!=0);
		System.out.println("La suma de todos los números introducidos es " + suma);
	}

}
