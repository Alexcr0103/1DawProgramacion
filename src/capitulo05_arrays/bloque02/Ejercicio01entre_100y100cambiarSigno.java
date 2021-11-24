package capitulo05_arrays.bloque02;

public class Ejercicio01entre_100y100cambiarSigno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int limitSup=100, limitInf=-100, multiplicador=-1;
		int array[] =new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i]= (int) Math.round(Math.random() * (limitSup - limitInf)) + limitInf;
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]*multiplicador + " ");
		}
		
	}

}
