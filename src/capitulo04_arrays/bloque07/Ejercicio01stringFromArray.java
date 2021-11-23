package capitulo04_arrays.bloque07;

public class Ejercicio01stringFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {65,76,69,74,65,78,68,82,79};
		
		System.out.println("String: " + stringFromArray(array));
				
	}

	public static String stringFromArray (int array[]) {		
		String str = "";
		
		for (int i = 0; i < array.length; i++) {
			str = str + ((char)array[i]);
		}	
		return str;
	
	}

}
