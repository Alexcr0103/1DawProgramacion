package capitulo03_bucles.bloque04;

import java.util.Scanner;

public class Ejercicio05factorialDadoUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int factorial =1, inicio=1, resultado =0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca el número del cual quiera obtener el factorial ");
		factorial = sc.nextInt();
		
		resultado=factorial;
		while (inicio< factorial) {
			resultado = resultado*inicio;
			inicio++;
		}
		System.out.println("El valor del factorial es " + resultado);
	}

}
