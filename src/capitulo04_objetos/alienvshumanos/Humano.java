package capitulo04_objetos.alienvshumanos;

public class Humano extends Personaje {

	
	public Humano () {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Humano " + this.hashCode() + " - Vida: " + vida + " - Potencia: " + potencia + 
				" - Precisión: " + precision; 
	}
}
