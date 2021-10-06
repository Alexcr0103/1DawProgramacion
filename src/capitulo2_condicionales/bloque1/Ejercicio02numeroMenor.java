package capitulo2_condicionales.bloque1;


import javax.swing.JOptionPane;

public class Ejercicio02numeroMenor {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("Introduzca un número");
		int var1 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduzca otro número");
		int var2 = Integer.parseInt(str);
		
		
		
		
		System.out.println("El número mayor es" + var1);

		if (var1 < var2) {

			System.out.println("El número " + var1 + " es menor que " + var2 + ".");

		} else {

			System.out.println("El número " + var2 + " es menor que " + var1 + ".");
		

		}

	}
}
