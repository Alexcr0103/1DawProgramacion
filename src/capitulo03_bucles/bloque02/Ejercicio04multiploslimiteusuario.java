package capitulo03_bucles.bloque02;

import java.util.Scanner;

public class Ejercicio04multiploslimiteusuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,numusu;
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca un número ");
		num1= sc.nextInt();
		System.out.println("Limite al que calcular los múltiplos ");
		numusu=sc.nextInt();
		
		for(int i=0; i<numusu; i+=num1) {	
			System.out.println("Múltiplo del número introducido " + i);
		}		
		
	}

}
