package capitulo2_condicionales.bloque2;

import java.util.Scanner;

public class Ejercicio02numerosnegativosmediosmayoressinnegativos {
	


	public static void main(String[] args) {
		
		int var1, var2, var3, var4, var5, contadorbajos = 0, contadormedios = 0, contadorgrandes = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número ");
		var1 = sc.nextInt();
		
		
		
		
		
		if (var1 < 0) {
			System.out.println("Syntax Error");
		}
		else {
			if (var1 <= 25) {
				contadorbajos++;
			}				
			else {
				if (var1 <= 250) {
				contadormedios++;					
				}
				else {
					contadorgrandes++;
				}
				
			}
			
			sc = new Scanner(System.in);
			System.out.println("Introduzca un número ");
			var2 = sc.nextInt();
			
			if (var2 < 0) {
				System.out.println("Syntax Error");
			}
			else {
				if (var2 <= 25) {
					contadorbajos++;
				}				
				else {
					if (var2 <= 250) {
					contadormedios++;					
					}
					else {
						contadorgrandes++;
					}
					
				}
				
				sc = new Scanner(System.in);
				System.out.println("Introduzca un número ");
				var3 = sc.nextInt();
				
				if (var3 < 0) {
					System.out.println("Syntax Error");
				}
				else {
					if (var3 <= 25) {
						contadorbajos++;
					}				
					else {
						if (var3 <= 250) {
						contadormedios++;					
						}
						else {
							contadorgrandes++;
						}
						
					}
					
					sc = new Scanner(System.in);
					System.out.println("Introduzca un número ");
					var4 = sc.nextInt();
					
					if (var4 < 0) {
						System.out.println("Syntax Error");
					}
					else {
						if (var4 <= 25) {
							contadorbajos++;
						}				
						else {
							if (var4 <= 250) {
							contadormedios++;					
							}
							else {
								contadorgrandes++;
							}
							
						}
						
						sc = new Scanner(System.in);
						System.out.println("Introduzca un número ");
						var5 = sc.nextInt();
						
						if (var5 < 0) {
							System.out.println("Syntax Error");
						}
						else {
							if (var5 <= 25) {
								contadorbajos++;
							}				
							else {
								if (var5 <= 250) {
								contadormedios++;					
								}
								else {
									contadorgrandes++;
								}
								
							}
							System.out.println("En la categoría bajos han entrado " + contadorbajos);
							System.out.println("En la categoría bajos han entrado " + contadormedios);
							System.out.println("En la categoría bajos han entrado " + contadorgrandes);
					}	
					}
							
				}	
			}
			
		
			
			
		
		
		
			
				
		}

		
	}
}