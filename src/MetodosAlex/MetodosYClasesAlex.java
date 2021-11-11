package MetodosAlex;

public class MetodosYClasesAlex {

	public static void inicializarArrayPor10(int array[]) {
		
		//array con números random de 0 a 10
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random()*10);
		}
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
	 * @param array
	 */
	public static void visualizarArray (int array[]) {
		
		//visualiza un array
		for (int i = 0; i< array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	/**
	 * 
	 * @param min
	 * @param max
	 * @return
	 */
	//Obtener números aleatorios dentro de un rango.
	public static int obtenerNumeroAzar (int min, int max) {
		 return (int) Math.round(Math.random() * (max - min)) + min;
	}
	
	
}
