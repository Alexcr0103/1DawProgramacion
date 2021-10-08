package capitulo01_numenteros.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog( "Introducir un número doble");
		double var1 = Double.parseDouble(str);
		
		str = JOptionPane.showInputDialog( "Introducir un número doble");
		double var2 = Double.parseDouble(str);
		
		System.out.println("Primer número introducido  " + var1  + ", Segundo número introducido " + var2 );
		
		double auxiliar = var1;
		var1 = var2;
		var2 = auxiliar;
		
		System.out.println("Primer número introducido (cambiado)  " + var1  + ", Segundo número introducido (cambiado) " + var2 );
		

	}	

}
