package examenes.examen13_12_2021;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][] = new int[4][4];
		
		inicializarUnaMatrizAleatoria(matriz);
		visualizarUnaMatriz(matriz);
		ordenarMatrizPorFilas(matriz);
		System.out.println(" ");
		visualizarUnaMatriz(matriz);
	}


	public static void inicializarUnaMatrizAleatoria (int matriz [][]) {
		for (int i = 0 ; i<matriz.length; i++) {
			for (int j = 0; j<matriz.length ; j ++) {
				matriz [i][j] = (int) Math.round((Math.random()*100));
			}
		}
	}
	
	public static void ordenarMatrizPorFilas (int matriz [][]) {
		boolean hayIntercambios;
		do {
			hayIntercambios = false;
			
			for (int i=0;i<matriz.length;i++) {
				for (int j = 0; j < matriz.length-1; j++) {
					if(matriz[i][j]>matriz[i][j+1]) {
						int aux = matriz[i][j];
						matriz[i][j]=matriz[i][j+1];
						matriz[i][j+1]=aux;
						hayIntercambios = true;
					}
				}			
			}
			
		} while (hayIntercambios == true);
	}
	
	public static void visualizarUnaMatriz (int matriz [][]) {
		for (int i = 0 ; i<matriz.length; i++) {
			for (int j = 0; j<matriz.length ; j ++) {
				System.out.print(matriz [i][j] + "\t");
			}
			System.out.println();
		}
	}
}
