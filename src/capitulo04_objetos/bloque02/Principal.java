package capitulo04_objetos.bloque02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		Persona arrayPersona[] = new Persona [3];
		
		inicializarPersona(arrayPersona);
		
		do {
			System.out.println("Introduzca una opción");
			System.out.println("0-Salir");
			System.out.println("1-Introducir datos de persona");
			System.out.println("2-Ver datos de las personas introducidas");
			
			Scanner sc= new Scanner (System.in);
			num1 =sc.nextInt();
			
			switch (num1) {
			case 1: introducirDatos(arrayPersona);
			break;
			
			case 2: 
				for (int i = 0; i < arrayPersona.length; i++) {
					System.out.println(arrayPersona[i].toString());
				}
				break;
			}
		}while (num1 != 0);
		
		System.out.println("El programa ha terminado");
	}
	
	public static void inicializarPersona(Persona arrayPersona[]) {
		
		for (int i = 0; i < arrayPersona.length; i++) {
			arrayPersona[i] = new Persona();
		}
	}
	public static void introducirDatos (Persona arrayPersona[]) {
		String nombre, dni, apellidos, direccion, telefono;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un nombre, dni, apellidos, direccion y telefono (En este orden)");
		nombre=sc.next();
		dni=sc.next();
		apellidos=sc.next();
		direccion=sc.next();
		telefono=sc.next();
		
			for (int i = 0; i < arrayPersona.length; i++) {
				if (arrayPersona[i].getNombre()== null) {
					arrayPersona[i].setNombre(nombre);
					arrayPersona[i].setDNI(dni);
					arrayPersona[i].setApellidos(apellidos);
					arrayPersona[i].setDireccion(direccion);
					arrayPersona[i].setTelefono(telefono);
					break;
				}
			}
	}
}
