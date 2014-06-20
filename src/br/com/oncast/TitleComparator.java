package br.com.oncast;

import java.util.Comparator;

/**
 * Classe utilizada como comparador de títulos.
 * @author Cássio
 *
 */
public class TitleComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}

}
