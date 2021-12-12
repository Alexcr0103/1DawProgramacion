package examenes.examen26_11_21;

public class EjercicioC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[10];

	
		inicializarArrayAleatorioIntervalo(array);
		System.out.println("La media del array es " + comprobacionMedia(array));		
		comprobacionPorcentaje(array);
		visualizarArray(array);
	}
	/**
	 * 
	 * @param array
	 */
	public static void inicializarArrayAleatorioIntervalo(int array[]) {	
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (100 - (-100))) -100;
			
		}
	}
	/**
	 * 
	 * @param array
	 * @return
	 */
	public static float comprobacionMedia (int array[]) {	
		int suma = 0;
		float media=0;
		for (int i = 0; i < array.length; i++) {
			suma+= array[i];
			media= (float) suma/array.length;
		}
		return media;
	}
	/**
	 * 
	 * @param array
	 */
	public static void comprobacionPorcentaje (int array[]) {	
		float media=comprobacionMedia(array);;
		int contador=0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]<media) {
				contador++;
			}
		}
		System.out.println("El porcentaje de aprobados es " + (float)(contador*100)/array.length + "%");
	}
	/**
	 * 
	 * @param array
	 */
	public static void visualizarArray (int array[]) {
		
		//visualiza un array
		for (int i = 0; i< array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
