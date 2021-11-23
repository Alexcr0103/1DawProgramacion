package capitulo04_arrays.bloque07;

import java.util.Scanner;

public class Ejercicio05removeInteg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,2,3,4,5};	
		
		System.out.println("Array Original: ");
		imprimirArray(array);
		
		System.out.println("\n¿Que valor deseas eliminar?");
		Scanner sc = new Scanner(System.in);
		int valorBuscado = sc.nextInt();
		
		int array2[] = removeInteger(array, valorBuscado);
		imprimirArray(array2);

	}
	
	/**
	 * 
	 */	
	public static int[] removeInteger (int array[], int valorBuscado) {
		
		int k = 0;
		int array2[] = new int [array.length - 1];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] != valorBuscado) {
				array2[k] = array[i];
				k++;
			}
		}
		
		return array2;	
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
