package capitulo05_arrays.bloque01;

public class Ejercicio05sumaParesEimpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]= new int [150];
		int sumaPar=0, sumaImpar=0;
		
		for (int i=0; i<array.length;i++) {
			array[i]= (int) Math.round(Math.random()*100);
			
			if (array [i] %2 ==0) {
				sumaPar +=array[i];
			}
			if (array [i]%2 !=0) {
				sumaImpar += array[i];
			}
		}
		System.out.println("La suma de los números pares: " +sumaPar+ 
				"\nLa suma de los números impares: " + sumaImpar);
	}
}
