package capitulo2_condicionales.bloque01;

import java.util.Scanner;

public class Ejercicio03cincoVariablescualmayor {

	public static void main(String[] args) {
		
		int var1, var2, var3, var4, var5, mayor;
		System.out.println("Introduzca 5 dígitos");
		Scanner sc = new Scanner(System.in);
		
		var1 = sc.nextInt();
		
		mayor = var1;
		
		
		sc = new Scanner(System.in); 
		var2 = sc.nextInt();
		
		if (var2 > mayor) {
			mayor = var2;
		
		
		}
		sc = new Scanner(System.in); 
		var3 = sc.nextInt();
		if (var3 > mayor) {
			mayor = var3;
		}

		sc = new Scanner(System.in); 
		var4 = sc.nextInt();
		if (var4 > mayor) {
			mayor = var4;
		}
		sc = new Scanner(System.in); 
		var5 = sc.nextInt();
		if (var5 > mayor) {
			mayor = var5;
		}	
		
		System.out.println("El número mayor es " + mayor);
		
	
	}

}
