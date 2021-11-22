package capitulo04_arrays.bloque06;

public class Ejercicio02ondasAleatoriasAsteriscos {

	public static void main(String[] args) {
		char matriz[][]= new char[10][30];
		int asteriscosCadaLinea;

		for(int i = 0; i<matriz.length; i++) {
			for (int j = 0; j<matriz[i].length; j++) {
				matriz[i][j] = ' ' ;
			}		
		}
		for (int i = 0; i < matriz.length; i++) {
			// Determina la cantidad de asteriscos a introducir en cada línea
			asteriscosCadaLinea = (int) Math.round(Math.random() * 30);
			
			// Llenar tantos asteriscos desde la izquierda como indique la variable
			for (int j = 0; j < asteriscosCadaLinea; j++) {
				matriz[i][j] = '*';
			}
			
		}

		// Imprimo en consola
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
		
	}

}
