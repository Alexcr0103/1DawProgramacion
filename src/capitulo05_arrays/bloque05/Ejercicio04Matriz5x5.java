package capitulo05_arrays.bloque05;

import MetodosAlex.MetodosYClasesAlex;

public class Ejercicio04Matriz5x5 {

	public static void main(String[] args) {
		
		//int matriz[][] = new int [5][5];
		int matriz2[][] = new int [][] {	{1,		1,		5},
											{1, 	2,		3},
											{5,		3,		4}};
		
		//MetodosYClasesAlex.inicializarUnaMatrizAleatoria(matriz);
		esPositiva(matriz2);
		esDiagonal(matriz2);
		esTrianguloSuperior(matriz2);
		esDispersa(matriz2);
		System.out.println(" ");
		System.out.println("La matriz unidimensional ");
		matrizUnidimensional(matriz2);
		System.out.println(" ");
		esMatrizSimetrica(matriz2);
		opuesta(matriz2);
		System.out.println(" ");
		System.out.println("Matriz opuesta" );
		MetodosYClasesAlex.visualizarUnaMatriz(matriz2);
}
	/**
	 * 
	 * @param matriz
	 * @return
	 */
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
		return esPositiva;
	}	
	/**
	 * 
	 * @param matriz
	 * @return
	 */
	public static boolean esDiagonal (int matriz[][]) {
		boolean esDiagonal = true;
		
		for (int i = 0; i < matriz.length; i ++) {
			for (int j = 0; j < matriz.length; j++ ) {
				if (matriz[i][j] !=0 && i!=j) {
					esDiagonal = false;
				}
			}
		}
		System.out.println("La matriz diagonal es " + esDiagonal);
		return esDiagonal;
	}
	/**
	 * 
	 * @param matriz
	 * @return
	 */
	public static boolean esTrianguloSuperior (int matriz [][]) {
		boolean esTrianguloSuperior=true;
		for (int i = 0; i < matriz.length; i ++) {
			for (int j = 0; j < i; j++ ) {
				if (matriz[i][j] !=0) {
					esTrianguloSuperior=false;
				}
			}
		}
		System.out.println("¿La matriz es triángulo superior? " + esTrianguloSuperior);
		return esTrianguloSuperior;
		
	}
	/**
	 * 
	 * @param matriz
	 * @return
	 */
	public static boolean esDispersa(int matriz[][]) {
		boolean dispersa = true;
		int count = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] == 0) {
					count++;
				}
			}
			if (count >= 1) {
				count = 0;
			} else {
				dispersa = false;
			}
		}
		
		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[j][i] == 0) {
					count ++;
				}
			}
			
			if (count >= 1) {
				count = 0;
			} else {
				dispersa = false;
			}
			
		}
		System.out.println("La matriz es dispersa: " + dispersa);
		return dispersa;
	}
	/**
	 * 
	 * @param matriz
	 * @return
	 */
	public static int[] matrizUnidimensional(int matriz[][]) {
		int numValores = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				numValores++;
			}
		}
		
		int array[] = new int[numValores];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				array[i] = matriz[i][j];
				System.out.print(array[i] + " ");
			}
		}
		System.out.println(" ");
		return array;
	}
	/**
	 * 
	 * @param matriz
	 * @return
	 */
	public static int[][] opuesta(int matriz2[][]){
		
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				matriz2[i][j] = (matriz2[i][j] * -1);
			}
		}		
		return matriz2;
	}
	/**
	 * 
	 * @param matriz
	 * @return
	 */
	public static boolean esMatrizSimetrica (int matriz[][]){
		boolean esSimetrica = true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i != j && matriz [i][j] != matriz [j][i]) {
					esSimetrica = false;
				}
			}
		}
		System.out.println("¿La matriz es simétrica? " + esSimetrica);
		return esSimetrica;
	}
}
