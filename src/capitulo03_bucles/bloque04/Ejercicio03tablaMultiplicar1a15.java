package capitulo03_bucles.bloque04;

public class Ejercicio03tablaMultiplicar1a15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int inicio=1, factor=0;
		
		do {
			System.out.println(" La tabla del " + inicio);
			
			do {
				factor ++;
				System.out.println(inicio + " x " + factor + "=" + (inicio*factor));
			}while (factor<10);
			inicio ++;
			factor=0;
		}while (inicio<16);
		
	}

}
