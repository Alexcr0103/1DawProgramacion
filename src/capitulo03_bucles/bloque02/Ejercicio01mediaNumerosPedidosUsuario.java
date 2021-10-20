package capitulo03_bucles.bloque02;

import java.util.Scanner;

public class Ejercicio01mediaNumerosPedidosUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float suma=0;
		int numusu;
		Scanner sc= new Scanner(System.in);
		System.out.println("¿Cuántos números quiere introducir? ");
		numusu=sc.nextInt();
		
		for(int i = 0; i<numusu; i++ ) {
			System.out.println("Introduzca un número ");
			int num=sc.nextInt();
			suma= suma + num;
			
		}
		System.out.println("La media de los números introducidos es " + suma/numusu);
	}

}
