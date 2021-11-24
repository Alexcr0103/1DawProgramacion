package capitulo05_arrays.bloque01;

import java.util.Scanner;

public class Ejercicio04buscarValorPosicionNoEncontrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		Scanner sc= new Scanner (System.in);
		int array[]=new int [150];
		boolean numEsta=false;
		System.out.println("Introduzca un valor el cual se buscará en el array ");
		num1=sc.nextInt();
		
		for(int i=0; i<array.length; i++) {
		array[i]= (int) Math.round((Math.random())*100);
			if (array[i] ==num1) {
			System.out.println("\nEl número " + num1 + " ha sido encontrado en la posición " +(i+1)+ " del array");
			numEsta=true;
			
			}
		}
		if (numEsta==false) {
			
			System.out.println("El número no se encuentra en la array");
		}
	}

}
