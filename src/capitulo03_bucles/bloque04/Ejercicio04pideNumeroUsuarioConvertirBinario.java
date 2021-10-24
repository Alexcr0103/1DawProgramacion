package capitulo03_bucles.bloque04;

import java.util.Scanner;

public class Ejercicio04pideNumeroUsuarioConvertirBinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=128, num;
		Scanner sc= new Scanner(System.in);
		System.out.println(" Introduce un número; ");
		num= sc.nextInt();
		
		while (i>=1) {
			if ((num & i)==0) {
				System.out.print("0");
			}
			else {
				System.out.print("1");
			}
			i =i>>1;
		}
	}

}
