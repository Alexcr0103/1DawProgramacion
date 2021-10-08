package capitulo02_condicionales.bloque03;

import java.util.Scanner;

public class Ejercicio01notanumerica {

	public static void main(String[] args) {
		
		int nota;
		System.out.println("Nota del alumno ");
		Scanner sc = new Scanner(System.in);
		nota = sc.nextInt();
		
		
		switch (nota) {
			case 0:
			case 1: 
			case 2:
				System.out.println("Muy deficiente");
				break;
			case 3:
			case 4:
				System.out.println("Deficiente");
				break;
			case 5:
				System.out.println("Suficiente");
				break;
			case 6:
				System.out.println("Bien");
				break;
			case 7:
			case 8:
				System.out.println("Notable");
				break;
			case 9:
			case 10:
				System.out.println("Sobresaliente");
				break;
		
			

		}

	}
}
