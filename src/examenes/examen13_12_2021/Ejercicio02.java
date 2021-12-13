package examenes.examen13_12_2021;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array [] = new int[] {1,2,3,4,5};
		
		inicializarArray(array);
		System.out.println(" ");
		arrayInvertido(array);
		visualizarArray(array);
		
	}

	public static void inicializarArray(int array[]) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	public static void inicializarArray2(int array2[]) {
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
	}
	/**
	 * 
	 * @param array
	 * @param numAñadido
	 * @return
	 */
	
	public static void arrayInvertido (int array[]) {
		boolean hayIntercambios;
		do {
			hayIntercambios = false;
			
			for (int i=0;i<array.length-1;i++) {			
				if(array[i]<array[i+1]) {
					int aux = array[i];
					array[i]=array[i+1];
					array[i+1]=aux;
					hayIntercambios = true;
				}			
			}
			
		} while (hayIntercambios == true);

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
}
