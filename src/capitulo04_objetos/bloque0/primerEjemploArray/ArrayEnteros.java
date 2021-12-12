package capitulo04_objetos.bloque0.primerEjemploArray;

import java.util.Arrays;

public class ArrayEnteros {
	private NumeroEntero array[] = new NumeroEntero[100];


	/**
	 * @param array
	 */
	public ArrayEnteros() {
		for (int i = 0; i < array.length; i++) {
			array[i] = new NumeroEntero();
		}
	}
	
	public void visualizarArray(NumeroEntero array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}
}
