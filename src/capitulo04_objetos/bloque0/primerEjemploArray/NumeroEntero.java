package capitulo04_objetos.bloque0.primerEjemploArray;

public class NumeroEntero {
	private int valor;
	
	/**
	 * 
	 */
	public NumeroEntero() {
		this.valor= (int) Math.round(Math.random()*100);
	}

	/**
	 * @param valor
	 */
	public NumeroEntero(int valor) {
		this.valor = valor;
	}
	

	@Override
	public String toString() {
		return "NumeroEntero [valor=" + valor + "]";
	}

	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
}

