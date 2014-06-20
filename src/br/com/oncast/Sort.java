package br.com.oncast;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Classe implementa a interface BooksOrderer
 * e trás método responsável pro ordenar a lista
 * de livros
 * 
 * @author Cássio
 *
 */
public class Sort implements BooksOrderer{
	
	private Config cfg;
	
	public Sort(Config cfg){
		super();
		this.cfg = cfg;
	}
	
	/**
	 * Método ordena a lista de livros de acordo com a configuração fornecida
	 * @param books ArrayList<Book> lista a ser ordenada
	 * @see Sort
	 */
	@Override
	public void order(ArrayList<Book> books) throws IllegalStateException{
		if(cfg == null){
			throw new OrderingException("Houve um erro ao carregar as configurações");
		}
		if(cfg.isEdition() == true){
			if(cfg.isAuthor() == true){
				if(cfg.isTitle() == true){
					Collections.sort(books, new TitleComparator());
					if(cfg.getTitleType() == "descendente"){
						Collections.reverse(books);
					}
				}
				Collections.sort(books, new AuthorComparator());
				if(cfg.getAuthorType() == "descendente"){
					Collections.reverse(books);
				}
			}
			Collections.sort(books, new EditionComparator());
			if(cfg.getEditionType() == "descendente"){
				Collections.reverse(books);
			}
		}
		else{
			if(cfg.isAuthor() == true){
				if(cfg.isTitle() == true){
					Collections.sort(books, new TitleComparator());
				}
				Collections.sort(books, new AuthorComparator());
			}
			else{
				if(cfg.isTitle() == true){
					Collections.sort(books, new TitleComparator());
					if(cfg.getTitleType() == "descendente"){
						Collections.reverse(books);
					}
				}
				else{
					System.out.println("");
				}
			}
		}
		
	}
	
}
