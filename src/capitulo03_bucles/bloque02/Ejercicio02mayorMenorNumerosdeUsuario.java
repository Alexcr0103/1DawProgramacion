package capitulo03_bucles.bloque02;

import java.util.Scanner;

public class Ejercicio02mayorMenorNumerosdeUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numusu=0, mayor=0, menor=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca cuantos números quiere usar ");
		numusu=sc.nextInt();
		
		for (int i=0; i<numusu; i++) {
			int num;
			System.out.println("Introduzca un número");
			num= sc.nextInt();			
			if (i ==0) {
				mayor=num;
				menor=num;	
			}
			else {
				if (num>mayor) {
					mayor=num;
				if (num<menor)
					menor=num;	
				}								
			}
		}
		System.out.println("El número mayor introducido es " + mayor + " y el menor es " + menor);
		
	}

}
