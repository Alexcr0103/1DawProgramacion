package capitulo2_condicionales.bloque2;

import java.util.Scanner;

public class Ejercicio01numerosnegativosmediosmayores {

	public static void main(String[] args) {
		
		int num, sumanegativos = 0, sumabajos = 0, sumamedios = 0, sumagrandes = 0;
		System.out.println("Introduzca un número ");
		
		Scanner sc = new Scanner (System.in); 
		num = sc.nextInt();
		
		
		if (num < 0) {
			sumanegativos = num;
			
		}
		else {
			  if (num <= 25) {
				sumabajos = num;
		
			   }
			  else {
				  if (num <= 250) {
						sumamedios = num;
						
				   }
				  
			   else {
					if (num > 250) {

					sumagrandes = num;										
					}
				}			 
			}		
		}
		
		System.out.println("Introduzca un número ");
		
		sc = new Scanner (System.in); 
		num = sc.nextInt();
		if (num < 0) {
			sumanegativos = num + sumanegativos;
			
		}
		else {
			  if (num <= 25) {
				sumabajos = num + sumabajos;
		
			   }
			  else {
				  if (num <= 250) {
						sumamedios = num + sumamedios;
						
				   }
				  
			   else {
					if (num > 250) {

					sumagrandes = num + sumagrandes;										
					}
				}			 
			}		
		}
		System.out.println("Introduzca un número ");
		
		sc = new Scanner (System.in); 
		num = sc.nextInt();
		if (num < 0) {
			sumanegativos = num + sumanegativos;
			
		}
		else {
			  if (num <= 25) {
				sumabajos = num + sumabajos;
		
			   }
			  else {
				  if (num <= 250) {
						sumamedios = num + sumamedios;
						
				   }
				  
			   else {
					if (num > 250) {

					sumagrandes = num + sumagrandes;										
					}
				}			 
			}		
		}
		System.out.println("Introduzca un número ");
		
		sc = new Scanner (System.in); 
		num = sc.nextInt();
		if (num < 0) {
			sumanegativos += num;
			
		}
		else {
			  if (num <= 25) {
				sumabajos = num + sumabajos;
		
			   }
			  else {
				  if (num <= 250) {
						sumamedios = num + sumamedios;
						
				   }
				  
			   else {
					if (num > 250) {

					sumagrandes = num + sumagrandes;										
					}
				}			 
			}		
		}
		System.out.println("Introduzca un número ");
		
		sc = new Scanner (System.in); 
		num = sc.nextInt();
		if (num < 0) {
			sumanegativos = num + sumanegativos;
			
		}
		else {
			  if (num <= 25) {
				sumabajos = num + sumabajos;
		
			   }
			  else {
				  if (num <= 250) {
						sumamedios = num + sumamedios;
						
				   }
				  
			   else {
					if (num > 250) {

					sumagrandes = num + sumagrandes;										
					}
				}			 
			}		
		}
		System.out.println("La suma de los números negativos es " + sumanegativos);
		System.out.println("La suma de los números bajos es " + sumabajos);
		System.out.println("La suma de los números medios es " + sumamedios);
		System.out.println("La suma de los números grandes " +  sumagrandes);
		
	}
}
