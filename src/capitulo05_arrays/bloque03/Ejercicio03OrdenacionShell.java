package capitulo05_arrays.bloque03;

public class Ejercicio03OrdenacionShell {

	public static void main(String[] args) {
		int array[] = new int[150];
		int saltos;
		int aux;
		boolean cambios;
		
		for (int i = 0; i< array.length; i++) {
			array[i]= (int) Math.round(Math.random()*1000);
		}
		System.out.println("Array normal ");
		for (int i = 0 ; i< array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");
		
		for (saltos = array.length / 2; saltos !=0; saltos /=2) {
			cambios = true;
			while (cambios) {
				cambios = false;
				for (int i = saltos; i < array.length; i++) {
					if (array[i - saltos]> array[i]) {
						aux = array[i];
						array[i] = array [i - saltos];
						array [i - saltos] = aux;
						cambios = true;
					}
				}
			}
		}
		System.out.println("Array ordenado ");
		for (int i=0; i<array.length;i++) {
			System.out.print(array[i]+ " ");
		}
	}

}
