package Capitulo1;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduce un número entero");
		int var1 = Integer.parseInt(str);
		System.out.println("El número entero es: " + var1);
		
		str = JOptionPane.showInputDialog("Introduce un número flotante");
		float var2 = Float.parseFloat(str);
		System.out.println("El número flotante es " + var2);
		
		str = JOptionPane.showInputDialog("Introduce un número doble");
		double var3 = Double.parseDouble(str);
		System.out.println("El número doble es " + var3);
		
		
		
	
	}

}
