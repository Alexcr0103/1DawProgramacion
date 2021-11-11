package capitulo04_arrays.bloque05;

import MetodosAlex.MetodosYClasesAlex;

public class Ejercicio04Matriz5x5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][] = new int [5][5];
		boolean esPositiva = true;
		
		MetodosYClasesAlex.inicializarUnaMatrizAleatoriaIntervalo(matriz);
		esPositiva(matriz);
	}
	
	public static boolean esPositiva (int matriz[][]) {
		boolean esPositiva = true;
		
		for (int i = 0; i < matriz.length ; i ++) {
			for ( int j = 0; j < matriz.length ; j ++) {
				if ( matriz [i][j]<=0) {
					esPositiva = false;
				}
			}
		}
		if (esPositiva) {
		System.out.println("La matriz es positiva ");
		}else {
			System.out.println("La matriz no es positiva ");
		}
		System.out.println(" ");
		MetodosYClasesAlex.visualizarUnaMatriz(matriz);
		return esPositiva;
	}

}
