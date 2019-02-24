package com.shagui.app.util.paginator;

/**
 * @author Grego
 *
 */
public class PageItem {

	private int numero;
	private boolean actual;

	/**
	 * @param numero
	 * @param actual
	 */
	public PageItem(int numero, boolean actual) {
		this.numero = numero;
		this.actual = actual;
	}

	/**
	 * @return
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @return
	 */
	public boolean isActual() {
		return actual;
	}

}
