package capitulo05_arrays.bloque07;

import java.util.Scanner;

public class Ejercicio03addInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,2,3,4,5};
		imprimirArray(array);
		
		System.out.println("\nIntroduce el valor que deseas añadir: ");
		Scanner sc = new Scanner(System.in);
		int numAñadido = sc.nextInt();
		
		int array2[] = addInteger(array, numAñadido);		
		System.out.println("Array ampliado: ");
		imprimirArray(array2);
		
	}
	
	/**
	 * 
	 */	
	public static void imprimirArray (int array2[]) {
		for (int i = 0; i < array2.length; i++) {
			System.out.print (array2[i] + " ");
		}
	}
	
	/**
	 * 
	 */
	public static int[] addInteger (int array[], int numAñadido) {
		
		int array2[] = new int [array.length + 1];
		
		for (int i = 0; i < array2.length; i++) {
			if (i == array2.length - 1) {
				array2[i] = numAñadido;
			}
			else {
				array2[i] = array[i];
			}
		}		
		return array2; 
	}

}
