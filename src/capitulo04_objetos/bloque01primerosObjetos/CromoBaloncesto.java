package capitulo04_objetos.bloque01primerosObjetos;

public class CromoBaloncesto {
	private String nombreJugador;
	private int altura;
	private int pesoKg;
	private float puntos;
	
	//Constructor por defecto
	public CromoBaloncesto(){
		System.out.println("Estas creando un cromo de baloncesto");
	}
	
	public String toString() {
		return "CromoBaloncesto [nombreJugador= " + nombreJugador + " , altura= " + altura + " , pesoKg= " + pesoKg
				+ " , puntos= " + puntos + "]";
	}

	
	/**
	 * @param nombreJugador
	 * @param altura
	 * @param pesoKg
	 * @param puntos
	 */
	public CromoBaloncesto(String nombreJugador, int altura, int pesoKg, float puntos) {
		super();
		this.nombreJugador = nombreJugador;
		this.altura = altura;
		this.pesoKg = pesoKg;
		this.puntos = puntos;
	}

	/**
	 * @return the nombreJugador
	 */
	public String getNombreJugador() {
		return nombreJugador;
	}

	/**
	 * @param nombreJugador the nombreJugador to set
	 */
	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	/**
	 * @return the pesoKg
	 */
	public int getPesoKg() {
		return pesoKg;
	}

	/**
	 * @param pesoKg the pesoKg to set
	 */
	public void setPesoKg(int pesoKg) {
		this.pesoKg = pesoKg;
	}

	/**
	 * @return the puntos
	 */
	public float getPuntos() {
		return puntos;
	}

	/**
	 * @param puntos the puntos to set
	 */
	public void setPuntos(float puntos) {
		this.puntos = puntos;
	}

	
}
