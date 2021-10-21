package capitulo03_bucles.bloque03;

import java.util.Scanner;

public class Ejercicio04usuarioPideNumeroImprimirMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numusu, menor=0 , i=1;
		Scanner sc= new Scanner (System.in);
		System.out.println("Introduce un número ");
		numusu=sc.nextInt();
		
		do {
				if (i==1) {
					menor=numusu;
				}
				if (numusu<menor) {
					menor=numusu;
				}
				
				
			
			System.out.println("Introduce un número");
			numusu=sc.nextInt();
			i=0;
			
		}while (numusu != 0);
		
		
		System.out.println("El numero menor de los dígitos introducidos es " + menor);
	}

}
