package capitulo05_arrays.bloque02;

public class Ejercicio02tercerArrayImparPrimerArrayParSegundoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[150];
		int array2[]=new int [150];
		int array3[]=new int [150];
		
		for(int i=0; i<array.length; i++) {
			array[i]=(int) Math.round((Math.random()*100));
			System.out.print(array[i]+ " ");
		}		
		System.out.println(" ");
		for (int i=0; i<array.length;i++) {
			array2[i]= (int) Math.round((Math.random()*100));
			System.out.print(array2[i] + " ");
		}
		System.out.println(" ");
		for(int i=0; i<array.length;i++) {
			if(i % 2 == 0) {
				array3[i]=array2[i];
			}
			else {
				array3[i]=array[i];
			}
		}
		for (int i=0; i<array.length;i++) {
			System.out.print(array3[i]+" ");
		}
	}

}
