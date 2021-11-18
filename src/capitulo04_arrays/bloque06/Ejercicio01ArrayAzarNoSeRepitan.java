package capitulo04_arrays.bloque06;


public class Ejercicio01ArrayAzarNoSeRepitan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int array [] = new int[] {1,2,2,3,4,5,6};
		int array [] = new int[7];
		comprobarArray(array);
		
		for (int i = 0 ; i<array.length; i++) {
			System.out.println(array[i] + " ");
		}
		//MetodosYClasesAlex.visualizarArray(array);
	}
	public static void comprobarArray (int array[]) {
		boolean existe = true;
		for (int i = 0; i<array.length; i++) {
				do {
					array[i]= (int) Math.round(Math.random() * (7 - 0)) + 0;
					existe = false;
					for (int j =  i-1 ; j > -1 ; j--) {	
						if (array[j]==array[i]) {
							existe = true;
						}
					}
				}while (existe = true);					
		}
	}
}
