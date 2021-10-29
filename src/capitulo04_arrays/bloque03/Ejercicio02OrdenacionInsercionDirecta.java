package capitulo04_arrays.bloque03;

public class Ejercicio02OrdenacionInsercionDirecta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]=new int[5];
		
		for (int i=0; i<array.length;i++) {
			array[i]=(int) Math.round((Math.random()*1000));
			System.out.print(array[i]+" ");
		}
		
		for(int i=0;i<array.length-1;i++) {
			if (array[i]>array[i+1]);{
			int aux= array[i+1];
			array[i]=array[i+1];
			array[i+1]=aux;
			}
			
		}
		System.out.println(" ");
		for (int i=0; i<array.length;i++) {
		System.out.print(array[i]+" ");
		}
	}

}
