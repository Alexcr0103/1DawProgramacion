package capitulo04_arrays.bloque02;

public class Ejercicio02tercerArrayImparPrimerArrayParSegundoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stuf
		int par1, impar1;
		int array[]= new int[10],array2[]= new int[10],array3[]= new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i]= (int) Math.round((Math.random()*100));
			System.out.print(array[i] + " ");
			if(array[i]/2==0) {
				par1=array[i];
			}
		}
		System.out.println(" ");
		for (int j=0; j<array.length; j++) {
			array[j]= (int) Math.round((Math.random()*100));
			System.out.print(array[j]+ " ");
		}
		
	}

}
