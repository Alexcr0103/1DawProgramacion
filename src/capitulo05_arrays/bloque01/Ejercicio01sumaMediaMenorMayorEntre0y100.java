package capitulo05_arrays.bloque01;

public class Ejercicio01sumaMediaMenorMayorEntre0y100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declaramos todas las variables.
		int suma=0, mayor=0, menor=0;
		float  media=0;
		int array []= new int [150];
		// para obtener el mayor y menor en primer lugar queremos que coja
		// el primer valor del array.
		mayor=array[0];
		menor=array[0];
		System.out.println("Array");
		
		// mediante el bucle for recorremos el array, donde a este le decimos
		// que recorra una secuencia de números del 1 al 100.
	
		for (int i=0; i<array.length;i++){
			array[i]= (int) Math.round((Math.random()*100));
			System.out.println("Los digitos son " + array[i] + " ");
			// para calcular la suma, cogemos el valor de cada indice que recorre
			// el array y se sumen entre ellos.
			suma+= array[i];
			// para la media, cogemos la suma y la dividimos entre la
			// longitud del array
			media= (float) suma/array.length;
		
		// el mayor y el menor los obtenemos mediante una condición donde si
		// se cumplen cogeran el valor del caracter mayor o menor.
			if (array[i]<menor) {
			menor=array[i];
			}
			if (array[i]>mayor) {
			mayor=array[i];
			}		
		}
		//Imprimimos el resultado para que se muestre en pantalla
		System.out.println("La suma del array es " + suma);
		System.out.println("El mayor del array es " + mayor);
		System.out.println("El menor del array es " + menor);
		System.out.println("La media del array es " + media);
	}

}
