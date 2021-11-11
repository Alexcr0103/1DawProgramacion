package MetodosAlex;

public class MetodosYClasesAlex {

	public static void inicializarArrayPor10(int array[]) {
		
		//array con números random de 0 a 10
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random()*10);
		}
	}
	
	public static void inicializarArrayPor100(int array[]) {
		
		//array con números random de 0 a 10
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random()*100);
		}
	}
	
	public static void visualizarArray (int array[]) {
		
		//visualiza un array
		for (int i = 0; i< array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	
}
