package capitulo05_arrays.bloque01;

public class Ejercicio06sumaIndicePar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]= new int[150];
		int indicePar=0;
		
		for (int i=0; i<array.length;i++) {
			array[i]= (int) Math.round(Math.random()*100);
			if(i%2 ==0) {
				indicePar +=array[i];
			}
		}
		System.out.println("La suma de los índices pares: " + indicePar);
	}

}
