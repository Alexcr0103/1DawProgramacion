package capitulo03_bucles.bloque02;

import java.util.Scanner;

public class Ejercicio03multiploslimite100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca un número ");
		num1= sc.nextInt();
		
		for(int i=0; i<100; i+=num1) {	
			System.out.println("Múltiplo del número introducido " + i);
		}		
	}

}
