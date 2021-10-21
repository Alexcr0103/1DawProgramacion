package capitulo03_bucles.bloque03;

import java.util.Scanner;

public class Ejercicio05usuarioPideNumeroImprimirMayorYmenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numusu, menor=0, mayor=0 , i=1;
		Scanner sc= new Scanner (System.in);
		System.out.println("Introduce un número ");
		numusu=sc.nextInt();
		
		do {
				if (i==1) {
					menor=numusu;
					mayor=numusu;
				}
				if (numusu<menor) {
					menor=numusu;
				}
				else if(numusu>mayor) {
					mayor=numusu;
				}
				
				
			
			System.out.println("Introduce un número");
			numusu=sc.nextInt();
			i=0;
			
		}while (numusu != 0);
		
		
		System.out.println("El numero mayor de los dígitos introducidos es " + mayor + " y el menor es " + menor);
		
	}

}
