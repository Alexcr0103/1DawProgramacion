package capitulo03_bucles.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio06tablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor: "));
		for (; num != 0;) {
			for (int j = 0; j < 11; j++) {
				System.out.println(num + " * " + j + " = " + (num * j));
			}
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor: "));
			System.out.println();
		
		}

	}	
}
