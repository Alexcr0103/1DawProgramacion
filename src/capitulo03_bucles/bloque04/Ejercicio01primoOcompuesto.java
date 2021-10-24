package capitulo03_bucles.bloque04;

import java.util.Scanner;

public class Ejercicio01primoOcompuesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numusu;
		int auxiliar=2;
		
		System.out.println("Introduzca un número ");
		Scanner sc= new Scanner(System.in);	
		numusu=sc.nextInt();
		boolean primo= true;
		while (auxiliar<numusu/2) {
			if (numusu%auxiliar ==0) {
				primo=false;
			break;
			}
			auxiliar++;
		
		}
		if (primo ==true) {
			System.out.println("El número " + numusu + " es primo");
		}
		if (primo==false) {
			System.out.println("El número " + numusu + " es compuesto");
		}
	}
}

