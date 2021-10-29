package capitulo04_arrays.bloque02;

import java.util.Scanner;

public class Ejercicio03MultiplicarArrayPorNumeroUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]=new int[150];
		int multiplicador;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el número con el que quieras "
				+ "multiplicar el array ");
		multiplicador=sc.nextInt();
		System.out.println(" El array multiplicado es ");
		for(int i=0;i<array.length;i++) {
			array[i]=(int) Math.round((Math.random()*100));
			System.out.print(array[i]*multiplicador + " ");
		}
	}

}
