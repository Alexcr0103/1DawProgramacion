package capitulo03_bucles.bloque04;

import java.util.Scanner;

public class Ejercicio02numerosPrimosyCompuestosConLimites {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int inferior,superior;
		int auxi=2;
		boolean primo=true;
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca el límite inferior");
		inferior = sc.nextInt();
		System.out.println("Introduzca el límite superior");
		superior=sc.nextInt();
		
		while (inferior<=superior) {
			while (auxi<=inferior/2 &&(primo==true)) {
				if (inferior%auxi==0) {
					primo  = false;
				}
				auxi ++;
			}
			if (primo ==true) {
				System.out.println("El número " + inferior + " es primo");
			}
			if (primo ==false) {
				System.out.println("El número " + inferior + " es compuesto");
			}
			inferior ++;
			auxi =2;
			primo=true;
		}
		
		
		
		
		
	}

}
