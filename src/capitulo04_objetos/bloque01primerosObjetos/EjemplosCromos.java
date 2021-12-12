package capitulo04_objetos.bloque01primerosObjetos;

public class EjemplosCromos {

	public static void main(String[] args) {
	CromoBaloncesto cromo1 = new CromoBaloncesto("Paul Gasol ", 200, 90, 98f );
	CromoBaloncesto cromo2 = new CromoBaloncesto("LeBron ", 210, 110, 120f );
	CromoBaloncesto cromo3 = new CromoBaloncesto("Marc Gasol ", 187, 95, 78f );
	CromoBaloncesto cromo4 = new CromoBaloncesto("Curry ", 180, 85, 120f );
	CromoBaloncesto cromo5 = new CromoBaloncesto("Koby Briant ", 192, 93, 100f );
	
	CromoBaloncesto cromo6 = new CromoBaloncesto();
	cromo6.setNombreJugador("Paul Gasol");
	cromo6.setAltura(219);
	cromo6.setPesoKg(89);
	cromo6.setPuntos(98);
	
	System.out.println(cromo1.toString());
	System.out.println(cromo2.toString());
	System.out.println(cromo3.toString());
	System.out.println(cromo4.toString());
	System.out.println(cromo5.toString());
	System.out.println(cromo6.toString());
	
		//Crear un array de cromos
		CromoBaloncesto cromos[] = new CromoBaloncesto[10];
		//Vamos a inicializar el objeto
		for (int i =0; i<cromos.length; i++) {
			cromos[i] = new CromoBaloncesto();
		}
		cromos[0].setNombreJugador("Michel Jordan");
		System.out.println(cromos[0].toString());
	}

}
