package com.shagui.app.util.paginator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;

/**
 * @author Grego
 *
 * @param <T>
 */
public class PageRender<T> {

	private String url;
	private Page<T> page;

	private int totalPaginas;

	private int numElementosPorPagina;

	private int paginaActual;

	private List<PageItem> paginas;

	/**
	 * @param url
	 * @param page
	 */
	public PageRender(String url, Page<T> page) {
		this.url = url;
		this.page = page;
		this.paginas = new ArrayList<PageItem>();

		numElementosPorPagina = page.getSize();
		totalPaginas = page.getTotalPages();
		paginaActual = page.getNumber() + 1;

		int desde, hasta;
		if (totalPaginas <= numElementosPorPagina) {
			desde = 1;
			hasta = totalPaginas;
		} else {
			if (paginaActual <= numElementosPorPagina / 2) {
				desde = 1;
				hasta = numElementosPorPagina;
			} else if (paginaActual >= totalPaginas - numElementosPorPagina / 2) {
				desde = totalPaginas - numElementosPorPagina + 1;
				hasta = numElementosPorPagina;
			} else {
				desde = paginaActual - numElementosPorPagina / 2;
				hasta = numElementosPorPagina;
			}
		}

		for (int i = 0; i < hasta; i++) {
			paginas.add(new PageItem(desde + i, paginaActual == desde + i));
		}

	}

	/**
	 * @return
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @return
	 */
	public int getTotalPaginas() {
		return totalPaginas;
	}

	/**
	 * @return
	 */
	public int getPaginaActual() {
		return paginaActual;
	}

	/**
	 * @return
	 */
	public List<PageItem> getPaginas() {
		return paginas;
	}

	/**
	 * @return
	 */
	public boolean isFirst() {
		return page.isFirst();
	}

	/**
	 * @return
	 */
	public boolean isLast() {
		return page.isLast();
	}

	/**
	 * @return
	 */
	public boolean isHasNext() {
		return page.hasNext();
	}

	/**
	 * @return
	 */
	public boolean isHasPrevious() {
		return page.hasPrevious();
	}

}
