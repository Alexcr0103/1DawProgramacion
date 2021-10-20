package capitulo03_bucles.bloque01;

import java.util.Scanner;

public class Ejercicio02Usuariopide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int suma=0, num,numusu;
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce los numeros que vas a pedir ");
		numusu = sc.nextInt();
		
		for (int i=0; i<numusu; i++) {
			System.out.println("Introduzca un número");
			num=sc.nextInt();
			 if (num>10) {
				 suma +=num;
			 }
		}
		System.out.println("La suma vale " + suma);
		
	}

}
