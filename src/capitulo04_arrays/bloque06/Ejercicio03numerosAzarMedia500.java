package capitulo04_arrays.bloque06;

public class Ejercicio03numerosAzarMedia500 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numAzar, suma = 0, contador = 0;
		float media;
		
		
		do {
			numAzar = (int) Math.round(Math.random() * 1000);
			suma += numAzar;
			contador++;
			media = suma / (float) contador;
		} while (media < 499.5 || media > 500.5);

		System.out.println("He necesitado " + contador + " números para tener una media " +
				" de " + media);
	}

}
