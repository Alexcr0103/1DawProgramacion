package capitulo02_condicionales.bloque03;

import java.util.Scanner;

public class Ejercicio02calculadora {

	public static void main(String[] args) {
		int opcion, raiz, potencia, resto; 
		System.out.println("1- Raiz");
		System.out.println("2- Potencia");
		System.out.println("3- Resto de una división");
		
		Scanner sc = new Scanner(System.in);
		opcion = sc.nextInt();
						
		
		
		
		switch (opcion) {
		case 1: 
			int radicando, indice;
			
			raiz = sc.nextInt();
			radicando = sc.nextInt();
			indice = sc.nextInt();
			System.out.println("Dame un radicando " + radicando + " y un indice " + indice);
			
			System.out.println("La raiz cuadrada de " + raiz + " es" + (Math.pow(radicando, (float) indice)));
			break;
				
				
		}
		
			
		

	}

}
