package br.com.oncast;

import java.util.Comparator;

/**
 * Classe utilizada como comparador de edições.
 * @author Cássio
 *
 */
public class EditionComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		if(o1.getEditionYear() < o2.getEditionYear()){
			return -1;
		}
		else if(o1.getEditionYear() > o2.getEditionYear()){
			return 1;
		}
		return 0;
	}

}
