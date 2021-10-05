package Capitulo1.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		
	String str = JOptionPane.showInputDialog("Introduce un número entero");
		
		int var1 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce un número flotante");
		float var2 = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Introduce un número doble");
		double var3 = Double.parseDouble(str);
		
		double suma = (var1 + var2 + var3);
		
		
		double media = suma / 3;
		
		System.out.print("Resultado de la media de la suma: " + media);
		
		
		

	}

}
