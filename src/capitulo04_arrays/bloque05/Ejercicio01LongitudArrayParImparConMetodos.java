package capitulo04_arrays.bloque05;

public class Ejercicio01LongitudArrayParImparConMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int longitudArray = (int) (Math.random()*100);
		int array[]= new int [longitudArray];
		inicializarArray(array);
		examinarLogitudArray(array);
		visualizarArray(array);
		System.out.println("\nLongitud del array: " + array.length);
		System.out.println("Valor de la posición media: " + examinarLogitudArray(array));
	}


	private static void inicializarArray(int[] array) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < array.length ; i ++) {
			array[i]= (int) Math.round(Math.random()*100);
		}
	}

	public static int examinarLogitudArray(int[] array) {
		// TODO Auto-generated method stub
		if (array.length % 2 == 0) {
			return -1;
		}
		else {
			return array[(array.length -1) / 2];
		}
	}
	private static void visualizarArray(int[] array) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length ; i++) {
			System.out.print(array[i] + " ");
		}

	}
	
	

}
