package capitulo04_arrays.bloque01;

import java.util.Scanner;

public class Ejercicio02arrayConLimiteSuperiorInferior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int limitsup, limitinf;
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce el límite superior ");
		limitsup=sc.nextInt();
		System.out.println("Introduce el límite inferior ");				
		limitinf=sc.nextInt();
		int array []= new int [150];
				
			
		for (int i=0; i<array.length;i++){
			array[i]= (int) Math.round(Math.random() * (limitsup - limitinf)) + limitinf;
			System.out.print(array[i] + " ");
		}

	}

}
