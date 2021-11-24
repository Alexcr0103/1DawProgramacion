package capitulo05_arrays.bloque03;

public class Ejercicio01OrdenacionBurbuja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]=new int[150];
		System.out.println("Array normal ");
		for (int i=0;i<array.length;i++) {
			array[i]=(int) Math.round((Math.random()*1000));
			System.out.print(array[i]+ " ");
		}
		System.out.println(" ");

		
		boolean hayIntercambios;
		do {
			hayIntercambios = false;
			
			for (int i=0;i<array.length-1;i++) {			
				if(array[i]>array[i+1]) {
					int aux = array[i];
					array[i]=array[i+1];
					array[i+1]=aux;
					hayIntercambios = true;
				}			
			}
			
		} while (hayIntercambios == true);

		System.out.println("Array ordenado");
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i]+ " ");
		}
	}
}
