package capitulo02_condicionales.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio01numeroMayor {

	public static void main(String[] args) {

		String str = JOptionPane.showInputDialog("Introduzca un número");
		int var1 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduzca otro número");
		int var2 = Integer.parseInt(str);

		if (var1 > var2) {

			System.out.println("El número " + var1 + " es mayor que " + var2 + ".");

		} else {

			System.out.println("El número " + var2 + " es mayor que " + var1 + ".");

		}

	}
}
