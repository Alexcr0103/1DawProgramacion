package capitulo05_arrays.bloque02;

import java.util.Scanner;

public class Ejercicio05UsuarioIndicaCantidadDesplazar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]=new int [5];
		int numMovi;
		Scanner sc=new Scanner(System.in);
		System.out.println("Array normal ");
		
		for(int i=0; i<array.length;i++) {
			array[i]=(int) Math.round((Math.random()*100));
			System.out.print(array[i] + " ");
		}
		
		System.out.println(" ");
		System.out.println("Introduzca el número de movimientos que quiere ");
		numMovi=sc.nextInt();
		System.out.print("Array movido ");
		
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
}
