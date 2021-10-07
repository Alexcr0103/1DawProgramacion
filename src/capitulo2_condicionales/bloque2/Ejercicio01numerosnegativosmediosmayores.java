package capitulo2_condicionales.bloque2;

import java.util.Scanner;

public class Ejercicio01numerosnegativosmediosmayores {

	public static void main(String[] args) {
		
		int num, sumanegativos, sumabajos, sumamedios, sumagrandes;
		System.out.println("Introduzca un número ");
		
		Scanner sc = new Scanner (System.in); 
		num = sc.nextInt();
		
		
		if (num < 0) {
			sumanegativos = num;
			sc = new Scanner (System.in); 
			num = sc.nextInt();
			System.out.println(sumanegativos);
			
			
		
		}
		else {
			  if (num < 25) {
				sumabajos = num;
				sc = new Scanner (System.in); 
				num = sc.nextInt();
				

			  }
			  else {
				  if (num < 250) {
						sumamedios = num;
						sc = new Scanner (System.in); 
						num = sc.nextInt();
						

						
						
					}
				  
			   else {
					if (num > 250) {

						num = sc.nextInt();
						sc = new Scanner (System.in); 

						sumagrandes = num;
						
					
					
					}
				}
			 
			}
		
		
	}

}
