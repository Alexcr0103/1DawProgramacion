package capitulo04_arrays.bloque03;

public class Ejercicio04OrdenacionSeleccion {

	public static void main(String[] args) {
		
		int array[] = new int[15];
		int menor=0, aux=0, posicionMenor=0;
		
		for (int i = 0; i< array.length; i++) {
			array[i]= (int) Math.round(Math.random()*1000);
		}
		System.out.println("Array normal ");
		for (int i = 0 ; i< array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");
		
		for (int i = 0; i< array.length ; i++) {
			menor = array[i];
				for (int j = i +1; j < array.length; j++) {
					if (array[j]< menor) {
						menor = array[j];
						posicionMenor=j;
					}
				}
				aux = array [i];
				array[i] = array [posicionMenor];
				array[posicionMenor] = aux;
			}
		System.out.println("Array ordenado ");
		for (int i=0; i<array.length;i++) {
			System.out.print(array[i]+ " ");
		}	
	}
}
