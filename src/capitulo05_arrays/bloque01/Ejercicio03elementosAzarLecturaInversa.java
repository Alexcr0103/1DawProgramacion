package capitulo05_arrays.bloque01;



public class Ejercicio03elementosAzarLecturaInversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declaro el array con la longitud que se pide		
		int array []= new int [150];
		System.out.print("Array normal ");
		//recorremos el array con el bucle for	
		for (int i=0; i<array.length;i++){
			//le decimos al array que los numeros que tiene que recorrer seran aleatorios, entre 0 y 100
			array[i]= (int) Math.round(Math.random()*100);
			System.out.print(array[i] + " ");
		}
		System.out.print ("\n" + "Array inverso ");
		for (int i=array.length-1;i>=0;i--) {
			System.out.print(array[i] + " ");
		}
	
	}

}
