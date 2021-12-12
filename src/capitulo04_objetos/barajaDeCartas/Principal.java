package capitulo04_objetos.barajaDeCartas;

public class Principal {

	public static void main(String[] args) {
		
		Baraja baraja = new Baraja();
		
		baraja.pasarCartaDeAbajoHaciaArriba();
		baraja.pasarCartaDeArribaHaciaAbajo();
		baraja.mezclar();
		baraja.ordenar();
		baraja.mostar();

		Jugador j = new Jugador();
		j.setNombre("Pepe");
		baraja.repartirMano(j);
		System.out.println("La mano del jugador");
		j.mostrarMano();
	}

}
