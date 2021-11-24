package capitulo05_arrays.bloque07;

import java.util.Scanner;

public class Ejercicio02findAndReplace {

		public static void main(String[] args) {
			int array[] = {1,2,3,4,5};
			System.out.println("Array Original: ");
			imprimirArray(array);
			
			System.out.println("\nIntroduce el valor buscado: ");
			Scanner sc = new Scanner(System.in);
			int numeroBuscado = sc.nextInt();
			
			System.out.println("\nIntroduce el valor sustituto: ");
			sc = new Scanner(System.in);
			int numeroRemplazo = sc.nextInt();
			
			System.out.println("\nReemplazado: ");
			imprimirArray(findAndReplace(array, numeroBuscado, numeroRemplazo));
			
			
			
		}
		
		/**
		 * 
		 * 
		 */
		public static void imprimirArray (int array[]) {
			for (int i = 0; i < array.length; i++) {
				System.out.print (array[i] + " ");
			}
		}
		
		/**
		 * 
		 * 
		 * @return 
		 */
		public static int[] findAndReplace (int array[], int numeroBuscado, int numeroRemplazo) {
			
			for (int i = 0; i < array.length; i++) {
				if (numeroBuscado == array[i]) {
					array[i] = numeroRemplazo;
				}
			}
			 return array;
	}

}
