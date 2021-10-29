package capitulo04_arrays.bloque02;

import java.util.Scanner;

public class Ejercicio06UsuarioDeterminaDirección {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]=new int [5];
		int numMovi, derecha=0,izquierda=1, numUsu;
		Scanner sc=new Scanner(System.in);
		System.out.println("Array normal ");
		
		for(int i=0; i<array.length;i++) {
			array[i]=(int) Math.round((Math.random()*100));
			System.out.print(array[i] + " ");
		}
		
		System.out.println(" ");
		System.out.println("Introduzca el número de movimientos que quiere ");
		numMovi=sc.nextInt();
		System.out.println("Introduce a que dirección quieres que se muevan "
				+ "los números " + "\nDerecha- " + 0 + "\nIzquierda- "
				+ 1);
		numUsu=sc.nextInt();
		System.out.print("Array movido ");
		
		if (numUsu==0) {
			for (int i=0; i<numMovi;i++) {
				int aux=array[array.length-1];
				for (int j=array.length-1; j>0;j--) {				
				array[j]=array[j-1];				
				}
				array[0]=aux;
				System.out.println(" ");
				for (int j=0;j<array.length;j++) {
					System.out.print(array[j] + " ");
				}
			}
		}
		if(numUsu==1) {
			for (int i=0; i<numMovi;i++) {
				int aux=array[0];
				for (int j=0; j<array.length-1;j++) {				
				array[j]=array[j+1];				
				}
				array[array.length-1]=aux;
				System.out.println(" ");
				for (int j=0;j<array.length;j++) {
					System.out.print(array[j] + " ");
				}
			}
		}
	}
}
