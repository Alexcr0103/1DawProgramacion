package capitulo05_arrays.bloque05;

public class Ejercicio03ParteDecimalParteEnteraLuegoJuntar {

	public static void main(String[] args) {
		
		//Declaramos los dos array que vamos a usar, un tipo float para el array en el que necesitamos decimales y un tipo int
		//para el array de números enteros.
		float[] array = new float[20];
		int [] array2 = new int [20];
		
		//Llamamos a los métodos encargados de inicializar los dos arrays anteriores, luego mediante recorrer otro array unimos estos dos,
		//visualizándolo por último
		inicializarArrayEnteros(array2);
		System.out.println(" ");
		inicializarArrayDecimales(array);
		System.out.println(" ");
		for (int i = 0 ; i <array.length ; i++) {
			System.out.println("Numero junto " + (array2[i] + array[i])+  " ");
		}	
	}
	/**
	 * 
	 * @param array
	 */
	//En este primer método recorremos el array para sacar 20 números enteros entre 0 y 100 y los visualizamos.
	
	public static void inicializarArrayEnteros(int array2[]) {
		
		for (int i = 0 ; i <array2.length ; i++) {
			array2 [i] = (int) Math.round((Math.random()*100));
			System.out.println("Numero entero " + array2[i] + " ");
		}
	}
	/**
	 * 
	 * @param array
	 */
	//En el segundo método recorremos el array para sacar 20 números decimales entre 0 y 1 y los visualizamos. A parte queremos saber también 
	//los números decimales que hay comprendidos de 0.00 a 0.49.
	public static void inicializarArrayDecimales(float array[]) {
		int contador =0;
		for (int i = 0 ; i <array.length ; i++) {
			array [i] = (float) Math.random();
			System.out.println("Numero decimal " + array[i] + " ");
			if (array[i]<0.50) {
				contador++;
			}
		}
		System.out.println("\nHay " + contador + " números decimales por debajo de 0.50");
	}
}
