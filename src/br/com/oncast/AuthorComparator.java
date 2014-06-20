package br.com.oncast;

import java.util.Comparator;

/**
 * Classe utilizada como comparador de autores.
 * @author Cássio
 *
 */
public class AuthorComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getAuthorName().compareTo(o2.getAuthorName());
	}

}
