package examenes.examen26_11_21;

import java.util.Scanner;

public class EjercicioD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[10];	
		int numAñadido=(int) Math.round(Math.random() *100);
		inicializarArrayPor100(array);
		
		System.out.println("Array Original: ");
		imprimirArray(array);
		
		System.out.println("\n¿Que posicion deseas eliminar?");
		Scanner sc = new Scanner(System.in);
		int valorBuscado = sc.nextInt();
		
		int array2[] = busquedaEliminacion(array, valorBuscado);
		moverNumeros(array2);
		System.out.println("¿Que valor quieres añadir?");
		numAñadido = sc.nextInt();
		
		añadirNumero(array2, numAñadido);
		imprimirArray(array2);

	}
	/**
	 * 
	 * @param array
	 */
	public static void inicializarArrayPor100(int array[]) {
		
		//array con números random de 0 a 100
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random()*100);
		}
	}
	
	/**
	 * 
	 */	
	public static int[] busquedaEliminacion (int array[], int valorBuscado) {
		
		int k = 0;
		int array2[] = new int [array.length - 1];
		
		for (int i = 0; i < array.length; i++) {
			if (i != valorBuscado) {
				array2[k] = array[i];
				k++;
			}
		}
		
		return array2;	
	}
	/**
	 * 
	 * @param array2
	 */
	public static void moverNumeros(int array2[]) {
		int aux=array2[0];
		for (int i=0; i<array2.length -1;i++) {				
			array2[i]=array2[i+1];				
		}
		array2[array2.length-1]=aux;
		System.out.println(" ");
	}
	/**
	 * 
	 * @param array2
	 */
	public static int[] añadirNumero (int array2[], int numAñadido) {
		int array3[] = new int [array2.length + 1];
		
		for (int i = 0; i < array3.length; i++) {
			if (i == array3.length - 1) {
				array3[i] = numAñadido;
			}
			else {
				array3[i] = array2[i];
			}
		}		
		return array3; 
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
