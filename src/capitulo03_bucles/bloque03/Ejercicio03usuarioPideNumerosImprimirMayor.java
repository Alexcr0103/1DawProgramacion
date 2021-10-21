package capitulo03_bucles.bloque03;

import java.util.Scanner;

public class Ejercicio03usuarioPideNumerosImprimirMayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numusu=0, mayor=0;
		Scanner sc= new Scanner (System.in);
		
		do {
			System.out.println("Introduce un número ");
			numusu=sc.nextInt();
			if (numusu>mayor)
				mayor=numusu;
		}while (numusu != 0);
		
		System.out.println("El numero mayor de los dígitos introducidos es " + mayor);
		
		
	}

}
