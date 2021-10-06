package capitulo2_condicionales.bloque1;


import java.util.Scanner;

public class Ejercicio06numoerpareimpar {

	public static void main(String[] args) {
		
		int num;
		System.out.println("Introduzca un número:");
		Scanner sc = new Scanner(System.in);
		sc = new Scanner(System.in);
		
		
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("El número introducido " + num + " par"); 
		}
		else {
				System.out.println("El número introducido " + num + " impar");
			
		}
		

	}

}
