package capitulo04_arrays.bloque07;

import java.util.Scanner;

public class Ejercicio04countOccurr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,2,3,4,5,6,6,7};
		System.out.println("Array original: ");
		imprimirArray(array);
		
		System.out.println("\nIntroduce el valor buscado: ");
		Scanner sc = new Scanner(System.in);
		int valorBuscado = sc.nextInt();
		
		System.out.println("Se ha encontrado " + countOccurrences(array, valorBuscado) + " veces el valor buscado.");

	}
	
	/**
	 * 
	 * 
	 */
	public static int countOccurrences (int array[], int valorBuscado) {
		
		int contador = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == valorBuscado) {
				contador++;
			}
		}		
		return contador;
	}
	
	/**
	 * 
	 */
	public static void imprimirArray(int array2[]) {
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
	}

}
