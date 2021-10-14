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
			System.out.println("Dame una raiz, un radicando " + " y un indice ");	
			raiz = sc.nextInt();								
			radicando = sc.nextInt();
			indice = sc.nextInt();
			
			
			
			System.out.println("La raiz cuadrada de " + raiz + " es " + (Math.pow(radicando, (float) indice)));
			break;
		case 2: 
			int num1, num2;
			
			System.out.println("Dame dos números ");		
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			
			
			System.out.println("La multiplicacion es " +(num1 * num2));
			break;
		case 3: 
			float num3, num4;
			
			System.out.println("Dame dos números ");		
			num3 = sc.nextFloat();
			num4 = sc.nextInt();
			
			
			
			System.out.println("El resto es " + (num3 / num4));
			break;
				
				
		}
		
			
		

	}

}
