package capitulo2_condicionales.bloque01;

import java.util.Scanner;

public class Ejercicio04cincoVariablescualmenor {

	public static void main(String[] args) {
		
		int var1, var2, var3, var4, var5, menor;
		System.out.println("Introduzca 5 dígitos");
		Scanner sc = new Scanner(System.in);
		
		var1 = sc.nextInt();
		
		menor = var1;
		
		
		sc = new Scanner(System.in); 
		var2 = sc.nextInt();
		
		if (var2 < menor) {
			menor = var2;
		
		
		}
		sc = new Scanner(System.in); 
		var3 = sc.nextInt();
		if (var3 < menor) {
			menor = var3;
		}

		sc = new Scanner(System.in); 
		var4 = sc.nextInt();
		if (var4 < menor) {
			menor = var4;
		}
		sc = new Scanner(System.in); 
		var5 = sc.nextInt();
		if (var5 < menor) {
			menor = var5;
		}	
		
		System.out.println("El número menor es " + menor);
		
	
	}

}
