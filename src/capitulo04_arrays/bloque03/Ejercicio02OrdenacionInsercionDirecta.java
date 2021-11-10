package capitulo04_arrays.bloque03;

public class Ejercicio02OrdenacionInsercionDirecta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int posicionMenor;
		int array[]=new int[15];
		
		System.out.println("Array normal");
		for (int i=0; i<array.length;i++) {
			array[i]=(int) Math.round((Math.random()*1000));
			System.out.print(array[i]+" ");
		}
		System.out.println("\nArray invertido ");
		for (int i = 0; i < array.length -1; i++) {
			posicionMenor=i;
			for (int j = i+1; j < array.length; j++) {
				if (array[j]<array[posicionMenor])
					posicionMenor=j;			
			}
			int aux = array[i];
			array[i]= array[posicionMenor];
			array[posicionMenor]= aux;
		}
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
