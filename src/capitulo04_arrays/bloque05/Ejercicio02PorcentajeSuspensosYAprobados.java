package capitulo04_arrays.bloque05;

import MetodosAlex.MetodosYClasesAlex;

public class Ejercicio02PorcentajeSuspensosYAprobados {

	public static void main(String[] args) {
		//Declaramos el array
		int array[] = new int[20];
		//Llamamos a los metodos que vamos a utilizar, uno para inicializar el array y otro en el que calculamos los porcentajes
		//de aprobados y suspensos
		MetodosYClasesAlex.inicializarArrayPor10(array);
		calcularPorcentajes(array);
	}
	//En este metodo calculamos mediante el recorrido de un array
	//los aprobados y suspensos, luego los visualizamos multiplicando por 100 entre la longitud del array para sacar el porcentaje.
	//Por último mediante un contador sacamos la cantidad de aprobados y suspensos que hay.
	public static void calcularPorcentajes (int array[]) {
		
		int aprobados = 0, suspensos = 0;
		for (int i = 0; i <array.length; i++) {
			
			if(array [i]>5) {
				aprobados++;
			}
			else {
				suspensos++;
			}
		}
		System.out.println("El número de suspensos es " + suspensos);
		System.out.println("El número de aprobados es " + aprobados);
		System.out.println("El porcentaje de suspensos es " + (suspensos*100)/array.length + "%");
		System.out.println("El porcentaje de aprobados es " + (aprobados*100)/array.length + "%");
	}

}
