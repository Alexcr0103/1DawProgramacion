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
	/**
	 * 
	 * @param array
	 */
	public static void inicializarArrayAleatorioIntervalo(int array[]) {	
		//array azar con intervalos
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (100 - 100)) + 100;
		}
	}
	/**
	 * 
	 * @param matriz
	 */
	//Obtenerr números aleatorios dentro de un rango en una matriz.(Los 100 se puede cambiar por los intervalos necesarios)
	public static void inicializarUnaMatrizAleatoriaIntervalo (int matriz [][]) {
		for (int i= 0 ; i<matriz.length; i++) {
			for (int j = 0; j<matriz.length ; j ++) {
				matriz [i][j] = (int) Math.round((Math.random()* (100-(-100)))+-100);
			}
		}
	}
	/**
	 * 
	 * @param matriz
	 */
	//Obtener números aleatorios en una matriz.
	public static void inicializarUnaMatrizAleatoria (int matriz [][]) {
		for (int i = 0 ; i<matriz.length; i++) {
			for (int j = 0; j<matriz.length ; j ++) {
				matriz [i][j] = (int) Math.round((Math.random()*100));
			}
		}
	}
	/**
	 * 
	 * @param matriz
	 */
	//Se visualiza una matriz.
	public static void visualizarUnaMatriz (int matriz [][]) {
		for (int i = 0 ; i<matriz.length; i++) {
			for (int j = 0; j<matriz.length ; j ++) {
				System.out.print(matriz [i][j] + "\t");
			}
			System.out.println();
		}
	}
	
}
