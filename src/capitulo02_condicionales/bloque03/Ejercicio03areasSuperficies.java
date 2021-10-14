package capitulo02_condicionales.bloque03;

import java.util.Scanner;

public class Ejercicio03areasSuperficies {
	
		public static void main(String[] args) {
			System.out.println("1-Cálculo de la hipotenusa de un triángulo");
			System.out.println("2-Cálculo de la superficie de una circunferencia");
			System.out.println("3-Cálculo del perímetro de una circunferencia");
			System.out.println("4-Cálculo del área de un rectángulo");
			System.out.println("5-Cálculo del área de un triángulo");
			System.out.println("0-Salir de la aplicación");
			
			int opcion;
		
			
			Scanner sc = new Scanner(System.in);
			opcion = sc.nextInt();
			
			if (opcion <= 6) {

				switch (opcion) {
					case 1: 
						double num1, num2, num3, cate1, cate2;
															
						System.out.println("Introduzca las longitudes de los catetos del triángulo");
						num1 = sc.nextDouble();
						num2 = sc.nextDouble();
						cate1 = Math.pow(num1, 2);
						cate2 = Math.pow(num2, 2);				
						num3 = cate1 + cate2;													
						System.out.println("La hipotenusa del tríangulo es " + Math.pow(num3, 2 ));
						break;
					
					case 2:
						double num4, radio, area1, numpi;
						System.out.println("Introduzca el radio de la circunferencia");
						num4 = sc.nextDouble();
						radio = Math.pow(num4, 2);
						numpi = Math.PI;	
						area1 = (numpi * radio);
						System.out.println("El área de la circunferencia es " + area1);
						break;
					case 3:
						double num5, radio2, perimetro;
						System.out.println("Introduzca el radio de la circunferencia");
						num5 = sc.nextDouble();					
						numpi = Math.PI;
						radio2 = num5;
						perimetro = numpi * (radio2 * 2);
						System.out.println("El perímetro de la circunferencia es " + perimetro);
						break;
					case 4:
						double base, altura, area2;
						System.out.println("Introduzca la longitud de la base");
						base = sc.nextDouble();	
						System.out.println("Introduzca la longitud de la altura");
						altura = sc.nextDouble();	
						
						area2 = base * altura;
						System.out.println("El área del rectángulo es " + area2);
						break;
					case 5:
						double base2, altura2, area3;
						System.out.println("Introduzca la longitud de la base");
						base2 = sc.nextDouble();	
						System.out.println("Introduzca la longitud de la altura");
						altura2 = sc.nextDouble();	
						
						area3 = (base2 * altura2) / 2;
						System.out.println("El área del triángulo es " + area3);
						break;
					case 6:
					default:
						System.out.println("Opción incorrecta");
						if (opcion >= 6) {
							System.out.println("1-Cálculo de la hipotenusa de un triángulo");
							System.out.println("2-Cálculo de la superficie de una circunferencia");
							System.out.println("3-Cálculo del perímetro de una circunferencia");
							System.out.println("4-Cálculo del área de un rectángulo");
							System.out.println("5-Cálculo del área de un triángulo");
							System.out.println("0-Salir de la aplicación");
						}
					case 0:
						System.out.println("Has salido de la aplicación");
						System.exit(opcion);						
				}
			}
						
		}
}