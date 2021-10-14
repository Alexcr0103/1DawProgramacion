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
					area1 = Math.pow(numpi, Math.pow(num4, 2));
					System.out.println("El área de la circunferencia es " + area1);
			}

		}
}