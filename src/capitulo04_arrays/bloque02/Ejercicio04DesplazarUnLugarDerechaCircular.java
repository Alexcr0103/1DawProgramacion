package capitulo04_arrays.bloque02;

import java.util.Scanner;

public class Ejercicio04DesplazarUnLugarDerechaCircular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int [5];
		System.out.println("Array normal ");
		
		for(int i=0; i<array.length;i++) {
			array[i]=(int) Math.round((Math.random()*100));
			System.out.print(array[i] + " ");
		}
		
		System.out.println(" ");
		System.out.print("Array movido ");
		
		int aux=array[array.length-1];
		for (int i=array.length-1; i>0;i--) {				
		array[i]=array[i-1];				
		}
		array[0]=aux;
		System.out.println(" ");
		for (int i=0;i<array.length;i++) {
		System.out.print(array[i] + " ");
		}		
	}
}
