package capitulo04_arrays.bloque05;

import MetodosAlex.MetodosYClasesAlex;

public class Ejercicio04Matriz5x5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][] = new int [5][5];
		int matriz2[][] = new int [][] {	{1,		2,		3,		4,		 5},
											{0, 	7,		8,		8,		10},
											{0,		0,		13,		14,		15},
											{0,		0,		2,		19,		20},
											{0,		0,		0,		0,		25}};
											
		esPositiva(matriz2);
		esDiagonal(matriz2);
		esTrianguloSuperior(matriz2);
		for (int i = 0; i < matriz.length; i ++) {
			for (int j = 0; j < matriz.length; j++ ) {
			}
		}
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
}
