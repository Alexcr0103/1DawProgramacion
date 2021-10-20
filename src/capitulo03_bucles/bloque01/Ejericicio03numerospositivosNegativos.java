package capitulo03_bucles.bloque01;

import java.util.Scanner;

public class Ejericicio03numerospositivosNegativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numusu, numpositivo=0,numnegativo=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce cuantos números vas a pedir ");
		numusu=sc.nextInt();
				
		for (int i=0; i<numusu; i++) {
			int num;
			System.out.println("Introduce un número ");
			num=sc.nextInt();			
			if (num<0) {
				numnegativo++;
			}
			else if(num>0) {
				numpositivo++;
			}
		}
		System.out.println("Has introducido " + numpositivo + " números positivos y " + numnegativo + " números negativos");
	}

}
