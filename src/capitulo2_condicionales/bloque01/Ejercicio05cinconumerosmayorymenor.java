package capitulo2_condicionales.bloque01;

import java.util.Scanner;

public class Ejercicio05cinconumerosmayorymenor {

	public static void main(String[] args) {
		
		int var1, var2,var3, var4, var5, mayor, menor;
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Introduzca cinco números ");
		
		var1 = sc.nextInt();
		mayor = var1;
		menor = var1;
		
		
		sc = new Scanner(System.in);
		var2 = sc.nextInt();
		
		if (var2 > mayor) {
			mayor = var2; 
		}
		else { 
			if (var2 < menor) {
				menor = var2;
			}
			
		}
		sc = new Scanner(System.in);
		var3 = sc.nextInt();
		
		if (var3 > mayor) {
			mayor = var3; 
		}
		else { 
			if (var3 < menor) {
				menor = var3;
			}
			
		}
		sc = new Scanner(System.in);
		var4 = sc.nextInt();
		
		if (var4 > mayor) {
			mayor = var4; 
		}
		else { 
			if (var4 < menor) {
				menor = var4;
			}
			
		}
		sc = new Scanner(System.in);
		var5 = sc.nextInt();
		
		if (var5 > mayor) {
			mayor = var5; 
		}
		else { 
			if (var5 < menor) {
				menor = var5;
			}
			
		}
		System.out.println("El número mayor es " + mayor + " y el menor es " + menor);
		
	}

}
